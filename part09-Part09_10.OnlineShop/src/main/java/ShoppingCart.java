
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Izzy
 */
public class ShoppingCart {
    private Map<String, Item> items;
    
    public ShoppingCart(){
        items = new HashMap();
    }
    
    public void add(String product, int price){
      if(items.containsKey(product)){
          System.out.print("yes");
          items.get(product).increaseQuantity();
      }else{
         items.put(product, new Item(product, 1, price));
      }
    }
    
    public int price(){
      int price = 0;
      for (Item item: items.values()) {
          price = price + item.price();
          
}
      return price;
   }
    
    public void print(){
       for (String item: items.keySet()) {
         System.out.println(items.get(item));
        }
    }
    
}
