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
 * ��̬���� ����������ʱ���ɵ�class����������ʱ������ṩһ��interface������ Ȼ���class��������ʵ������Щinterface�� 
 * �㵱Ȼ���԰Ѹ�class��ʵ��������Щinterface�е��κ�һ�����á� ��Ȼ�������Dynamic 
 * Proxy��ʵ����һ��Proxy��������������ʵ���ԵĹ����� ����������ʵ��ʱ������ṩһ��handler�������ӹ�ʵ�ʵĹ����� 
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
