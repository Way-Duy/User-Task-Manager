package com.company;

public class Task {
    String name, description, due_date, created_on, status;
    Member created_by, assigned_to;
    Task subtasks;
    Task(String name, String description, String due_date, String created_on, String status, Member created_by, Member assigned_to, Task subtasks ){
        this.name = name;
        this.description = description;
        this.due_date = due_date;
        this.created_on = created_on;
        this.status = status;
        this.created_by = created_by;
        this. assigned_to = assigned_to;
        this.subtasks = subtasks;
    }
    Task(String name, String description, String due_date, String created_on, String status, Member created_by, Member assigned_to ){
        this.name = name;
        this.description = description;
        this.due_date = due_date;
        this.created_on = created_on;
        this.status = status;
        this.created_by = created_by;
        this. assigned_to = assigned_to;
        subtasks = null; //subtasks not necessary
    }

    public String getName() {
        return name;
    }

    public void assignColor(){ // not sure how to assign colors in terminal

    }

    public String getInfo(){
        String info = "Name: " + name + "\nDescription: " + description + "\nDue Date: " + due_date +  "\nAssigned To: " + assigned_to.getUsername() +
                "\nCreated On" + created_on +"\nCreated By: " + created_by.getUsername() + "\nStatus: " + status + "\nSubtasks: " +subtasks.getName();
        return info;
    }
}