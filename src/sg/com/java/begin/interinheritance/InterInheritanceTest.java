package sg.com.java.begin.interinheritance;

public class InterInheritanceTest {
	public static void main(String[] args){
		
	}
}

interface Cup{
	void addWater(int w);
	void drinkWater(int w);
}

interface Player{
	void play();
}

interface MetricCup extends Cup{
	void WaterContent();
}

interface MusicCup extends Cup, Player{
	void display();
}
