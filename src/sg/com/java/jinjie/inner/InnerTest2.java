package sg.com.java.jinjie.inner;

/*how to define the inner test*/
public class InnerTest2 {
	public static void main(String[] args){
		Bar bar = new Bar();
		Bar bar2 = new Bar("hello");
	}
}

class Boo{
	Boo(String s){
		System.out.println("Boo String Initial");
	}
	
	Boo(){
		System.out.println("Boo Initial");
	}
}

class Bar extends Boo{
	Bar(){
		System.out.println("Bar Initial");
	}
	Bar(String s){
		//super(s);//if there is no this method, the default envokation parent method is Boo();
		System.out.println("Bar String Initial");
	}
	void zoo(){
		Boo f = new Bar(){};// This is anonymous inner class
		Boo f2 = new Bar("hello"){};
		//Boo f3 = new Bar(24){};
		
		/*Boo f = new Bar();
		Boo f2 = new Bar("");*/ //also OK
	}
}