package sg.com.java.jinjie.inner.statics;

public class StaticTest {
	public static void main(String[] args){
		Human.Mongolian him = new Human.Mongolian();
		him.Shout();
	}
}

class Human{
	static class Mongolian{
		public void Shout(){
			System.out.println("Oh...Ho...");
		}
	}
}