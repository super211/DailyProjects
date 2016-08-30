package sg.com.java.begin.encapsulation;

public class encapsulationTest {
	public static void main(String[] args){
		Human aPerson = new Human(160);
		System.out.println(aPerson.getHeight());
		
		aPerson.growHeight(170);
		System.out.println(aPerson.getHeight());
		aPerson.repeatBreath(100);
		
		//System.out.println(aPerson.height);
	}
}

class Human{
	public Human(int h){
		this.height = h;
		System.out.println("I'm born");
	}
	
	public int getHeight(){
		return this.height;
	}
	
	public void growHeight(int h){
		this.height = this.height + h;
	}
	
	private void breath(){
		System.out.println("hu...hu...");
	}
	
	public void repeatBreath(int rep){
		for(int i=0; i<rep; i++){
			this.breath();
		}
	}
	
	private int height;
}