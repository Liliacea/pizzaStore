package product;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected String name;
    public Dough dough;
    protected Sauce sause;
    protected Cheese cheese;
    protected Clams clams;
    protected Pepperoni pepperoni;

   abstract public void prepare();

    public void bake(){
        System.out.println("bake for 25min");
    }
    public void cut(){
        System.out.println("cut diagonal");
    }
    public void box(){
        System.out.println("place in box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
      return "";
    }
}
