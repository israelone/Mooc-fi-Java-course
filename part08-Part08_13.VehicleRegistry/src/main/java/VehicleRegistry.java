
import java.util.ArrayList;
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
public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> listOfLicensePlates;

    public VehicleRegistry() {
        this.listOfLicensePlates = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        if(this.listOfLicensePlates.containsKey(licensePlate)){
            return false;
        } else {
           this.listOfLicensePlates.put(licensePlate, owner);
           return true;
        }
    }
    
    public String get(LicensePlate licensePlate){
        for (Map.Entry<LicensePlate, String> plate : this.listOfLicensePlates.entrySet()) {
            if (plate.getKey().equals(licensePlate)) {
                return plate.getValue();
            }
        }
        
        return null;
    }
    
    public boolean remove(LicensePlate licensePlate){
        if(!this.listOfLicensePlates.containsKey(licensePlate)){
            return false;
        }else{
            this.listOfLicensePlates.remove(licensePlate);
            return true;
        }
    }
    
    public void printLicensePlates(){
        for(LicensePlate key: this.listOfLicensePlates.keySet()){
            System.out.println(key.toString());
        }
    }
    
    public void printOwners(){
        ArrayList<String> alreadyPrinted = new ArrayList<>();
        
        for(LicensePlate key: this.listOfLicensePlates.keySet()){
            String owner = this.listOfLicensePlates.get(key);
                if(!alreadyPrinted.contains(owner)){                 
                    System.out.println(owner);
                    alreadyPrinted.add(owner);
                }
        }
    }
    
}
