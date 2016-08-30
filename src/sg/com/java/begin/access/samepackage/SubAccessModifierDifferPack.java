package sg.com.java.begin.access.samepackage;

import sg.com.java.begin.access.differpackage.AccessModifierDifferPack;

public class SubAccessModifierDifferPack extends AccessModifierDifferPack {
	public static void main(String[] args){
		SubAccessModifierDifferPack subAccessModifierDifferPack = new SubAccessModifierDifferPack();
		subAccessModifierDifferPack.publicVariable = 0;
		subAccessModifierDifferPack.protectedVariable = 0;
		//subAccessModifierDifferPack.defaultVariable = 0;
		
		Bird.fly();
		Flyer flyer = new Flyer(){
			@Override
			public void fly() {
				System.out.println("Flyer is flying");
				
			};
		
		};
		flyer.fly();
	}
}

interface Flyer{
	int i = 0;
	public void fly();
}

abstract class Bird{
	static void fly(){
		System.out.println("flying");
	}
}