/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Ruben Garcia Quintana
 */
import java.util.Date;

public class ExchangeRate {
    
    private Currency from;
    private Currency to;
    private Date date;
    private double rate;

    public ExchangeRate(Currency from, Currency to, Date date, double rate) {
        this.from = from;
        this.to = to;
        this.date = date;
        this.rate = rate;
    }
    

    public Currency getFrom() {
        return from;
    }

    public Currency getTo() {
        return to;
    }

    public Date getDate() {
        return date;
    }

    public double getRate() {
        return rate;
    }
    

    
}
