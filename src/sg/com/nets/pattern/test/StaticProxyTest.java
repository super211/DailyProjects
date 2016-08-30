package sg.com.nets.pattern.test;

interface Subjectss{
	public void request();
}

class RealSubjectss implements Subjectss{

	@Override
	public void request() {
		// TODO Auto-generated method stub
		System.out.println("This is a real subjects");
	}
	
}

class StaticProxy implements Subjectss{
	RealSubjectss rs;
	
	public StaticProxy(){
		
	}
	
	public void preRequest(){
		System.out.println("Before the envocation of request");
	}
	
	public void postRequest(){
		System.out.println("After the envocation of request");
	}
	
	@Override
	public void request() {
		// TODO Auto-generate method stub
		preRequest();
		
		if(rs == null){
			rs = new RealSubjectss();
		}
		rs.request();
		
		postRequest();
	}
	
}

public class StaticProxyTest {
	public static void main(String[] args){
		Subjectss sub = new StaticProxy();
		sub.request();
	}
}
