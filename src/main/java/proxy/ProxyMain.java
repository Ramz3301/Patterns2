package proxy;

public class ProxyMain {
    public static void main(String[] args) {
        ConnectDb connectDb = new ProxyConnectDbImpl("students");
        System.out.println(connectDb.getConnectDb("students"));

    }
}
