
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Izzy
 */
public class ChangeHistory {
    ArrayList<Double> states;
    
    public ChangeHistory(){
        this.states = new ArrayList<>();
    }
    
    public void add(double status){
        states.add(status);
    }
    
    public void clear(){
        states.clear();
    }
    
    @Override
    public String toString(){
        return states.toString();
    }
    
    public double maxValue(){
        if(states.isEmpty()){
            return 0.0;
        }
        return Collections.max(states);
    }
    
    public double minValue(){
         if(states.isEmpty()){
            return 0.0;
        }
        return Collections.min(states);
    }
    
     public double average(){
         if(states.isEmpty()){
            return 0.0;
        }
     
         double sum=0;
        for(double num: states){
            sum+=num;
     }
        return sum/states.size();
}
}