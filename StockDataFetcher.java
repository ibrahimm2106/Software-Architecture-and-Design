package com.epic.equity.business;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StockDataFetcher {
    
    private static final String API_URL = "https://api.example.com/stock?symbol=";

    public String fetchStockData(String symbol) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(API_URL + symbol, String.class);
    }
}
