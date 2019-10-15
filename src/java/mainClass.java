import java.util.*;
public class mainClass {
    static HashMap<String, Integer> listOfTypesOfFood = new HashMap<String, Integer>();
    public static void main(String[] args) throws InterruptedException {
        initList();
        Waiter_Tablet waiter_tablet = new Waiter_Tablet();
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        while(choice != 9){
            System.out.println(showMenu());
            choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    showFoodMenu();
                    int foodChoice = scanner.nextInt();
                    List<String> orderFood = new ArrayList<String>();
                    Integer price = 0;
                    do {
                        orderFood.add(getNameOfFood(foodChoice));
                        price = price + getPrice(foodChoice);
                        System.out.println(getNameOfFood(foodChoice) + " " + getPrice(foodChoice) + " zl");
                        foodChoice = scanner.nextInt();
                    } while(foodChoice<8);
                    Order order = new Order(orderFood, price);
                    waiter_tablet.addToOrder(order);
                    System.out.println(order.getFullOrder());
                    break;
                case 2:
                    System.out.println("Wybierz zamówienie, które zostało przygotowane" + "\n[0] Wróć do menu");
                    getUnpreparedOrders(waiter_tablet);
                    int preparedFoodId = scanner.nextInt();
                    if(preparedFoodId==0 || preparedFoodId>waiter_tablet.getListOfOrders().size()){
                        break;
                    } else {
                        System.out.println(preparedFoodId);
                        waiter_tablet.getListOfOrders().get(preparedFoodId-1).makePrepared();
                    }
                    break;
                case 3:
                    System.out.println("Wybierz zamówienie, które zostało zrealizowane" + "\n[0] Wróć do menu");
                    getPreparedOrders(waiter_tablet);
                    int foodToRemove = scanner.nextInt();
                    System.out.println("[1] - Platnosc karta\n[2] - Platnosc gotowka\n[Inne] - Powrot");
                    int payWithCard = scanner.nextInt();
                    while(payWithCard == 1 || payWithCard == 2){
                        if(payWithCard==1){
                            System.out.println("Przybliz karte do czytnika");
                            Thread.sleep(2000);
                            System.out.println("Platnosc zaakceptowana");
                        } else if(payWithCard==2) {
                            System.out.println("Zaplacono gotowka");
                        }
                        if(foodToRemove==0 || foodToRemove>=waiter_tablet.getListOfOrders().size()){
                            break;
                        } else {
                            waiter_tablet.getListOfOrders().remove(waiter_tablet.getOrderById(foodToRemove-1));
                            break;
                        }
                    }
                    break;
                case 4:
                    getAllOrders(waiter_tablet);
                    break;
                case 9:
                    System.out.println("Power off");
                    break;
                default:
                    System.out.println("Blad");
                }
            }
    }

    private static String showMenu(){
        return "##########################################\n" +
               "[1] Dodaj zamowienie\n" +
               "[2] Zamowienie zrealizowane\n" +
               "[3] Zaplata\n" +
               "[4] Lista zamówień\n" +
               "[9] Wyjdz z programu\n" +
               "##################################" +
                "#############\n";
    }

    private static String getNameOfFood(int foodChoice){
        return listOfTypesOfFood.keySet().toArray()[foodChoice-1].toString();
    }
    private static Integer getPrice(int foodChoice){
        return (Integer) listOfTypesOfFood.values().toArray()[foodChoice-1];
    }

    private static void showFoodMenu(){
        System.out.println("##########################################\n");
        for (int i = 1; i <= listOfTypesOfFood.size(); i++){
            System.out.println("[" + (i) + "] " + getNameOfFood(i) + " " + getPrice(i) + " zl");
        }
    }

    private static void initList(){
        listOfTypesOfFood.put("Kotlet drobiowy • ziemniaki", 13);
        listOfTypesOfFood.put("Kotlet zapiekany z ananasem • ziemniaki • sałatka", 15);
        listOfTypesOfFood.put("Zupa ogórkowa", 8);
        listOfTypesOfFood.put("Zupa grzybowa", 8);
        listOfTypesOfFood.put("Danie dnia", 10);
        listOfTypesOfFood.put("Szklanka wody", 4);
        listOfTypesOfFood.put("Coca-cola", 6);
    }
    private static void getAllOrders(Waiter_Tablet waiter_tablet){
        getUnpreparedOrders(waiter_tablet);
        System.out.println("##########################");
        getPreparedOrders(waiter_tablet);
    }

    private static void getPreparedOrders(Waiter_Tablet waiter_tablet){
        for (int i = 0; i<waiter_tablet.listByCondition(Order.Stan.PRZYGOTOWANY).size(); i++){
            System.out.println("[" + (i+1) + "] " + waiter_tablet.listByCondition(Order.Stan.PRZYGOTOWANY).get(i).getFullOrder());
        }
    }

    private static void getUnpreparedOrders(Waiter_Tablet waiter_tablet){
        for (int i = 0; i<waiter_tablet.listByCondition(Order.Stan.NIEPRZYGOTOWANY).size(); i++){
            System.out.println("[" + (i+1) + "] " + waiter_tablet.listByCondition(Order.Stan.NIEPRZYGOTOWANY).get(i).getFullOrder());
        }
    }
}
