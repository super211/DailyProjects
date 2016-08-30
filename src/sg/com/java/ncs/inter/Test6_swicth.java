package sg.com.java.ncs.inter;

public class Test6_swicth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char digit = 'a';
		for(int i=0; i<10; i++){
			switch(digit){
			case 'x':
			{
				int j = 0;
				System.out.println(j);
			}
			default:
			{
				int j = 100;
				System.out.println(j);
			}
			}
		}
		int i = 0;
		System.out.println(i);
	}

}
