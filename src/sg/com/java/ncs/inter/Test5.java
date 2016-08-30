package sg.com.java.ncs.inter;

public class Test5 {
	public static void main(String[] args){
		int Output = 10;
		boolean b1 = false;
		if((b1 == true)&&(Output += 10) == 20){
			System.out.println("We are equal" + Output);
		}else{
			System.out.println("Not equal " + Output);
		}
	}
}
