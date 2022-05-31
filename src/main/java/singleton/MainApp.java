package singleton;

import singleton.SimpleSingleton;

public class MainApp {
    public static void main(String[] args) {

        // Конструктор вызовется один раз
        SimpleSingleton singleton = SimpleSingleton.getInstance();
        SimpleSingleton singleton1 = SimpleSingleton.getInstance();
    }
}
