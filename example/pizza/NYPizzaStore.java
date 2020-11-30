package example.pizza;

public class NYPizzaStore extends PizzaStore {

    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return null;
        } else if (item.equals("pepperoni")) {
            return null;
        } else {
            return null;
        }
    }
}
