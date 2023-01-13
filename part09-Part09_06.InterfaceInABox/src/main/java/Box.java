
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
public class Box implements Packable{
    
    private double maxCapacity;
    private ArrayList<Packable> items;
    
    public Box(double maxCapacity){
        this.maxCapacity = maxCapacity;
        items = new ArrayList<>();
    }
    
    @Override
    public double weight() {
        double weight = 0;
        for(Packable item: items){
            weight = weight + item.weight();
        }
        return weight;
    }
    
    public String toString(){
        return "Box: "+items.size()+" items, total weight "+weight()+" kg";
    }
    
    public void add(Packable item){
        
        if(weight() + item.weight() <= maxCapacity){
            items.add(item);
        }
        
    }
    
}
