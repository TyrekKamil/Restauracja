import java.util.ArrayList;
import java.util.List;

public class Waiter_Tablet {
private List<Order> listOfOrders = new ArrayList<Order>();

public void addToOrder(Order order){
    this.listOfOrders.add(order);
}

public void removeFromOrder(Order order){
    this.listOfOrders.remove(order);
}

public void showOrders(){
    for(Order a: listOfOrders){
        System.out.println(a.getFullOrder());
    }
}
}
