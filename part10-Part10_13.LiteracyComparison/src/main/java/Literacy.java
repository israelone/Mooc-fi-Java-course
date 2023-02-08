/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Izzy
 */
public class Literacy {
    private double average;
    private String country;
    private int year;
    private String gender;
    
    public Literacy(String country, int year, String gender, double average){
        this.country = country;
        this.year= year;
        this.gender = gender;
        this.average = average;
    }
    
    
    public String getCountry(){
        return country;
    }
    
    public int getYear(){
        return year;
    }
    
    public String getGender(){
        return gender;
    }
    
    public double getAverage(){
        return average;
    }
    
    
    @Override
    public String toString(){
        return country + " " + "(" + year + ")," + gender + ", " + average;
    }
    
}
