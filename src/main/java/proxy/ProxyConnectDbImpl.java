package proxy;

public class ProxyConnectDbImpl implements ConnectDb {

    private ConnectDbImpl connectDbImpl;
    private String dbName;

//    public ProxyConnectDbImpl(String dbName) {
//        this.dbName = dbName;
//    }

    @Override
    public String getConnectDb(String dbName) {
        if (connectDbImpl == null) {
            connectDbImpl = new ConnectDbImpl();
            connectDbImpl.getConnectDb(dbName);
        }

        return connectDbImpl.getConnectDb(dbName);
    }
}
