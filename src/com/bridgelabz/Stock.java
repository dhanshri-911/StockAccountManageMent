package com.bridgelabz;

import java.util.Scanner;

public class Stock {
    private String stockName;
    private static int noOfStocks;
    private int noOfShares;
    private int sharePrice;

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public static int getNoOfStocks() {
        return noOfStocks;
    }

    public static void setNoOfStocks(int noOfStocks) {
        Stock.noOfStocks = noOfStocks;
    }

    public int getNoOfShares() {
        return noOfShares;
    }

    public void setNoOfShares(int noOfShares) {
        this.noOfShares = noOfShares;
    }

    public int getSharePrice() {
        return sharePrice;
    }
    public void setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
    }
    void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.println("Enter the company name: ");
        stockName = scan.nextLine();
        System.out.println("Enter the number of shares: ");
        noOfShares = scan.nextInt();
        System.out.println("Enter the share price: ");
        sharePrice = scan.nextInt();
    }
    public static void main(String[] args) {
        StockPortfolio portfolio = new StockPortfolio();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of stocks :");
        setNoOfStocks(scan.nextInt());
        for(int i = 0; i < getNoOfStocks(); i++) {
            Stock stock = new Stock();
            stock.input();
            portfolio.addStock(stock);
        }
        portfolio.infoPortfolia();
    }

    }

