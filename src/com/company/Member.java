package com.company;

import java.util.ArrayList;
import java.util.List;

public class Member
{
    private String username, password; //immutable
    private int taskPoints;
    List<Task> task_assigned_list = new ArrayList<>();
    Member(String username, String password)
    {
        this.username = username;
        this.password = password;
        this.taskPoints = 0; // starting taskpoints at 0 when creating a account
    }
    public int getTaskPoints() // return individual task points
    {
        return taskPoints;
    }
    public void completedTask() // add a point for task completed by user
    {
        taskPoints++;
    }
    public void clearTaskPoints() // clear the user points 
    {
        taskPoints = 0;
    }
    public String getTasks()
    {
        String task_names = "| ";
        for(Task task:task_assigned_list) {
            task_names+= task.getName() + " | ";
        }
        return task_names;
    }
    public void assignTask(Task task)
    {
        task_assigned_list.add(task);
    }
    public void deleteTask(Task task)
    {
        task_assigned_list.remove(task);
    }
    public String getUsername()
    {
        return username;
    }
    public String getPassword()
    {
        return password;
    }
    public boolean testPassword(String attempt)
    {
        if (attempt == password)
            return true;
        return false;
    }
    public void changeUsername(String username)
    {

        this.username = username;
    }
    public void changePassword(String password)
    {

        this.password = password;

    }
}
