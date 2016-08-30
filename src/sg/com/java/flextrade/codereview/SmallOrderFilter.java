package sg.com.java.flextrade.codereview;

import java.util.List;

public class SmallOrderFilter extends LargeOrderFilter{

	public SmallOrderFilter(OrderWriter orderWriter, List<Order> orders) {
		super(orderWriter, orders);
		filterSize = "10";
	}
}
