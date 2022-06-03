package proxy;

public class ConnectDbImpl implements ConnectDb {

    private String dbName;

//    public ConnectDbImpl(String dbName) {
//        this.dbName = dbName;
//    }

    @Override
    public String getConnectDb(String dbName) {
        return "Подключено к: jdbc:postgresql://localhost:5432/" + dbName;
    }
}
