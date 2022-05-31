package factory;

public class CoffeeFactory {
    public Coffee makeCoffee(CoffeeType coffeeType) {
        Coffee coffee = null;
        switch (coffeeType) {
            case AMERICANO ->  coffee =  new Americano();
            case ESPRESSO -> coffee = new Espresso();
            default -> throw new IllegalArgumentException("У нас только 2 вида кофе");
        }

        return coffee;
    }
}
