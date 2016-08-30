package sg.com.java.begin.datamember;

public class MemberTest {
	
	public static void main(String[] args){
		Human aPerson = new Human();
		System.out.println(aPerson);
	}
	
}

class Human{
	int getHeight(){
		//return this.height;
		return height;
	}
	
	void growHeight(int h){
		this.height = this.height + h;
	}
	
	void breath(){
		System.out.println("hu...hu...");
	}
	
	void repeatBreath(int rep){
		for(int i=0; i<rep; i++){
			this.breath();
		}
	}
	
	int height;
}
