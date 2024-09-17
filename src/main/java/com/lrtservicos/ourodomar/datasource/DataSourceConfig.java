package com.lrtservicos.ourodomar.datasource;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;
import java.util.Properties;

public class DataSourceConfig {

    private static Connection connection;
    private static DataSourceConfig config;

    public static DataSourceConfig newInstance() {
        if (Objects.isNull(config)) {
            config = new DataSourceConfig();
        }
        return config;
    }

    protected Properties jdbcConectLoadProperties() {
        Properties properties = System.getProperties();
        try {
            properties.load(getClass().getClassLoader()
                    .getResourceAsStream("datasourcedb.properties"));
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }

        return properties;
    }

    public Connection begin2() {
        try {
            Class.forName(jdbcConectLoadProperties().getProperty("driver"));
            connection = DriverManager.getConnection(jdbcConectLoadProperties().getProperty("url"), jdbcConectLoadProperties());
        } catch (ClassNotFoundException | SQLException e) {
            throw new IllegalArgumentException(e);
        }
        return connection;
    }

    public Connection begin() {
        try {
            MysqlDataSource ds = jdbcConectDataSource();
            connection = ds.getConnection();
            return connection;
        } catch (SQLException e) {
            throw new IllegalArgumentException("Nao foi possivel conectar: " + e);
        }

    }

    public static synchronized MysqlDataSource jdbcConectDataSource() {
        MysqlDataSource ds = new MysqlConnectionPoolDataSource();
        ds.setServerName("172.17.0.2");
        ds.setDatabaseName("ourodomar");
        ds.setUser("root");
        ds.setPortNumber(3306);        
        ds.setPassword("root");
        ds.setUrl("jdbc:mysql://172.17.0.2:3306/ourodomar");
        return ds;
    }

    public boolean commit() {
        try {
            connection.close();
            return true;
        } catch (SQLException ex) {
            return false;
        }

    }
}
