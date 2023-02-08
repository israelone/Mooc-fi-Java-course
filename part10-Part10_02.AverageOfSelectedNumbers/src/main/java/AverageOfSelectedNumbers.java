
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<String> inputs = new ArrayList();
        
        while(true){
            String row = scanner.nextLine();
            if(row.equals("end")){
                break;
            }
            inputs.add(row);
           
            
        }
        
         System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
         String nOrP=scanner.nextLine();
         double average=0;
            if(nOrP.equals("n")){
               average = inputs.stream().mapToInt(n -> Integer.valueOf(n)).filter(n-> n < 0 ).average().getAsDouble();
                System.out.println("Average of the negative numbers: "+average);


            }else{
                average = inputs.stream().mapToInt(n -> Integer.valueOf(n)).filter(n-> n > 0 ).average().getAsDouble();
                System.out.println("Average of the positive numbers: "+average);

            }
          

    }
}
