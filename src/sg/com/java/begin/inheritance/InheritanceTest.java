

package sg.com.java.begin.inheritance;

public class InheritanceTest {
	public static void main(String[] args){
		Woman aWoman = new Woman();
		aWoman.growHeight(120);
		System.out.println(aWoman.getHeight());
		aWoman.height = 160;
		
		aWoman.breath();
	}
}

class Human{
	public Human(){
		
	}
	
	public Human(int height){
		this.height = height;
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
	
	//protected int height;
	private int height;
}

class Woman extends Human{
	
	public Woman(){
		super();
	}
	
	public Woman(int height) {
		super(height);
		System.out.println("Hello, Pandora!");
	}

	/*public int getHeight(){
		return this.height;
	}
	
	public void growHeight(int h){
		this.height = this.height + h;
	}*/
	
	public void breath(){
		super.breath();
		System.out.println("su...su...");
	}
	
	public Human giveBirth(){
		System.out.println("Give birth");
		//this.height;//only can be accessed when the height of base classs is protected
		return (new Human(20));
	}
	
	//private int height;
}