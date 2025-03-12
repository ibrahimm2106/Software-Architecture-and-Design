package com.epic.equity.controllers;

import com.epic.equity.business.StockDataFetcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {
    
    @Autowired
    private StockDataFetcher stockDataFetcher;

    @GetMapping("/stock/{symbol}")
    public String getStockData(@PathVariable String symbol) {
        return stockDataFetcher.fetchStockData(symbol);
    }
}
