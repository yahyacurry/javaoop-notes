package Taskmanager;

public class Task {

    private String title;
    private String description;
    private String status;
    private String dueDate;
    private String reminders;

    public Task(String title, String description, String status, String dueDate){
        this.title = title;
        this.status= "Pending";
        this.description = description;
        this.dueDate = dueDate;
        this.reminders = "Is due today";
    }

    public void completeTasks(){
     status = "completed";
    }

    public void display(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", duedate =" + dueDate +
                '}';
    }
}
