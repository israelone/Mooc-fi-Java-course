
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
public class Herd implements Movable {
    
    private ArrayList<Movable> organisms;
    
    public Herd(){
        organisms = new ArrayList<>();
    }
    
    public String toString(){
        String organismsPosition="";
        for(Movable organism: organisms){
           organismsPosition = organismsPosition + organism +"\n";
           
        }
        return organismsPosition;
    }
    
    public void addToHerd(Movable movable){
         organisms.add(movable);
    }

    public void move(int dx, int dy){
        for(Movable organism: organisms){
           organism.move(dx, dy);
        }
    }

}
