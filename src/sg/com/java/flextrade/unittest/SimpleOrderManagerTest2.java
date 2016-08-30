package sg.com.java.flextrade.unittest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class SimpleOrderManagerTest2 {
	
/*	private OrderStore orderStore;

	private OrderWriter orderWriter;
	
	private SimpleOrderManager simpleOrderManager;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("globalInit");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("globalDestroy");
	}

	@Before
	public void setUp() throws Exception {
		simpleOrderManager = new SimpleOrderManager(orderStore, orderWriter);
		System.out.println("init invoked");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("destroy invoked");
	}

	@Test
	public void testSimpleOrderManager() {
		fail("Not yet implemented");
	}

	@Test(expected = NullPointerException.class)
	public void testWriteAllOrders() {
		simpleOrderManager.writeAllOrders();
		//fail("Not yet implemented");
	}*/

	SimpleOrderManager simpleOrderManager;

	@Before
	public void setUp() throws InvalidOperationException {
		OrderStore orderStore = new DefaultOrderStore();
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
		//fail("Not yet implemented");
	}
}

/*class DefaultOrderStore implements OrderStore {

	@Override
	public List<Order> getOrders() {
		// 这里通常是调用DAO，比如查DB或者其他数据源获得list
		List list = new ArrayList<Order>();
		list.add(new Order());

		return list;
	}

}*/
