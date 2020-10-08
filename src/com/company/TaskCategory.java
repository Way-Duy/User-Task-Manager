package com.company;
import java.util.ArrayList;
import java.util.List;
public class TaskCategory 
{
    String name, description, created_on;
    Member created_by;
    List<Task> task_category = new ArrayList<>();
    TaskCategory(String name, String description, String created_on, Member created_by)
    {
        this.name = name;
        this.description = description;
        this.created_on = created_on;
        this.created_by = created_by;
    }
    public void addTask(Task task)
    {
        task_category.add(task);
    }
    public void deleteTask(Task task)
    {
        task_category.remove(task);
    }
    public String getInfo()
    {
        String info = "Name: " + name + "\nDescription" + description +
                "\nCreated On: " + created_on + "\nCreated By: " + created_by.getUsername();
        return info;
    }
}
