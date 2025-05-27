package com.mac190.Stock;

import java.util.Locale;
import java.util.Scanner;

public class BrokerTester {
    public static void main(String[] args) {
        Broker stockbroker = new RobinHood();
        Broker currencybroker = new Oanda();
        Scanner sc = new Scanner(System.in);
        String choice = "";
        do {
            System.out.println("What would you like to buy?");
            System.out.println("Currency or Stock?");
            System.out.println("Check your holdings?");
            choice = sc.next().toLowerCase(Locale.ROOT);
            if (choice.contains("stock")) {
                System.out.println("What's the ticker of your stock: ");
                String ticker = sc.next();
                System.out.println("How many shares would you like: ");
                int shares = sc.nextInt();
                System.out.println("How much are you paying: ");
                float price  = sc.nextFloat();
                stockbroker.buy(ticker,"STK",shares,price);
            }
            if (choice.contains("currency")) {
                System.out.println("What currency would you like to buy: ");
                String ticker = sc.next();
                System.out.println("How many shares would you like: ");
                int shares = sc.nextInt();
                System.out.println("How much are you paying: ");
                float price  = sc.nextFloat();
                currencybroker.buy(ticker,"CUR",shares,price);
            }

            if (choice.contains("holdings")) {
               if(stockbroker.getHoldings() == null && currencybroker.getHoldings() == null){
                   throw new NullPointerException("You don't have any holdings");
               }

               if(stockbroker.getHoldings() != null){
                   System.out.println("You are holding stocks: " + stockbroker.getHoldings());
               }
               if(currencybroker.getHoldings() != null){
                   System.out.println("You are holding currencies: " + currencybroker.getHoldings());
               }
                System.out.println("All holdings displayed!");
            }
//            System.out.println("Stock Holdings: " + stockbroker.getHoldings().toString() + "\nCurrency Holdings: "+ currencybroker.getHoldings().toString());
        } while (!choice.contains("quit"));
    }
}