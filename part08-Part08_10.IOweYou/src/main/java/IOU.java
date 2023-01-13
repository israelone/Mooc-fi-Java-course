
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Izzy
 */
public class IOU {
     private HashMap<String, Double> hashmap;

    public IOU(){
        this.hashmap = new HashMap<>();

    }
    public void setSum(String toWhom, double amount){
        
        if(this.hashmap.containsKey(toWhom)){
            hashmap.replace(toWhom, amount);
        }else{
               hashmap.put(toWhom, amount);
        }
     
        
    }
    
    public double howMuchDoIOweTo(String toWhom){
        double amountOwed = this.hashmap.getOrDefault(toWhom, 00.00);
        return amountOwed;
    }
    
}
