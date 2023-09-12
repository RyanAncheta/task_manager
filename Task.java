import java.util.Scanner;
public class Task {
    private String name;
    private String description;
    private String dueDate;
    private boolean isCompleted;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public void markAsCompleted(){
        this.isCompleted = true;
    }



    public Task(String name, String description, String dueDate){
        this.name=name;
        this.description=description;
        this.dueDate=dueDate;
        this.isCompleted=false;
    }

    public Task(){
    }

    @Override
    public String toString(){
        return "TaskName: " + name + "\nDescription: " + description + "\nDue Date: " + dueDate + "\nStatus: " + (isCompleted ? "Completed" : "Incomplete");
    }


}
