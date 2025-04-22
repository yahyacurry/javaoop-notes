package TaskManagerSolution;
import java.util.ArrayList;
import java.util.Scanner;
public class Solution {


    class Task {
        private String title;
        private String description;
        private int dueDate;
        private String reminders;
        private boolean isCompleted;

        public Task(String title, String description,  int dueDate) {
            this.title = title;
            this.description = description;
            this.dueDate = dueDate;
            this.reminders = "Is due today";
            this.isCompleted = false;
        }

        public void markCompleted() {
            isCompleted = true;
        }

        public boolean isCompleted() {
            return isCompleted;
        }

        public String getStatus() {
            return isCompleted ? "Completed" : "Pending";
        }

        public void display(int index) {
            System.out.println("[" + index + "] " + title + " - " + getStatus());
            System.out.println("Description: " + description);
        }
    }

    class TaskManager {
        private ArrayList<Task> tasks;
        private Scanner scanner;

        public TaskManager() {
            tasks = new ArrayList<>();
            scanner = new Scanner(System.in);
        }

        public void start() {
            while (true) {
                System.out.println("\n=== Task Manager ===");
                System.out.println("1. Add Task");
                System.out.println("2. View Tasks");
                System.out.println("3. Complete Task");
                System.out.println("4. Delete Task");
                System.out.println("5. Exit");
                System.out.print("Choose: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // clear buffer

                switch (choice) {
                    case 1 -> addTask();
                    case 2 -> viewTasks();
                    case 3 -> completeTask();
                    case 4 -> deleteTask();
                    case 5 -> {
                        System.out.println("Goodbye!");
                        return;
                    }
                    default -> System.out.println("Invalid choice.");
                }
            }
        }

        private void addTask() {
            System.out.print("Enter title: ");
            String title = scanner.nextLine();
            System.out.print("Enter description: ");
            String description = scanner.nextLine();
            System.out.println("Enter Due Date: ");
            int dueDate = scanner.nextInt();
            tasks.add(new Task(title, description, dueDate));
            System.out.println("Task added successfully!");
        }

        private void viewTasks() {
            if (tasks.isEmpty()) {
                System.out.println("No tasks yet.");
                return;
            }
            System.out.println("\nTasks:");
            for (int i = 0; i < tasks.size(); i++) {
                tasks.get(i).display(i + 1);
                System.out.println();
            }
        }

        private void completeTask() {
            if (tasks.isEmpty()) {
                System.out.println("No tasks to complete.");
                return;
            }
            viewTasks();
            System.out.print("Enter task number to complete: ");
            int index = scanner.nextInt() - 1;
            if (index >= 0 && index < tasks.size()) {
                tasks.get(index).markCompleted();
                System.out.println("Marked task as completed!");
            } else {
                System.out.println("Invalid task number.");
            }
        }

        private void deleteTask() {
            if (tasks.isEmpty()) {
                System.out.println("No tasks to delete.");
                return;
            }
            viewTasks();
            System.out.print("Enter task number to delete: ");
            int index = scanner.nextInt() - 1;
            if (index >= 0 && index < tasks.size()) {
                tasks.remove(index);
                System.out.println("Task deleted.");
            } else {
                System.out.println("Invalid task number.");
            }
        }
    }

    public class Main {
        public void main(String[] args) {
            TaskManager manager = new TaskManager();
            manager.start();}
    }

}
