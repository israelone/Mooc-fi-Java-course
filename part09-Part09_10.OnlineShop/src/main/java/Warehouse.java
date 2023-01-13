
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Izzy
 */
public class Warehouse {
    private Map<String, Integer> products;
    private Map<String, Integer> productsStock;
    
    public Warehouse(){
        products = new HashMap();
        productsStock = new HashMap();

    }
    
    public void addProduct(String product, int price, int stock){
        products.put(product, price);
        productsStock.put(product, stock);
    }
    
    public int stock(String product){
        if(productsStock.containsKey(product)){
                    return productsStock.get(product);
        }
        return 0 ;
    }
    
    public boolean take(String product){
        
        if(!productsStock.containsKey(product) || productsStock.get(product) == 0){
            return false;
        }else{
        int inStock = productsStock.get(product);
        productsStock.replace(product, inStock, inStock - 1);            
            return true;
        }
    }
    
    public Set<String> products(){
        return products.keySet();
    }
    
    public int price(String product){
        if(!products.containsKey(product)){
            return -99;
        }
       return products.get(product);
    }
}
