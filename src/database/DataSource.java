package database;

import java.sql.Connection;

public class DataSource {

    private String driverClassName = "org.postgresql.Driver";
    private String host = "193.193.92.209";
    private String dbname = "2014_zapior_patryk";
    private String url = "jdbc:postgresql://" + host + "/" + dbname;
    private String username = "2014_zapior_patryk";
    private String password = "24603";

    private Connection connection = null;

    public DataSource() {

    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDbname() {
        return dbname;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
