package sg.com.nets.pattern.proxy.dynamiccglib;

/*
 * *****NEED TO IMPORT SPRING2.5.5 & CGLIB2.1.3(inside the "spring-framework-2.5.5-with-dependencies")******
 */
import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

interface PersonService {
	public void save();
}

class PersonServiceImpl implements PersonService {
	public void save() {
		System.out.println("人员增加");
	}
}

/**
 * 使用CGLIB动态代理
 */
class PersonProxy implements MethodInterceptor {
	private Object target;

	// 返回一个代理类对象
	public Object createProxyInstance(Object target) {
		this.target = target;
		Enhancer enhancer = new Enhancer();

		// 设置目标类为父类，会覆盖目标类的非final方法
		enhancer.setSuperclass(this.target.getClass());

		// 回调方法
		enhancer.setCallback(this);

		// 创建代理对象
		return enhancer.create();
	}

	// 上述代码中调用的this就是当前代理对象，会自动调用该方法
	// 方法一
	@Override
	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		Object result = null;
		System.out.println("前置通知");
		try {
			result = method.invoke(target, args);
			System.out.println("后置通知");
		} catch (Exception e) {
			System.out.println("例外通知——出错啦");
		} finally {
			System.out.println("最终通知——结束啦");
		}
		return result;
	}
}

class PersonProxy2 implements MethodInterceptor {
	private Object target;

	// 返回一个代理类对象
	public Object createProxyInstance(Object target) {
		this.target = target;
		Enhancer enhancer = new Enhancer();

		// 设置目标类为父类，会覆盖目标类的非final方法
		enhancer.setSuperclass(this.target.getClass());

		// 回调方法
		enhancer.setCallback(this);

		// 创建代理对象
		return enhancer.create();
	}

	// 方法二
	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		Object result = null;
		System.out.println("前置通知");
		try {
			result = proxy.invokeSuper(obj, args);
			System.out.println("后置通知");
		} catch (Exception e) {
			System.out.println("例外通知——出错啦");
		} finally {
			System.out.println("最终通知——结束啦");
		}
		return result;
	}
}

public class CglibDynamicProxyTest {
	public static void main(String[] args) {
		PersonProxy cglib = new PersonProxy();
		PersonService ps1 = (PersonService) cglib
				.createProxyInstance(new PersonServiceImpl());
		ps1.save();
		System.out.println("--------------------");
		PersonProxy2 cglib2 = new PersonProxy2();
		PersonService ps2 = (PersonService) cglib2
				.createProxyInstance(new PersonServiceImpl());
		ps2.save();
	}
}