package sg.com.java.begin;

public class ArrayInitTest {

	public static void main(String[] args) {
		//As to Array is fixed length, so
		// a.it should specify the length, OR
		String a[] = new String[10];		
		int b[] = new int[10];
		for(int i = 0; i<10; i++){
			System.out.println(a[i] + " " + b[i]);
		}
		//for String Array, its default value is null
		//for Int Array, its default value is 0
		
		// b) default to specify the length
		String c[] = new String[]{"hello", "world"};
		for(String str : c){
			System.out.println(str);
		}
		
		String d[] = new String[]{}; // can be used for avoiding null
		System.out.println("String Length: " + d.length);
		for(String str : d){
			System.out.println("empty Str: " + str);
		}
	}

}
