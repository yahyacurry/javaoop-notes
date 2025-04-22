package Taskmanager;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManager {

    List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTasks(String title, String description, String status, String dueDate) {
        this.tasks.add(new Task(title, description, status, dueDate));
        System.out.println("Task Success Fully Added");
    }

    public void deleteTask(int taskNum) {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to delete!");
        }
        if (taskNum >= 1 && taskNum <= tasks.size()) {
            tasks.remove(taskNum - 1);
            System.out.println("Task deleted successfully!");
        } else {
            System.out.println("Invalid task number!");
        }
    }


    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to view!");
        }
        for (int i = 0; i < tasks.size(); i++) {
//            System.out.println("[" + (i + 1) + "] " + "Title: " + tasks.get(i).getTitle() + " Description: " + tasks.get(i).getDescription()+ " Status " + tasks.get(i).getStatus() );
            System.out.println("[" + (i + 1) + "] " + tasks.get(i));
        }
    }

    public void markCompleted(int number) {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to complete!");
        }
        if (number >= 1 && number <= tasks.size()) {
            tasks.get(number - 1).completeTasks();
            System.out.println("Marked task as completed!");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    public void display() {
        Scanner scanner = new Scanner(System.in);
        int response = 0;


        System.out.println("Task Manager");
        System.out.println("[1] Add Tasks");
        System.out.println("[2] View Tasks");
        System.out.println("[3] Complete Tasks");
        System.out.println("[4] Delete Tasks");
        System.out.println("[5] Exits");
        System.out.println("Choose one:");
        response = scanner.nextInt();
        scanner.nextLine();

        if (response == 1) {
            System.out.println("Add Title:");
            String title = scanner.nextLine();
            System.out.println("Add Description:");
            String description = scanner.nextLine();
            System.out.println("Due Date: ");
            int dueDate = scanner.nextInt();
            addTasks(title, description, "Pending", String.valueOf(dueDate));
            if (dueDate > 25 && dueDate<30){
                System.out.println("This Task is due");
            }
            System.out.println("SuccessFully addded");
        }
        if (response == 2) {
            viewTasks();
        }
        if (response == 3) {
            System.out.println("Which Task Would you like to complete?");
            int complete = scanner.nextInt();
            markCompleted(complete);
        }
        if (response == 4) {
            System.out.println("Which Task Would you like to delete?");
            int delete = scanner.nextInt();
            deleteTask(delete);
        }
        if (response == 5) {
            System.out.println("Thanks for visiting");
            System.exit(0);
        }
    }


    public static void main(String[] args) {
        TaskManager TM1 = new TaskManager();
        while (true) {
            TM1.display();
        }
    }
}


