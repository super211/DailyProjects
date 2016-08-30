package sg.com.java.testing;

interface SingtelStaticInter{
	public void execute();
}

class SingtelStatic implements SingtelStaticInter{

	@Override
	public void execute() {
		System.out.println("executing...");
	}
	
}

class SingleStaticProxy implements SingtelStaticInter{
	
	private SingtelStaticInter singtelStaticInter;
	
	public SingleStaticProxy(SingtelStatic singtelStatic){
		this.singtelStaticInter = singtelStatic;
	}

	@Override
	public void execute() {
		System.out.println("Before single excuting");
		singtelStaticInter.execute();
	    System.out.println("After single excuting");
	}
	
}

class MultipleStaticProxy implements SingtelStaticInter{

	private SingtelStaticInter singtelStaticInter;
	
	public MultipleStaticProxy(SingtelStaticInter singtelStaticInter){
		this.singtelStaticInter = singtelStaticInter;
	}
	
	@Override
	public void execute() {
		System.out.println("Before multiple excuting");
		singtelStaticInter.execute();
		System.out.println("After multiple excuting");
	}
	
}

public class SingleStaticTest {
	public static void main(String[] args){
		SingleStaticProxy signtelStaticProxy = new SingleStaticProxy(new SingtelStatic());
		MultipleStaticProxy multipleStaticProxy = new MultipleStaticProxy(signtelStaticProxy);
		//signtelStaticProxy.execute();
		multipleStaticProxy.execute();
	}
}
