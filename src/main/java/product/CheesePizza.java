package product;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
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

