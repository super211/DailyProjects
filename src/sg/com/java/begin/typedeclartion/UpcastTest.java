package sg.com.java.begin.typedeclartion;

public class UpcastTest {
	public static void main(String[] args){
		Cup aCup;
		BrokenCup aBrokenCup = new BrokenCup();
		aCup = aBrokenCup; //upcast
		aCup.addWater(10); //method binding
	}
}

class Cup1{
	public void addWater(int w){
		this.water = this.water + w;
	}
	
	public void drinkWater(int w){
		this.water = this.water - w;
	}
	
	private int water = 0;
}

class BrokenCup extends Cup{
	public void addWater(int w){
		System.out.println("Shit, broken cup");
	}
	
	public void drinkWater(int w){
		System.out.println("com...num..., no water inside");
	}
}