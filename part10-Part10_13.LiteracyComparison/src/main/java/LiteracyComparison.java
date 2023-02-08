
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiteracyComparison {
    
    public static void main(String[] args) {
          List<Literacy> list = new ArrayList();
            try{
            Files.lines(Paths.get("literacy.csv")).map(row -> row.split(",")).map(info -> new Literacy(info[3], Integer.valueOf(info[4]), info[2].replace(" (%)", ""), Double.valueOf(info[5]))).forEach(info -> list.add(info));
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
           list.stream()
                .sorted((i1, i2)->{
                    if(i1.getAverage() == i2.getAverage()){
                        return 0;
                    }else if(i1.getAverage() > i2.getAverage()){
                        return 1;
                    }
                    return -1;
                })
                .forEach(lit -> System.out.println(lit));
    
    }
    
}
  
