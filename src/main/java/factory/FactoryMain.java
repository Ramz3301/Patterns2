package factory;

public class FactoryMain {

    public static void main(String[] args) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        CoffeeMachine coffeeMachine = new CoffeeMachine(coffeeFactory);
        coffeeMachine.getDrink(CoffeeType.ESPRESSO);
    }
}
