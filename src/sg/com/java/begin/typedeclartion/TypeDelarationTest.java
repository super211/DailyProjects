package sg.com.java.begin.typedeclartion;

public class TypeDelarationTest {
	public static void main(String[] args){
		Human aPerson;
		//aPerson = new Cup();
		aPerson = new Human(169);
	}
}

class Human{
	public Human(int h){
		this.height = h;
	}
	
	public int getHeight(){
		return this.height;
	}
	
	public void growHeight(int h){
		this.height = this.height + h;
	}
	private int height;
}

class Cup{
	public void addWater(int w){
		this.water = this.water + w;
	}
	
	public void drindWater(int w){
		this.water = this.water - w;
	}
	
	private int water = 0;
}