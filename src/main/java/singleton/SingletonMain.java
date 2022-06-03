package singleton;

public class SingletonMain {
    public static void main(String[] args) {

        SimpleSingleton singleton = SimpleSingleton.getInstance();
        SimpleSingleton singleton1 = SimpleSingleton.getInstance();
        System.out.println(singleton == singleton1);
    }
}
