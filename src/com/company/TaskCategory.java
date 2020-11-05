package com.company;
import java.util.ArrayList;
import java.util.List;
public class TaskCategory 
{
    String name, description, created_on;
    String taskNames = "";
    Member created_by;
    List<Task> task_category_list = new ArrayList<>();
    TaskCategory(String name, String description, String created_on, Member created_by)
    {
        this.name = name;
        this.description = description;
        this.created_on = created_on;
        this.created_by = created_by;
    }

    public String getTaskNames() {
        return taskNames;
    }

    public void addTaskString(String taskName) // deprecated
    {
        //team.add(member);
        taskNames = taskNames + ",  " + taskName;
    }
    public void addTask(Task task) //linking member to team
    {
        task_category_list.add(task);

        taskNames = taskNames + ",  " + task.getName();
    }
    public void deleteTask(Task task)
    {
        task_category_list.remove(task);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCreated_on() {
        return created_on;
    }

    public Member getCreated_by() {
        return created_by;
    }

    public List<Task> getTask_category_list() {
        return task_category_list;
    }

    public String getInfo()
    {
        String info = "Name: " + name + "\nDescription" + description +
                "\nCreated On: " + created_on + "\nCreated By: " + created_by.getUsername();
        return info;
    }
    public void Edit(String name, String description, String created_on, Member created_by)
    {
        this.name = name;
        this.description = description;
        this.created_on = created_on;
        this.created_by = created_by;
    }
}
