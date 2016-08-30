package sg.com.java.interv.innerclasss;

class OuterClass{
	private int outerClassInstanceVariable;
	
	public void exampleMethod(){
		int localVariable;
		final int finalVariable = 5;
		
		
		//inner class
		class MethodLocalInnerClass{
			//can access class instance variables
			public void method(){
				System.out.println(outerClassInstanceVariable);
				//Cannot access method's no-final local variables
				//localVariable = 5; //Cannot refer to a non-final variable localVariable inside an inner class defined in a different method
				System.out.println(finalVariable);
			}
		}
		
		//Inner class can be considered as the outer class's variable
		//Thus, it only can be used by outer class.
		//MethodLocalInnerClass can be instantiated only in this method
		MethodLocalInnerClass m1 = new MethodLocalInnerClass();
		m1.method();
	}
	
	//MethodLocalInnerClass can be instantiated only in the method where it is declared
	//MethodLocalInnerClass m1 = new MethodLocalInnerClass(); //COMPILER ERROR //MethodLocalInnerClass cannot be resolved to a type
	
	public static class StaticNestedClass{
		private int staticNestedClassVariable;
		
		public int getStaticNestedClassVariable(){
			return staticNestedClassVariable;
		}
		
		public void setStaticNestedClassVariable(int staticNestedClassVariable){
			this.staticNestedClassVariable = staticNestedClassVariable;
		}
		
		public void privateVariablesOfOuterAreNOTAvailable(){
			//outerClassInstanceVariable = 5; //COMPILE ERROR
			System.out.println("Static Inner class ref is: " + OuterClass.StaticNestedClass.this);
		}
	}
	
	public class InnerClass{
		private int innerClassVariable;
		
		public int getInnerClassVariable(){
			return innerClassVariable;
		}
		
		private void setInnerClassVariable(int innerClassVariable){
			this.innerClassVariable = innerClassVariable;
		}
		
		public void privateVariablesOfOuterClassAreAvailable(){
			outerClassInstanceVariable = 5; //We can access the value and change it
			
			System.out.println("Inner class ref is: " + this);
			
			//Accessing outer class reference variable
			System.out.println("Outer class ref is " + OuterClass.this);
		}
	}
	
	public void createInnerClass(){
		//Just use the inner class name to create it
		OuterClass.InnerClass inner = new OuterClass.InnerClass();
		//InnerClass inner = new InnerClass();
		inner.privateVariablesOfOuterClassAreAvailable();
	}
	
	public static void createStaticInnerClass(){
		//OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();
		StaticNestedClass staticNestedClass = new StaticNestedClass();
		staticNestedClass.privateVariablesOfOuterAreNOTAvailable();
	}
}


public class InnerClassTest {
	
	class InnerClass{
		public void display(){
            System.out.println("In Inner Class...");
        }
	}
	
	static class StaticInnerClass{
		public void display(){
			System.out.println("In Static Inner Class...");
		}
	}
	
	public static void main(String[] args){
		OuterClass outerClass = new OuterClass();
		outerClass.createInnerClass();
		
		outerClass.createStaticInnerClass();
		
		//Both below are OK
		InnerClassTest.InnerClass inner =new InnerClassTest().new InnerClass();
		//InnerClass inner = new InnerClassTest().new InnerClass();
		inner.display();
		
		//Both below are OK
		InnerClassTest.StaticInnerClass staticInner = new InnerClassTest.StaticInnerClass();
		//StaticInnerClass staticInner = new StaticInnerClass();
		staticInner.display();
	}
}
