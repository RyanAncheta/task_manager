
import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    private static ArrayList<Task> tasks =  new ArrayList<>();
    private static final  String FILENAME = "tasks.txt";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Task Manager Menu:");
            System.out.println("1. Add a Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Save and Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    listTasks();
                    break;
                case 3:
                    markTaskAsCompleted(scanner);
                    break;
                case 4:

                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();


    }

    private static void addTask(Scanner scanner){
        System.out.println("Enter task name: ");
        String name = scanner.next();
        scanner.nextLine();
        System.out.println("Enter task description: ");
        String description = scanner.next();
        scanner.nextLine();
        System.out.println("Enter task due date (YYYY-MM-DD): ");
        String dueDate = scanner.next();

        Task task = new Task(name, description, dueDate);

        tasks.add(task);
        System.out.println("Task added successfully");
    }

    private static void listTasks(){
        if(tasks.isEmpty()){
            System.out.println("No task found.");
        }else {
            for(int i=0; i<tasks.size();i++){
                System.out.println("Task " + (i+1) + ":\n" + tasks.get(i) + "\n");
            }
        }
    }

    private static void markTaskAsComplete(Scanner scanner){
        listTasks();
        System.out.println("Enter the task number to mark as completed");
        int taskNumber = scanner.nextInt();

        if(taskNumber>= 1 && taskNumber <=tasks.size()){
            Task task = tasks.get(taskNumber - 1);
            task.markAsCompleted();
            System.out.println("Task marked as completed!");
        }else {
            System.err.println("Invalid task number!");
        }
    }
    private static void markTaskAsCompleted(Scanner scanner) {
        listTasks();

        System.out.print("Enter the number of the task to mark as completed: ");
        int taskNumber = scanner.nextInt();

        if (taskNumber >= 1 && taskNumber <= tasks.size()) {
            Task task = tasks.get(taskNumber - 1);
            task.markAsCompleted();
            System.out.println("Task marked as completed!");
        } else {
            System.out.println("Invalid task number.");
        }
    }
}
