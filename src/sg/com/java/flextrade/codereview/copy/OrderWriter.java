package sg.com.java.flextrade.codereview.copy;

import java.util.Collection;

public interface OrderWriter {

    void writeOrders(Collection<Order> orders);

}