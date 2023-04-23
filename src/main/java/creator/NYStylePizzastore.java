package creator;

import product.*;


public class NYStylePizzastore extends PizzaStore {
   protected Pizza createPizza(String item){
       Pizza pizza = null;
       PizzaIngredientFactory ingredientFactory = new NYPizzaIngridientFactory();
       if (item.equals("cheese")){
           pizza = new CheesePizza(ingredientFactory);
           pizza.setName("NYCheesePizza");
       } else if (item.equals("clam")){
           pizza = new ClamPizza(ingredientFactory);
           pizza.setName("NYClamPizza");
       } return pizza;
   }
}
