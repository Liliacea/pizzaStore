package product;

public class ChicagoPizzaIngridientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThickDough();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSause();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
}
