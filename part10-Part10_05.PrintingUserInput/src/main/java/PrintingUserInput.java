
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = new ArrayList();
        String stringCombined  = "";
        
        while(true){
            String row = scanner.nextLine();
            
           if(row.equals("")){
               break;
           }
           input.add(row);
        }
        
        stringCombined = input.stream().reduce("", (previousString, word)->previousString + word + "\n");
       System.out.println(stringCombined);
        
    }
}
