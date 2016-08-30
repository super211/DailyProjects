package sg.com.nets.pattern.proxy;

/*
 * 
 *��������ǲ���ʹ��new��������ʵ�������࣬��û�о���ʵ��������ࡣ�������е����ơ�ģ�塱�����ã�Ŀ���Ǹ������ʽ���������޸��µ��ࡣ�������ɳ�����ֱ�Ӵ�����
 *ֻ����ͨ���������������µ����࣬�������������������󡣵�һ���౻����Ϊ������ʱ��Ҫ�������ǰ��������η�abstract�� �ڳ������еĳ�Ա�������԰���һ�㷽����
 *���󷽷������󷽷�������abstract���εķ��������ַ���ֻ�������ص��������͡��������ƺ�����Ĳ�����û�з����壬Ҳ����˵���󷽷�ֻ��Ҫ����������Ҫʵ�֡���һ��
 *����Ϊ���󷽷�ʱ����ζ������������뱻����ķ�������д������������ĸ÷�����Ȼ��abstract�ģ����������Ҳ�����ǳ���ģ�������Ϊabstract�� �������в�һ��
 *�������󷽷������ǰ������󷽷�����һ��Ҫ������Ϊ�����ࡣ�����౾���߱�ʵ�ʵĹ��ܣ�ֻ���������������ࡣ�������п��԰������췽�������ǹ��췽�����ܱ�����Ϊ���� 
 *���ó������еķ���(���󷽷��ͷǳ��󷽷�)�����������static�ģ�ֱ�� ������.����  �Ϳ����ˣ�����Ƿ�static���������Ҫһ���̳еķǳ����࣬Ȼ��������ǳ������ʵ�������÷�����
 */

/*
 * 
 * 
 * ����Ǿ�̬������ʵ��ɫ�����������Ѿ����ڵģ���������Ϊ���������ڲ����ԡ�����ʵ��ʹ��ʱ��һ����ʵ��ɫ�����Ӧһ�������ɫ���������ʹ�ûᵼ����ļ������ͣ����⣬
 * ������Ȳ���֪����ʵ��ɫ�������ʹ�ô����أ�����������ͨ��Java�Ķ�̬�������������
	��̬�������൱�ڴ����߲�����ֻ�Ǵ���һ����ʵ����Ҳ���Դ���ܶ���󣬶��Ҷ����Ƕ�ָ̬���ġ�
 */

abstract class Subjects{
	public abstract void request();
}

abstract class SubSubjects extends Subjects{
	
}

class RealSubjects extends Subjects{

	public RealSubjects(){
		
	}
	
	@Override
	public void request() {
		// TODO Auto-generated method stub
		
	}
}

class ProxySubjects extends Subjects{
	private RealSubject realSubject;
	
	public ProxySubjects(){
		
	}
	
	private void preRequest(){
		System.out.println("Now doing the preRequest");
	}
	
	private void postRequest(){
		System.out.println("Now doing the postRequest");
	}
	
	@Override
	public void request() {
		// TODO Auto-generated method stub
		
		preRequest();
			
		if(realSubject == null){
			realSubject = new RealSubject();
		}
		
		realSubject.request();
		
		postRequest();
	}
	
}


public class ProxyTest2 {
	public static void main(String[] args){
		Subjects sub = new ProxySubjects();
		sub.request();
	}
}
