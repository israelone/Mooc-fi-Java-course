/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Izzy
 */
public class Dog extends Animal {
    
 
    public Dog(String name){
        super(name);
    }
    
    public Dog(){
        super("Dog");
    }
    
    public void bark(){
        System.out.println(name + " barks");
    }
    
    public void eat(){
        System.out.println(name + " eats");

    }

    @Override
    public void makeNoise() {
        bark();
    }
    
    
}
