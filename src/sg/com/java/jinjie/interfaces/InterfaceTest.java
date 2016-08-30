package sg.com.java.jinjie.interfaces;

public class InterfaceTest {
	public static void main(String[] args){
		MusicCup musicCup = new MusicCup();
		musicCup.addWater(100);
		musicCup.drinkWater(50);
		System.out.println("The left water: " + musicCup.waterContent());
		musicCup.play();
	}
}

interface Cup{
	void addWater(int w);
	void drinkWater(int w);
}

interface MusicPlayer{
	void play();
}

class MusicCup implements Cup, MusicPlayer{
	public void addWater(int w){
		this.water = this.water + w;
	}
	
	public void drinkWater(int w){
		this.water = this.water - w;
	}
	
	public int waterContent(){
		return this.water;
	}
	
	public void play(){
		System.out.println("la...la...la...");
	}
	
	private int water = 0;
}