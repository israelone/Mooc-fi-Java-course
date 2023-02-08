
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        List<Book> list = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
        String bookName = scanner.nextLine();
        System.out.print("Input the name of the book, empty stops: " + bookName +"\n");
        if(bookName.isEmpty()){
            Comparator<Book> comparator = Comparator.comparing(Book::getAge).thenComparing(Book::getName);
            scanner.close();
            System.out.println(list.size() + " books in total." +"\n");
            Collections.sort(list, comparator);
            list.forEach((book)->{System.out.println(book.getName() + " (recommended for " + book.getAge() + "year-olds or older)");});
            break;
        }else{
            String age = scanner.nextLine();         
            System.out.print("Input the age recommendation: " + age +"\n");
            list.add(new Book(bookName, Integer.valueOf(age)));
        }
    }        
          
    }

}
