/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Izzy
 */
public class Organism implements Movable {
    
    int x;
    int y;
    public Organism(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public String toString(){
        return "x: "+x+"; y: "+y;
    }
    
    public void move(int dx, int dy){
        x= x+dx;
        y=y +dy;
    }
    
    
    
}
