package sg.com.java.interv.coupling;

//Coupling is a measure of how much a class is depedent on other classes,
//There should minimal dependencies between classes.
//Consider the example below

class ShoppingCartEntry{
	public float price;
	public int quantity;
}

class ShoppingCart{
	public ShoppingCartEntry[] itemes;
}

class Order{
	private ShoppingCart cart;
	private float salesTax;
	
	public Order(ShoppingCart cart, float salesTax){
		this.cart = cart;
		this.salesTax = salesTax;
	}
	
	//This method know the internal details of ShoppingCartEntry and
	//ShoppingCart classes. If there is any change in any of those
	//classes, this method also needs to change.
	public float orderTotalPrice(){
		float cartTotalPrice = 0;
		for(int i=0; i<cart.itemes.length; i++){
			cartTotalPrice += cart.itemes[i].price * cart.itemes[i].quantity;
		}
		
		cartTotalPrice += cartTotalPrice * salesTax;
		return cartTotalPrice;
	}
}

public class CouplingTest {

}
