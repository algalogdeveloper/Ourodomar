package com.lrtservicos.ourodomar.migration;

import com.lrtservicos.ourodomar.datasource.DataSourceConfig;
import com.mysql.cj.jdbc.MysqlDataSource;
import org.flywaydb.core.Flyway;

public class CreateDataSourceMigration {
    
    public static void createJdbcMigration() {
        MysqlDataSource ds = DataSourceConfig
                .jdbcConectDataSource();
        Flyway flyway
                = Flyway
                        .configure()
                        .dataSource(ds)
                        .load();
        flyway.migrate();
    }
    
    
  

  
}
