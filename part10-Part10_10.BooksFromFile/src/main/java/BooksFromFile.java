
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.io.FileWriter;
import java.io.IOException;

public class BooksFromFile {
    
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        
    }
    
    public static List<Book> readBooks(String file){
        List<Book> rows = new ArrayList();
        
        try{
            Files.lines(Paths.get(file)).map(row -> row.split(",")).map(info -> new Book(info[0], Integer.valueOf(info[1]), Integer.valueOf(info[2]), info[3])).forEach(info -> rows.add(info));
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
 
        return rows;
    }
}
