
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

   
     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> positives= new ArrayList<Integer>();
        double average= 0;
        
      
        while(true){
            String input = scanner.nextLine();
            int num = Integer.parseInt(input);
            if(num==0){
                if(positives.size()==0){
                    System.out.println("Cannot calculate the average");
                    break;
                }else{
                    for(Integer i : positives){
                        average +=i;
                    };
                    System.out.println(average/positives.size());
                    break;
                }
            }else if(num > 0){
                positives.add(num);
            }
        }
    }

}
