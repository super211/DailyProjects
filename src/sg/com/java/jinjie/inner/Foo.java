package sg.com.java.jinjie.inner;


//test: output:
public class Foo {
	Foo(){
		System.out.println("foo");
	}
	
	void makeBar(){
		(new Bar(){}).go();
	}
	
	class Bar{//inner class
		Bar(){
			System.out.println("bar");
		}
		
		public void go(){
			System.out.println("go");
		}
	}
	
	public static void main(String[] args){
		Foo f = new Foo();
		f.makeBar();
	}
}
