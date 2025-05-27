package com.mac190.Stock;

/*
 * Design a class Ameritrade to be a Broker. Implement the methods buy and sell so that
 * only stocks can be bought and add $1 fees for the entire purchase
 * If not stock should display an error message.
 *
 */
public class RobinHood extends Broker implements iBroker{
    @Override
    public void buy(String t, String type, int s, float p) {
        //if type is not "STK" or "stk", then throw Exception "Can only buy Stocks"
        if(!type.equalsIgnoreCase("stk")) {
            throw new IllegalArgumentException("Can only buy Stocks");
        }
        if(getHoldings() == null)
        {
            throw new IllegalArgumentException("The holdings is not initialized");
        }
        //check if the ticket t already exists in holdings, if it does
        Security se = null;
            for (int i = 0; i < getHoldings().size(); i++) {
                if (t.equalsIgnoreCase(getHoldings().get(i).getTicker())) {
                    se = getHoldings().get(i);
                    se.setPrice((se.getPrice() * se.getShares() + p * s + 1) / (se.getShares() + s));
                    se.setShares(se.getShares() + s);
                    return;
                }
            }

        float newPrice = (p * s + 1) / s;
        se = new Security(t, type, s, newPrice);
        //compute the new price as (oldPrice*oldNumberShares + (p*s+ fees))/(oldNumbershares + s)
        //update number shares and new price
        //if t does not exist already
        //create a new Security with t, type and s and the price as (p*s+fees)/s
        //add the security to the list of holdings.
        getHoldings().add(se);

    }

    @Override
    public double sell(String t, String type, int s, float p) {
        //if type is not "STK" throw and exception wrong type
        if(!type.equalsIgnoreCase("stk")) {
            throw new IllegalArgumentException("Can only sell Stocks");
        }
        //check if t exists in the list of holdings, if it doesn't then throw an exception
        Security se = null;
        for (Security security : getHoldings()) {
            if (t.equalsIgnoreCase(security.getTicker())) {
                se = security;
                break;
            }
        }
        if (se == null) {
            throw new IllegalArgumentException("Can't sell what you don't have!");
        }
        //"cannot sell what you don't have"
        //if it does exist, then
        //if s is larger than the number of shares in the list, then display a message
        double total = 0;
        if(se.getShares() < s) {
            total = se.getPrice() * se.getShares();
            System.out.println("You are trying to sell more than you have! So, closing the position.");
            System.out.println("The " + se.getShares() + " shares of " + t + " will be sold at total$: " + total);
            getHoldings().remove(se);
            return total;
        }
        //Trying to sell more than what you have. So closing position.
        //compute the proceedings as number of share in the list* p.
        //remove the security from the list and return the proceedings
        //if you are trying to sell less than you have, then
        //compute the proceedings as s*p.
        //subtract s from the number of share in the security in the list
        //return proceedings.
        total = se.getPrice() * s;
        if(s == se.getShares()) {
            System.out.println("You are trying to sell all you have: $" + total);
            getHoldings().remove(se);
            return total;
        }
        se.setShares(se.getShares() - s);
        System.out.println("You successfully sold stocks total of $" + total);

        return total;
    }
}