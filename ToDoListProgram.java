import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> toDoList = new ArrayList<>();
        
        boolean isRunning = true;
        
        while (isRunning) {
            System.out.println("To-Do List Program");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. View items");
            System.out.println("4. Quit");
            System.out.print("Select an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    System.out.print("Enter item to add: ");
                    String newItem = scanner.nextLine();
                    toDoList.add(newItem);
                    System.out.println("Item added.");
                    break;
                case 2:
                    System.out.println("Current items:");
                    for (int i = 0; i < toDoList.size(); i++) {
                        System.out.println((i + 1) + ". " + toDoList.get(i));
                    }
                    System.out.print("Enter the number of the item to remove: ");
                    int indexToRemove = scanner.nextInt();
                    if (indexToRemove >= 1 && indexToRemove <= toDoList.size()) {
                        toDoList.remove(indexToRemove - 1);
                        System.out.println("Item removed.");
                    } else {
                        System.out.println("Invalid item number.");
                    }
                    break;
                case 3:
                    System.out.println("Current items:");
                    for (int i = 0; i < toDoList.size(); i++) {
                        System.out.println((i + 1) + ". " + toDoList.get(i));
                    }
                    break;
                case 4:
                    isRunning = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please select again.");
            }
        }
        
        scanner.close();
    }
}
