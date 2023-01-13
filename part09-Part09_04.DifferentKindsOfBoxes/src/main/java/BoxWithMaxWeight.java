
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
public class BoxWithMaxWeight extends Box{
    
    private int maxWeight;
    private ArrayList<Item> items;
    public BoxWithMaxWeight(int capacity){
       this.maxWeight = capacity;
       items = new ArrayList();
    }
    
    @Override
    public boolean isInBox(Item item){
      return items.contains(item);  
    }

    @Override
    public void add(Item item) {
        int itemWeight = item.getWeight();
       
        if(maxWeight - itemWeight >= 0){
            items.add(item);
            maxWeight = maxWeight - itemWeight;
        }

    }
}
