package com.epic.equity.data;

import org.springframework.stereotype.Component;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class DatabaseConnector {
    
    @Autowired
    private DataSource dataSource;

    public DataSource getConnection() {
        return dataSource;
    }
}
