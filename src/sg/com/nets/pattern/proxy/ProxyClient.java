package sg.com.nets.pattern.proxy;

import java.lang.reflect.Method;

import java.lang.reflect.InvocationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

interface Subject {
	abstract public void request();
}

class RealSubject implements Subject {

	public RealSubject() {
	}

	public void request() {
		System.out.println(" From real subject. ");
	}
}

class DynamicSubject implements InvocationHandler { //proxy
	private Object sub;

	public DynamicSubject() {
	}

	public DynamicSubject(Object obj) {
		sub = obj;
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println(" before calling  " + method);
		method.invoke(sub, args);

		System.out.println(" after calling  " + method);
		return null;
	}
}

public class ProxyClient {

	public static void main(String[] args) throws Throwable {

		RealSubject rs = new RealSubject(); // 在这里指定被代理类
		InvocationHandler ds = new DynamicSubject(rs);
		Class cls = rs.getClass();

		//以下是一次性生成代理
		Subject subject = (Subject) Proxy.newProxyInstance(
				cls.getClassLoader(), cls.getInterfaces(), ds);
		subject.request();
	}
}
