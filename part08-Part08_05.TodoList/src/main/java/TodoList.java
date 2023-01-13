/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList; // import the ArrayList class

/**
 *
 * @author Izzy
 */
public class TodoList {
    
    private ArrayList<String> tasks = new ArrayList();
    
    
    public TodoList(){
        
    }
    
    public void add(String task){
        tasks.add(task);
    }
    
    public void print(){
        int x = 1;
        for (String i : tasks) {
        
        System.out.println(x+": "+i);
        x++;
}
    }
    public void remove(int number){
            tasks.remove(number - 1);
    }
}
