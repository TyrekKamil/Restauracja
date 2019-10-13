import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Waiter_Tablet {
    private List<Order> listOfOrders = new ArrayList<Order>();

    public void addToOrder(Order order){
        this.listOfOrders.add(order);
    }

    public void removeFromOrder(Order order){
        this.listOfOrders.remove(order);
    }

    public List<Order> getListOfOrders() {
        return listOfOrders;
    }

    public Order getOrderById(Integer id){
        return listOfOrders.get(id);
    }

    public List<Order> listByCondition(Order.Stan stan){
        return this.getListOfOrders().stream()
                .filter(p -> p.getStan() == stan).collect(Collectors.toList());
    }

}
