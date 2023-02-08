
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        List<String> input = new ArrayList();
        String stringCombined  = "";
        
        while(true){
            String row = scanner.nextLine();
            
           if(Integer.valueOf(row)< 0){
               break;
           }
           input.add(row);
        }
        
        stringCombined = input.stream().mapToInt(n -> Integer.valueOf(n)).filter(n-> n > 0 && n <6).mapToObj(n->((Integer)n).toString()).reduce("", (previousString, word)->previousString + word + "\n");
       System.out.println(stringCombined);
    }
}
