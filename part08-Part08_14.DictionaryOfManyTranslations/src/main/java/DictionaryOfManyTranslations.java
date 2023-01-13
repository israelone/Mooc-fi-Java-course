
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
public class DictionaryOfManyTranslations {
    
    private HashMap<String, ArrayList<String>> dictionary;
    
    public DictionaryOfManyTranslations(){
        dictionary = new HashMap();
    }
    
    public void add(String word, String translation){
        this.dictionary.putIfAbsent(word, new ArrayList());
        
        if(!dictionary.get(word).contains(translation)){
            dictionary.get(word).add(translation);
        }
        
    }
    
    public ArrayList<String> translate(String word){
        if(dictionary.containsKey(word)){
            return dictionary.get(word);
           
        }
        return new ArrayList();
    }
    
    public void remove(String word){
        dictionary.remove(word);
    }
}
