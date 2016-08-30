package sg.com.java.jinjie.interfaces;

/*
Illegal modifier for the interface Car; only public & abstract are permitted
Illegal modifier for the interface method start; only public & abstract are permitted
Illegal modifier for the interface field Engine.i; only public, static & final are permitted
*/

//final interface Car{// Illegal
//private interface Car{//Illegal
//protectd interface Car{//Illegal
//public interface Car{//Legal
abstract interface Car{
	public void drive();
}

public class IllegalInterfaceTest {

}
