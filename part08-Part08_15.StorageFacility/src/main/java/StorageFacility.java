
import java.util.ArrayList;
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
public class StorageFacility {
    HashMap<String, ArrayList<String>> storageFacility;
    
    public StorageFacility(){
    storageFacility = new HashMap();
    }
    
    public void add(String unit, String item){
        storageFacility.putIfAbsent(unit, new ArrayList<String>());
        
        storageFacility.get(unit).add(item);
        
    }
    
    public ArrayList<String> contents(String storageUnit){
        if(storageFacility.containsKey(storageUnit)){
                    return storageFacility.get(storageUnit);

        }
        return new ArrayList<>();
    }
    
    public void remove(String storageUnit, String item){
        storageFacility.get(storageUnit).remove(item);
        
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> inUseStorageUnits= new ArrayList(); 
       storageFacility.forEach((k, v) ->{
           if(!v.isEmpty()){
               inUseStorageUnits.add(k);
           }
       });
       
       return inUseStorageUnits;
    } 
}
