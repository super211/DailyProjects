/*
 * 1. "SmallOrderFilter extends LargeOrderFilter" cannot be encouraged because there is no inheritance relationship 
 * between them. Suggest to at least add a parent class "OrderFilter" for them. Or add an interface to reduce the 
 * dependencies and make them loosely coupled. Based on the rule of "prefer composition over inheritance", we can also 
 * consider to change it into composition.
 *  
 * 2. Such methods like "toNumber" are not advocated to be added in t he class Order. They can be contained in an 
 * independent UTIL class.
 * 
 * 3. Keep it as simple and pure as possible. The business operations like "Orders Writing" are not encouraged to be put
 * in the Filter classes. Put them into OrderManager is better.
 * 
 * 4. As to the source codes organisation, we can separate them as packages of "service", "dao", and "model", such as 
 * "sg.com.flextrade.service", "sg.com.flextrade.dao", "sg.com.flextrade.model", etc.
 */

package sg.com.java.flextrade.codereview;

import java.util.Collection;

public class DefaultOrderWriter implements OrderWriter {

    public void writeOrders(Collection<Order> orders) {}

}