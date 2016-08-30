package sg.com.nets.pattern.proxy.dynamiccglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

class EmployeeService{
	public void add(){
		System.out.println("EmloyeeService add...");
	}
}

class CglibProxyFactory implements MethodInterceptor{
	private Object target;
	
	public CglibProxyFactory(Object target){
		this.target = target;
	}
	
	public Object getProxy(){
		Enhancer enh = new Enhancer();
		enh.setSuperclass(target.getClass());
		enh.setCallback(this);
		return enh.create();
	}

	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2,
			MethodProxy arg3) throws Throwable {
		System.out.println("Complete the log");
		return arg1.invoke(target, arg2);
	}
}

public class CglibDynamicProxyTest3 {
	public static void main(String[] args){
		
		//no proxy
		EmployeeService service = new EmployeeService();
		service.add();
		
		//cglib dynamic proxy
		//EmployeeService service2 = new EmployeeService();
		CglibProxyFactory factory = new CglibProxyFactory(service);
		EmployeeService serviceProxy = (EmployeeService)factory.getProxy();
		serviceProxy.add();
	}
}
