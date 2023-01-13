
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Izzy
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory history;
    
   public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        history = new ChangeHistory();
        this.balance = initialBalance;
        addToWarehouse(initialBalance);
    }
    
    public String history(){
        return history.toString();
    }
    
  @Override
    public void addToWarehouse(double amount){
      super.addToWarehouse(amount);
      history.add(getBalance());
    }
    
    @Override
    public double takeFromWarehouse(double amount){
        double received = super.takeFromWarehouse(amount);
        history.add(getBalance());
        return received;
    }
    
    public void printAnalysis(){
        System.out.println("Product: "+this.getName()+"\n"+"History: "+history.toString()+"\n"+"Largest amount of product: "+history.maxValue()+"\n"+"Smallest amount of product: "+history.minValue()+"\n"+"Average: "+history.average());
    }
}
