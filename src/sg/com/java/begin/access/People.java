package sg.com.java.begin.access;

public class People{
	private int age;
	public String name;
	String family;
	protected String member;
	public void how(){
		this.age = 10;
	}
	
	public void print(){
		how();
		System.out.println(age);
	}
}