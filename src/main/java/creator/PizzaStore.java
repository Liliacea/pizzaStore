package creator;

import product.Pizza;

public abstract class PizzaStore {
  /*  creator.SimplePizzaFactory factory;

    public creator.PizzaStore(creator.SimplePizzaFactory factory) {
        this.factory = factory;
    }

   */
    public Pizza orderPizza (String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        return pizza;
    }
    abstract Pizza createPizza (String type);
}
