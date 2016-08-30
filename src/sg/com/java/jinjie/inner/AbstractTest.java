package sg.com.java.jinjie.inner;


//test: inner class can be static/public/abstract
public class AbstractTest {
	public int getNum(){
		return 45;
	}
	
	public abstract class Bar{
		public int getNum(){
			return 38;
		}
	}	
	
	/*static abstract class Bar{ // static is also OK
		public int getNum(){
			return 38;
		}
	}*/
	
	public static void main(String[] args){
		AbstractTest t = new AbstractTest(){
			public int getNum(){
				return 22;
			}
		};
		
		AbstractTest.Bar f = t.new Bar(){
			public int getNum(){
				return 57;
			}
		};
		
		/*Bar f = new Bar(){
			public int getNum(){
				return 57;
			}
		};*/
		
		System.out.println(f.getNum() + " " + t.getNum());
	}
}
