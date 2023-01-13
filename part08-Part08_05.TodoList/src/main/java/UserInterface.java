/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author Izzy
 */
class UserInterface {
    private TodoList todoList;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.todoList = list;
        this.scanner=scanner;
    }
    
    public void start(){
     
        while(true){
            String command = this.scanner.nextLine();
            System.out.println("Command: "+ command);
            if(command.equals("stop")){
                         break;
            }else if(command.equals("add")){
                String task = this.scanner.nextLine();
                System.out.println("To add: "+task);
                this.todoList.add(task);
            }else if(command.equals("list")){
                this.todoList.print();
            }else{
                 String taskIndex = this.scanner.nextLine();
                System.out.println("Which one is removed? "+taskIndex);
                this.todoList.remove(parseInt(taskIndex));
            }
        }
    }
}
