package product;

import product.Dough;

public class NYPizzaIngridientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {

        return new ThihDough();
    }

    @Override
    public Cheese createCheese() {
        return new Regiano();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }

    @Override
    public Sauce createSauce() {

        return new Marinara();
    }

    @Override
    public Pepperoni createPepperoni() {

        return new SlicedPepperoni();
    }
}
