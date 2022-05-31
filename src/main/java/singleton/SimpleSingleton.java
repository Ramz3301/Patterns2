package singleton;

public class SimpleSingleton {

    private final static SimpleSingleton singleton = new SimpleSingleton();

    private SimpleSingleton() {
        System.out.println(getClass() + " - Создан объект SimpleSingleton");
    }

    public static SimpleSingleton getInstance() {
        return singleton;
    }

    public static void main(String[] args) {

    }


}
