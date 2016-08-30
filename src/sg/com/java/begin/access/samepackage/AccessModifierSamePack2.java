package sg.com.java.begin.access.samepackage;

import sg.com.java.begin.access.differpackage.AccessModifierDifferPack;



public class AccessModifierSamePack2 {	
	
	public static void main(String[] args){
		AccessModifierDifferPack accessModifierTest1 = new AccessModifierDifferPack();
		//accessModifierTest1.defualtVariable = 0;
		
		AccessModifierSamePack accessModifierTest2 = new AccessModifierSamePack();
		accessModifierTest2.publicVariable = 0;
		accessModifierTest2.protectedVariable = 0;
		accessModifierTest2.defaultVariable = 0;
		//accessModifiertest2.privateVariable = 0;

	}
}
