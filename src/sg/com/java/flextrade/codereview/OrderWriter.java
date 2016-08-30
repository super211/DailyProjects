package sg.com.java.flextrade.codereview;

import java.util.Collection;

public interface OrderWriter {
    void writeOrders(Collection<Order> orders);
}