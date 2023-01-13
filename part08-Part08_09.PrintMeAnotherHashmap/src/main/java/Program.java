
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, Book> hashmap = new HashMap<>();
    }
 
    public static void printValues(HashMap<String,Book> hashmap){
        for(Object value:hashmap.values()){
            System.out.println(value);
        }
        }
        
     public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text){
         for(Object value:hashmap.values()){
             if(value.toString().contains(text)){
               System.out.println(value);
             }

        }
     }
}
