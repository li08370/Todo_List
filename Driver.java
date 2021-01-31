import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int act = 0;
        do {
            try {
                System.out.println("what would you like to do with your todo list 1) add, 2)clear all items 3) exit");
                act = input.nextInt();
                switch (act) {
                    case 1 -> list.add(addTask());
                    case 2 -> list.clear();
                    case 3 -> System.out.println("exit recognized");
                    default ->  System.out.println("Enter one an adequate input designated on the menu");
                }
            }catch(InputMismatchException ie) {
                    System.out.println("Excetion: invalid input value");
            }
            System.out.println("Tasks: ");
            if(list.isEmpty()) {
                System.out.println("Empty");
            }else{
                for (int i = 0; i < list.size(); i++) {
                    System.out.println((i + 1) + ") " + list.get(i));
                }
            }
            input.nextLine();
        } while (act != 3) ;
    }

    public static String addTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("what would like to add to your to do list?");
        String task = scanner.nextLine();
        System.out.println("");
        return task;
    }
}


