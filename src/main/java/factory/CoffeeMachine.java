package factory;

public class CoffeeMachine {

    private final CoffeeFactory coffeeFactory;

    public CoffeeMachine(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee getDrink(CoffeeType coffeeType) {
        Coffee coffee = coffeeFactory.makeCoffee(coffeeType);
        System.out.println("Ваш кофе, сэр: " + coffeeType.getClass());
        return coffee;
    }

}
