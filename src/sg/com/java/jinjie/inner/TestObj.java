package sg.com.java.jinjie.inner;

//This code would be legal if line 11 ended with a semicolon
public class TestObj {
	public static void main(String[] args){
		Object o = new Object(){
			public boolean equals(Object obj){
				return true;
			}
		};//semicolon cannot be missed
		System.out.println(o.equals("Fred"));
	}
}
