import creator.ChicagoStylePizzaStore;
import creator.NYStylePizzastore;
import creator.PizzaStore;

public class Solution {
    public static void main(String[] args) {
        PizzaStore ny = new NYStylePizzastore();
        ny.orderPizza("cheese");
        PizzaStore chicago = new ChicagoStylePizzaStore();
        chicago.orderPizza("clam");

    }
}
