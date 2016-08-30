package sg.com.java.jinjie.tostring;

class Animal{
	
	private String name;
	private String type;
	
	public Animal(String name, String type){
		this.name = name;
		this.type = type;
	}
	
	public String toString(){
		return "Animal [name=" + name + ",type="+type+"]"; 
	}
}

public class ToStringTest {

	public static void main(String[] args) {
		Animal animal = new Animal("Tommy", "Dog");
		System.out.println(animal);
	}

}
