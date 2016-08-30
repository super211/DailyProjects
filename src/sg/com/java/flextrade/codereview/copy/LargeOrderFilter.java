package sg.com.java.flextrade.codereview.copy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargeOrderFilter {

    private OrderWriter orderWriter;

    private List<Order> orders;



    public LargeOrderFilter(OrderWriter orderWriter, List<Order> orders) {

        filterSize = "100";

        this.orderWriter = orderWriter;

        this.orders = orders;

    }



   protected String filterSize;



   public void writeOutFiltrdAndPriceSortedOrders(OrderWriter writer) {

       List<Order> filteredOrders = this.filterOrdersSmallerThan(orders, filterSize);

       Collections.sort(filteredOrders, new Comparator() {

               @Override

               public int compare(Object o1, Object o2) {

                   Order order1 = (Order)o1;

                   Order order2 = (Order)o2;

                   return (int)(order1.getPrice() - order2.getPrice());

               }

           });

       writer.writeOrders(filteredOrders);

   }



  protected List<Order> filterOrdersSmallerThan(List<Order> allOrders, String size) {

       List<Order> filtered = new ArrayList<Order>();

       for (int i = 0; i <= allOrders.size(); i++) {

           int number = orders.get(i).toNumber(size);



           if (allOrders.get(i).getSize() <= number) {

               continue;

           } else {

               filtered.add(orders.get(i));

           }

       }



       return filtered;

   }

}