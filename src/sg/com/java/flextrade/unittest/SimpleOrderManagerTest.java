package sg.com.java.flextrade.unittest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SimpleOrderManagerTest {

	private SimpleOrderManager simpleOrderManager;

	@Before
	public void setUp() throws InvalidOperationException {
		// OrderStore orderStore = new DefaultOrderStore();
		// use anonymous class to mock the interface of OrderStore
		OrderStore orderStore = new OrderStore() {
			@Override
			public List<Order> getOrders() {
				// here usually to envoke the DAO，for getting the list from DB or other data source
				List list = new ArrayList<Order>();
				list.add(new Order());

				return list;
			}
		};
		OrderWriter orderWriter = new DefaultOrderWriter();
		simpleOrderManager = new SimpleOrderManager(orderStore, orderWriter);
	}

	@Test
	public void testWriteAllOrders() {
		simpleOrderManager.writeAllOrders();
	}

	@Test(expected = NullPointerException.class)
	public void testWriteAllOrders2() {
		OrderStore orderStore = null;
		OrderWriter orderWriter = null;
		simpleOrderManager = new SimpleOrderManager(orderStore, orderWriter);
		simpleOrderManager.writeAllOrders();
	}
}

/*
 * class DefaultOrderStore implements OrderStore {
 * 
 * @Override public List<Order> getOrders() { // 这里通常是调用DAO，比如查DB或者其他数据源获得list
 * List list = new ArrayList<Order>(); list.add(new Order());
 * 
 * return list; }
 * 
 * }
 */
