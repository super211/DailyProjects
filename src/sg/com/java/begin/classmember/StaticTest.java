package sg.com.java.begin.classmember;

public class StaticTest {
	public static void main(String[] args){
		System.out.println(Human.getPopulation());
		Human aPerson = new Human(160);
		Human aPerson1 = new Human(160);
		Human aPerson2 = new Human(160);
		Human aPerson3 = new Human(160);
		Human aPerson4 = new Human(160);
		System.out.println(aPerson.getPopulation());
	}
	
}

class Human{
	public Human(int h){
		this.height = h;
		Human.population = Human.population + 1;
	}
	
	public int getHeight(){
		return this.height;
	}
	
	public void growHeight(int h){
		this.height = this.height + h;
	}
	
	public void breath(){
		System.out.println("hu...hu...");
	}
	
	public static int getPopulation(){
		return Human.population;
	}
	
	
	private int height;
	private static int population;
	private static boolean is_mammal = true;
}