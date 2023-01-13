import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        while (true) {

            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];
            System.out.println(command);

            if (parts.length == 2) {
                int amount = Integer.valueOf(parts[1]);
                if (amount > 0) {
                    if (command.equals("add")) {
                        if (first + amount > 100) {
                            first = 100;
                        } else {
                            first = first + amount;
                        }
                    } else if (command.equals("move")) {
                        if (amount > first) {
                            second = first;
                            first = 0;

                        }else{
                            first = first - amount;
                            if(second + amount>100){
                                second =100;
                            }else{
                                second = second +amount;
                            }
                        }

                    } else if (command.equals("remove")) {
                        if(amount <= second){
                        second = second - amount;
                        }
                    }
                }
            }
            if (parts[0].equals("quit")) {
                break;
            }

        }

    }
}
