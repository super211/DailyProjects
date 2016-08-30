package sg.com.java.begin.datamember;

public class MemberTest2 {
	public static void main(String[] args){
		Human aPerson = new Human();
		System.out.println(aPerson.getHeight());
		aPerson.growHeight(10);
		System.out.println(aPerson.getHeight());
		
		aPerson.repeatBreath(10);
	}
}
