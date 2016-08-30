package sg.com.java.begin.objectreference;

public class ObjectReference {

	public static void main(String[] args){
		Human aPerson = new Human(160);
		Human dummyPerson = aPerson; // difference references point to the same object.
		System.out.println(dummyPerson.getHeight());
		aPerson.growHeight(20);
		System.out.println(dummyPerson.getHeight());
		System.out.println(aPerson.getHeight());
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

