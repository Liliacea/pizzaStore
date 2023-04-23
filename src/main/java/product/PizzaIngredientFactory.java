package product;

import product.Dough;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Cheese createCheese();
    public Clams createClams();
    public Sauce createSauce();
    public Pepperoni createPepperoni();

}
