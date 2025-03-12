package com.epic.equity.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigLoader {
    
    @Value("${database.url}")
    private String databaseUrl;

    public String getDatabaseUrl() {
        return databaseUrl;
    }
}
