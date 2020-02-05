/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author senyo
 */
import java.util.HashMap;
import java.util.Map;

public class CurrencyList {
    
    private Map<String, Currency> currencies = new HashMap<>();

    public CurrencyList() {
        add(new Currency("USD","Dolar americano","$"));
        add(new Currency("EUR","Euro","€"));  
        add(new Currency("GBP", "Libras Esterlinas", "£"));
        
    }
    
    public void add(Currency currency) {
        currencies.put(currency.getCode(), currency);
    }

    public Currency get(String code) {
        return currencies.get(code.toUpperCase());
    }
}