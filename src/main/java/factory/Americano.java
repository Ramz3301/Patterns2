package factory;

public class Americano implements Coffee {

    public Americano() {
        makeCoffee();
    }

    @Override
    public void makeCoffee() {
        System.out.println("Сделай кофе: " + getClass());
    }

}
