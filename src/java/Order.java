import java.util.ArrayList;
import java.util.List;

public class Order {
    public enum Stan {
        PRZYGOTOWANY, NIEPRZYGOTOWANY
    }
    private List<String> typeOfFood;
    private Integer price;
    private Stan stan;

    public Order(List<String> typeOfFood, Integer numberOfTable) {
        this.typeOfFood = typeOfFood;
        this.price = numberOfTable;
        this.stan = Stan.NIEPRZYGOTOWANY;
    }
    public String getFullOrder(){
        return typeOfFood.toString().substring(1,typeOfFood.toString().length()-1) + " " + price + " zl" + " - " + stan;
    }

    public void makePrepared(){
        this.stan = Stan.PRZYGOTOWANY;
    }

    public Stan getStan() {
        return stan;
    }


}
