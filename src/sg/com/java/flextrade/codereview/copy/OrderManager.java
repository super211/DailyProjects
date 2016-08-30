package sg.com.java.flextrade.codereview.copy;

import java.util.List;

public class OrderManager {

    private final OrderStore orderStore;



    public OrderManager(OrderStore orderStore) {

        this.orderStore = orderStore;

    }



    public void writeOutSmallOrders() {

        List<Order> orders = orderStore.getOrders();

       SmallOrderFilter filter = new SmallOrderFilter(new DefaultOrderWriter(), orders);

       filter.writeOutFiltrdAndPriceSortedOrders(new DefaultOrderWriter());

   }



   public void writeOutLargeOrders() {

       List<Order> orders = orderStore.getOrders();

       LargeOrderFilter filter = new LargeOrderFilter(new DefaultOrderWriter(), orders);

       filter.writeOutFiltrdAndPriceSortedOrders(new DefaultOrderWriter());

   }

}
