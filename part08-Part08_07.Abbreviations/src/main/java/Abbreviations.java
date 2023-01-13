/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
/**
 *
 * @author Izzy
 */
public class Abbreviations {
    
        private HashMap<String, String> abbreviations;

    
    public Abbreviations(){
            this.abbreviations = new HashMap<>();

    }
    
    public void addAbbreviation(String abbreviation, String explanation){
        String abbr = sanitizedString(abbreviation);
        String expl = sanitizedString(explanation);
        if(!hasAbbreviation(abbreviation)){
            this.abbreviations.put(abbreviation, explanation);
        }
    }
    
    public boolean hasAbbreviation(String abbreviation){
        if(this.abbreviations.containsKey(abbreviation)){
            return true;
        };
        return false;
    }
    
    public String findExplanationFor(String abbreviation){
      String abbr = sanitizedString(abbreviation);

        if(hasAbbreviation(abbr)){
            String explanation = this.abbreviations.get(abbr);
            return explanation;
        }
       return null;
    }
    
    public static String sanitizedString(String string) {
        if (string == null) {
            return "";
        }
        
        string  = string.toLowerCase();
        return string.trim();
    }
   
}
