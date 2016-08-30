package sg.com.java.ncs.inter;

class Tree{}
class Pine extends Tree{}
class Oak extends Tree{}

public class Test8_instance {
	public static void main(String[] args){
		Tree tree = new Pine();
		
		if(tree instanceof Pine)
			System.out.println("Pine");

		if(tree instanceof Tree)
			System.out.println("Tree");
		
		if(tree instanceof Oak)
			System.out.println("Oak");
		else
			System.out.println("Oops");
		
		String s = null;
		if(s instanceof String)
			System.out.println("s is a String");
		
	}
}
