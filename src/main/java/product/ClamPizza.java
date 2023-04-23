package product;

public class ClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare(){
        System.out.println("preparing " + name);
        dough = ingredientFactory.createDough();
        sause = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }

    public void cut(){
        System.out.println("cutted into squere");
    }
}