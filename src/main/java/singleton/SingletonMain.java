package singleton;

public class SingletonMain {
    public static void main(String[] args) {

        // Конструктор вызовется один раз
        SimpleSingleton singleton = SimpleSingleton.getInstance();
        SimpleSingleton singleton1 = SimpleSingleton.getInstance();
    }
}
