/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Izzy
 */
public class Item {
    
    private String productName;
    private int quantity;
    private int unitPrice;
    
    public Item(String product, int qty, int unitPrice){
        this.productName = product;
        this.quantity = qty;
        this.unitPrice = unitPrice;
    }
    
    public int price(){
        return unitPrice * this.quantity;
    }
    
    public void increaseQuantity(){
        quantity = quantity + 1;
    }
    
    public String toString(){
        return productName + ": " +quantity;
    }
}
