package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Calendar; 
import java.util.Date;  
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
public class Task {
    String name, description, status;
    Member created_by, assigned_to;
    List<Task> subtasks =  new ArrayList<>();
    String textColor = "White";
    int day, month;
    Calendar created_on = Calendar.getInstance(); 
    Calendar due_date = Calendar.getInstance();
    Task(String name, String description, String duemonth, String dueday, String status, Member created_by, Member assigned_to, List<Task> subtasks) {
        this.name = name;
        this.description = description;
        day = Integer.parseInt(dueday);
        month = Integer.parseInt(duemonth);
        due_date.set(Calendar.MONTH, month);
        due_date.set(Calendar.DATE, day);
        this.status = status;
        this.created_by = created_by;
        this.assigned_to = assigned_to;
        this.subtasks = subtasks;

    }

    Task(String name, String description, String duemonth, String dueday, boolean status, Member created_by, Member assigned_to) {
        this.name = name;
        this.description = description;
        day = Integer.parseInt(dueday);
        month = Integer.parseInt(duemonth);
        due_date.set(Calendar.MONTH, month);
        due_date.set(Calendar.DATE, day);
        if (status)
            this.status = "Completed";
        else
            this.status = "In Progress";
        this.created_by = created_by;
        this.assigned_to = assigned_to;
    }

    public void addSubtask(Task subtask){
        subtasks.add(subtask);

    }
    public String getSubtaskNames()
    {
        String subTaskNames = "| ";
        if(subtasks.isEmpty())
            return subTaskNames;
        for(Task task: subtasks)
            subTaskNames += task.getName() + " | ";
        return subTaskNames;
         //String hi = "hip";
        //return hi;//subTaskNames;

    }

    public String getName()
    {
        return name;
    }

    public String getTextColor() {
        return textColor;
    }

    public Member getAssigned_to() {
        return assigned_to;
    }

    public Member getCreated_by() {
        return created_by;
    }

    public String getCreated_on() {
    Date date = created_on.getTime();  
    DateFormat dateFormat = new SimpleDateFormat("MM.dd");  
    String strDate = dateFormat.format(date);

        return  strDate;
           }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public List <Task> getSubtasks() {
        return subtasks;
    }

    public String getDue_date() {
    due_date.add(Calendar.MONTH, -1);
    Date date = due_date.getTime();  
    DateFormat dateFormat = new SimpleDateFormat("MM.dd");  
    String strDate = dateFormat.format(date);
    return strDate;
    }

    public void assignColor(String textColor)
    {
        this.textColor = textColor;
    }
/*
    public String getInfo()
    {
        String info = "Name: " + name + "\nDescription: " + description + "\nDue Date: " + due_date +  "\nAssigned To: " + assigned_to.getUsername() +
                "\nCreated On" + created_on +"\nCreated By: " + created_by.getUsername() + "\nStatus: " + status + "\nSubtasks: " +subtasks.getName();
        return info;
    }
    */
    public void Edit(String name,String description,String duemonth, String dueday,boolean status,Member created_by,Member assigned_to)
    {
    System.out.print("here");
        this.name = name;
        this.description = description;
        day = Integer.parseInt(dueday);
        month = Integer.parseInt(duemonth);
        due_date.set(Calendar.MONTH, month);
        due_date.set(Calendar.DATE, day);
        if (status)
            this.status = "Completed";
        else
            this.status = "In Progress";
        this.created_by = created_by;
        this. assigned_to = assigned_to;
        subtasks = null; //subtasks not necessary
    }
}
