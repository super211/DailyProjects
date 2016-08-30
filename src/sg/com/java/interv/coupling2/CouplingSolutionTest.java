package sg.com.java.interv.coupling2;

import java.util.List;

//Coupling is a measure of how much a class is depedent on other classes,
//There should minimal dependencies between classes.
//Consider the example below

class ShoppingCartEntry{
	public float price;
	public int quantity;
	
	public float getTotalPrice(){
		return price * quantity;
	}
}

class ShoppingCart{
	//public ShoppingCartEntry[] items;
	List<ShoppingCartEntry> items;
	
	public float getTotalPrice(){
		float totalPrice = 0;
		for(ShoppingCartEntry item:items){
			totalPrice += item.getTotalPrice();
		}
		return totalPrice;
	}
	
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
	/*public float orderTotalPrice(){
		float cartTotalPrice = 0;
		for(int i=0; i<cart.items.length; i++){
			cartTotalPrice += cart.items[i].price * cart.items[i].quantity;
		}
		
		cartTotalPrice += cartTotalPrice * salesTax;
		return cartTotalPrice;
	}*/
	
	public float orderTotalPrice(){
		return cart.getTotalPrice() * (1.0f + salesTax);
	}
}

public class CouplingSolutionTest {

}
