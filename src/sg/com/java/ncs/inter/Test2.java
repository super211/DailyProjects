package sg.com.java.ncs.inter;

class Value{
	public int i = 15;
}

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t = new Test2();
		t.first();
	}

	public void first(){
		int i = 5;
		Value v = new Value();
		v.i = 25;
		second(v, i);
		System.out.println("first:" + v.i);
	}
	
	public void second(Value v, int i){
		i = 0;
		v.i = 20;
		Value val = new Value();
		//System.out.println(val.i);
		v = val;
		System.out.println(v.i + " " + i);
	}
}
