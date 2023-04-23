package creator;

import product.*;


public class ChicagoStylePizzaStore extends PizzaStore {

    protected Pizza createPizza(String item){
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngridientFactory();
        if (item.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("ChicagoCheesePizza");
        } else if (item.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("ChicagoClamPizza");
        } return pizza;
    }
}
