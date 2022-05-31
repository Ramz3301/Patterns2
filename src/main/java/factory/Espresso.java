package factory;

public class Espresso implements Coffee {

    public Espresso() {
        makeCoffee();
    }

    @Override
    public void makeCoffee() {
        System.out.println("Сделай кофе " + getClass());
    }

}
