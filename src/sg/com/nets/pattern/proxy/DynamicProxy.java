package sg.com.nets.pattern.proxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Subjectss{
	public void request();
}

class RealSubjectss implements Subjectss{

	@Override
	public void request() {
		// TODO Auto-generated method stub
		System.out.println("This is the real subjects.");
	}
	
}

/** 
 * 动态代理， 它是在运行时生成的class，在生成它时你必须提供一组interface给它， 然后该class就宣称它实现了这些interface。 
 * 你当然可以把该class的实例当作这些interface中的任何一个来用。 当然啦，这个Dynamic 
 * Proxy其实就是一个Proxy，它不会替你作实质性的工作， 在生成它的实例时你必须提供一个handler，由它接管实际的工作。 
 */  
class DynamicSubjectss implements InvocationHandler{
	private Object sub;
	
	public DynamicSubjectss(Object sub){
		this.sub = sub;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("before calling: " + method);
		method.invoke(sub, args);
		System.out.println("after calling: " + method);
		return null;
	}
}

public class DynamicProxy {
	public static void main(String[] args) {
		RealSubjectss rs = new RealSubjectss();
		Class cls = rs.getClass();
		InvocationHandler handler = new DynamicSubjectss(rs);
		
		/*Class c = Proxy.getProxyClass(cls.getClassLoader(), cls.getInterfaces());
		Constructor ct = c.getConstructor(new Class[]{InvocationHandler.class});
		Subjectss sub = (Subjectss) ct.newInstance(new Object[]{handler});*/
		
		Subjectss sub1 = (Subjectss)Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), handler);
		sub1.request();
		
	}
}
