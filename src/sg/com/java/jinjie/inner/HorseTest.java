package sg.com.java.jinjie.inner;

//test output: Zippo
public class HorseTest {
	public static void main(String[] args){
		class Horse{
			public String name;
			public Horse(String s){
				name = s;
			}
		}
		
		Object obj = new Horse("Zippo");
		Horse h = (Horse)obj;
		System.out.println(h.name);
	}
}
