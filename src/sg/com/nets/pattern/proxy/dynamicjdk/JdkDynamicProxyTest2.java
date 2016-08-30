package sg.com.nets.pattern.proxy.dynamicjdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface UserService{
	void login();
	void regist();
}

class UserServiceImpl implements UserService{
	public void login(){
		System.out.println("user login");
	}
	public void regist(){
		System.out.println("user regist");
	}
}

class ProxyFactory implements InvocationHandler{
	private Object target;
	
	public ProxyFactory(Object target){
		this.target = target;
	}
	
	public Object getProxy(){
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("Complete the log");
		return method.invoke(target, args);
	}
}

public class JdkDynamicProxyTest2 {

	public static void main(String[] args){
		//No Proxy
		UserServiceImpl service = new UserServiceImpl();
		service.login();
		service.regist();
		
		//Jdk Dynamic Proxy
		ProxyFactory factory = new ProxyFactory(service);
		UserService serviceProxy = (UserService)factory.getProxy();
		serviceProxy.login();
		serviceProxy.regist();
	}
}
