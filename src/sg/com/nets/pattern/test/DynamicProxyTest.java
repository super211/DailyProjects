package sg.com.nets.pattern.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


interface Subject{
	public void request();
}

class RealSubject implements Subject{

	@Override
	public void request() {
		// TODO Auto-generated method stub
		System.out.println("This is a real subject");
	}
}

class DynamicProxy implements InvocationHandler{

	private Object sub;
	
	public DynamicProxy(Object sub){
		this.sub = sub;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("before calling: " + method);
		method.invoke(sub, args);
		System.out.println("before calling: " + method);
		return null;
	}
	
}

public class DynamicProxyTest {
	public static void main(String[] args){
		RealSubject rs = new RealSubject();
		Class cls = rs.getClass();
		InvocationHandler handler = new DynamicProxy(rs);
		
		Subject sub = (Subject)Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), handler);
		sub.request();
	}
}