package sg.com.java.testing;

public class Test {
	/*public static void main(String[]args){
		System.out.println("2+2:" +2+2);
		System.out.println("%c%c" +'H'+'a');
		char x = 'X';
		int i = 0;
		System.out.println(true ? x : 0);
		System.out.println(false ? i : x);
		
		final String pig = "length: 10";
		final String dog = "length: " + pig.length();
		System.out.println("Animals are equal: " + (pig == dog));
		
		System.out.println("a\u0022.length() + \u0022b".length());
	}*/
	
		 public static void main(String[] args) {
		 StringBuffer sb = new StringBuffer("Hello ");
		 System.out.println("Before change, sb = " + sb);
		 changeData(sb);
		 System.out.println("After changeData(n), sb = " + sb);
		 }
		 public static void changeData(StringBuffer strBuf) {
		 StringBuffer sb2 = new StringBuffer("Hi ");
		strBuf = sb2;
		 sb2.append("World!");
		 System.out.println("strBuf:" + strBuf);
		 }
		

}
