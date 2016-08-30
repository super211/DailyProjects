package sg.com.java.jinjie.inner.closure;

public class ClosureInnerTest {
	public static void main(String[] args){
		Human me = new Human("Vamei");
		Human him = new Human("Jerry");
		
		Human.Cup myFirstCup = me.new Cup();
		Human.Cup mySecondCup = me.new Cup();
		me.changeName("Bruce");
		Human.Cup hisCup = him.new Cup();
		System.out.println(myFirstCup.whoseCup());
		System.out.println(mySecondCup.whoseCup());
		System.out.println(hisCup.whoseCup());
		
	}
}

class Human{
	
	public Human(String name){
		this.name = name;
	}
	
	class Cup{
		public String whoseCup(){
			return name;
		}
	}

	public void changeName(String name){
		this.name = name;
	}
	
	private String name;
}
