import java.util.List;

public class Order {
    private List<String> typeOfFood;
    private Integer numberOfTable;

    public Order(List<String> typeOfFood, Integer numberOfTable) {
        this.typeOfFood = typeOfFood;
        this.numberOfTable = numberOfTable;
    }

    public List<String> getTypeOfFood() {
        return typeOfFood;
    }

    public Integer getNumberOfTable() {
        return numberOfTable;
    }

    public String getFullOrder(){
        return "Jedzenie: " + typeOfFood + " Numer stolika: " + numberOfTable;
    }
}
