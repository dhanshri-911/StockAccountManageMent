package com.bridgelabz;

import java.util.ArrayList;

public class StockPortfolio {
    private ArrayList<Stock> stockList = new ArrayList<Stock>();

    public void addStock(Stock stock){
        stockList.add(stock);
    }

    public void calculateEachStock() {
        for (Stock stock : stockList) {
            System.out.println("Stock Name :" + stock.getStockName() + "Total Share Value :" + stock.getNoOfShares() * stock.getSharePrice());
        }
    }

        public void totalValueOfStock() {
            int stockValue = 0;
            for (Stock stock : stockList) {
                stockValue += stock.getNoOfShares() * stock.getSharePrice();
                System.out.println("Total num of Shares :" + stockValue);
            }
        }
            public void infoPortfolia(){
                calculateEachStock();
                totalValueOfStock();
            }
        }