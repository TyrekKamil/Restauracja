import java.util.Arrays;

public class mainClass {

    public static void main(String[] args){
        Waiter_Tablet waiter = new Waiter_Tablet();

        waiter.addToOrder(new Order(Arrays.asList("spaghetti,woda".split(",")),1));
        waiter.addToOrder(new Order(Arrays.asList("pizza,coca-cola".split(",")), 3));
        waiter.showOrders();
        // TODO reczne wpisywanie zamowien, przynoszenie, usuwanie etc
    }
}
