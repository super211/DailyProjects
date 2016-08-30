package sg.com.java.flextrade.codereview.copy;

import java.util.List;

public class SmallOrderFilter extends LargeOrderFilter

{

	public SmallOrderFilter(OrderWriter orderWriter, List<Order> orders) {
		
		super(orderWriter, orders);
		filterSize = "10";
		
	}

}
