package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class JPanelManager extends JFrame {
    public JPanelManager() {
        super("User Task Manager");
        loginMenu(); // calls the first login menu
    }

    private JLabel labelUsername = new JLabel("Enter username: ");
    private JLabel labelPassword = new JLabel("Enter password: ");
    private JTextField textUsername = new JTextField(20);
    private JPasswordField fieldPassword = new JPasswordField(20);
    private JButton buttonLogin = new JButton("Login");

    public void loginMenu() {
        // create a new panel with GridBagLayout manager
        JPanel loginPanel = new JPanel(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);

        // add components to the panel
        constraints.gridx = 0;
        constraints.gridy = 0;
        loginPanel.add(labelUsername, constraints);

        constraints.gridx = 1;
        loginPanel.add(textUsername, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        loginPanel.add(labelPassword, constraints);

        constraints.gridx = 1;
        loginPanel.add(fieldPassword, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        loginPanel.add(buttonLogin, constraints);

        // set border for the panel
        loginPanel.setPreferredSize(new Dimension(600, 600));
        loginPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Login Panel"));

        // add the panel to this frame
        add(loginPanel);

        pack();
        setLocationRelativeTo(null);
        buttonLogin.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if (src == buttonLogin) // on pressing login button
                {
                    loginPanel.removeAll(); // removes all loginPanel components
                    instantiateMenu(); // moves onto the next menu
                }
            }
        });
    }
    private JLabel labelUser = new JLabel("Hello User.");
    private JButton buttonMembers = new JButton("View Member(s)");
    private JButton buttonTeams = new JButton("View Team(s)");
    private JButton buttonTasks = new JButton("View Task(s)");
    private JButton buttonCategories = new JButton("View Categories");


    private JPanel userPanel = new JPanel(new GridBagLayout());
    public void instantiateMenu()
    {
        labelUser.setOpaque(true);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);
        
        // add components to the panel
        constraints.gridx = 0;
        constraints.gridy = 0;
        userPanel.add(labelUser, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        userPanel.add(buttonMembers, constraints);

        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        userPanel.add(buttonTeams, constraints);

        constraints.gridx = 0;
        constraints.gridy = 6;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        userPanel.add(buttonTasks, constraints);

        constraints.gridx = 0;
        constraints.gridy = 8;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        userPanel.add(buttonCategories, constraints);

        // set border for the panel
        userPanel.setPreferredSize(new Dimension(600, 600));
        userPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "User Panel"));

        // MEMBER   GUI
        GridBagConstraints MemberConstraints = new GridBagConstraints();
        MemberConstraints.anchor = GridBagConstraints.WEST;
        MemberConstraints.insets = new Insets(10, 10, 10, 10);

        // add components to the panel
        MemberConstraints.gridx = 0;
        MemberConstraints.gridy = 0;
        userPanel.add(labelMenuMembers, MemberConstraints);

        MemberConstraints.gridy = 1;
        userPanel.add(labelMenuUsername, MemberConstraints);
        MemberConstraints.gridy = 2;
        userPanel.add(labelMenuPassword, MemberConstraints);

        MemberConstraints.gridx = 0;
        MemberConstraints.gridy = 3;
        MemberConstraints.gridwidth = 2;
        MemberConstraints.anchor = GridBagConstraints.CENTER;
        userPanel.add(buttonPreviousMember, MemberConstraints);
        MemberConstraints.gridx = 1;
        userPanel.add(buttonNextMember, MemberConstraints);
        MemberConstraints.gridx = 1;
        MemberConstraints.gridy = 8;
        userPanel.add(buttonCreateMember, MemberConstraints);

        MemberConstraints.gridx = 0;
        MemberConstraints.gridy = 8;
        MemberConstraints.gridwidth = 2;
        MemberConstraints.anchor = GridBagConstraints.CENTER;
        userPanel.add(buttonReturn, MemberConstraints);


        menuMembersVis(false);
        // TASKS    GUI

        GridBagConstraints constraintsTasks = new GridBagConstraints();
        constraintsTasks.anchor = GridBagConstraints.WEST;
        constraintsTasks.insets = new Insets(12, 12, 12, 12);

        // add components to the panel
        constraintsTasks.gridx = 0;
        constraintsTasks.gridy = 0;
        userPanel.add(labelMenuTasks, constraintsTasks);
        constraintsTasks.gridy = 1;
        userPanel.add(labelMenuTaskName, constraintsTasks);
        constraintsTasks.gridy = 2;
        userPanel.add(labelMenuTaskDescription, constraintsTasks);
        constraintsTasks.gridy = 3;
        userPanel.add(labelMenuTaskDueDate, constraintsTasks);
        constraintsTasks.gridy = 4;
        userPanel.add(labelMenuTaskCreatedOn, constraintsTasks);
        constraintsTasks.gridy = 5;
        userPanel.add(labelMenuTaskStatus, constraintsTasks);
        constraintsTasks.gridy = 6;
        userPanel.add(labelMenuTaskCreatedBy, constraintsTasks);
        constraintsTasks.gridy = 7;
        userPanel.add(labelMenuTaskAssignedTo, constraintsTasks);
        constraintsTasks.gridy = 8;
        userPanel.add(labelMenuTaskSubtasks, constraintsTasks);

        constraintsTasks.gridy = 9;
        userPanel.add(buttonNextTask, constraintsTasks);
        constraintsTasks.gridx = 1;
        userPanel.add(buttonPreviousTask, constraintsTasks);
        constraintsTasks.gridx = 1;
        constraintsTasks.gridy = 10;
        userPanel.add(buttonCreateTask, constraintsTasks);

        constraintsTasks.gridx = 0;
        constraintsTasks.gridy = 10;

        userPanel.add(buttonTaskReturn, constraintsTasks);

        constraintsTasks.gridwidth = 2;
        constraintsTasks.anchor = GridBagConstraints.CENTER;
        menuTasksVis(false);

        // Teams GUI

        GridBagConstraints teamConstraints = new GridBagConstraints();
        teamConstraints.anchor = GridBagConstraints.WEST;
        teamConstraints.insets = new Insets(10, 10, 10, 10);

        // add components to the panel
        teamConstraints.gridx = 0;
        teamConstraints.gridy = 0;
        userPanel.add(labelMenuTeams, teamConstraints);

        teamConstraints.gridx = 0;
        teamConstraints.gridy = 2;
        teamConstraints.gridwidth = 2;
        teamConstraints.anchor = GridBagConstraints.CENTER;
        userPanel.add(buttonCreateTeam, teamConstraints);

        teamConstraints.gridx = 0;
        teamConstraints.gridy = 8;
        teamConstraints.gridwidth = 2;
        teamConstraints.anchor = GridBagConstraints.CENTER;
        userPanel.add(buttonReturn, teamConstraints);

        labelMenuTeams.setVisible(false);
        buttonCreateTeam.setVisible(false);

        //CATEGORIES GUI

        GridBagConstraints categoryConstraints = new GridBagConstraints();
        categoryConstraints.anchor = GridBagConstraints.WEST;
        categoryConstraints.insets = new Insets(10, 10, 10, 10);

        // add components to the panel
        teamConstraints.gridx = 0;
        teamConstraints.gridy = 0;
        userPanel.add(labelMenuCategory, teamConstraints);

        categoryConstraints.gridx = 0;
        categoryConstraints.gridy = 8;
        categoryConstraints.gridwidth = 2;
        categoryConstraints.anchor = GridBagConstraints.CENTER;
        userPanel.add(buttonReturn, categoryConstraints);


        categoryConstraints.gridx = 0;
        categoryConstraints.gridy = 2;
        categoryConstraints.gridwidth = 2;
        categoryConstraints.anchor = GridBagConstraints.CENTER;
        userPanel.add(buttonCreateCategory,categoryConstraints);
        buttonCreateCategory.setVisible(false);
        labelMenuCategory.setVisible(false);
       
        
        
        // Task Adding Menu GUI
        GridBagConstraints TaskCon = new GridBagConstraints();
        TaskCon.anchor = GridBagConstraints.WEST;
        TaskCon.insets = new Insets(10, 10, 10, 10);
        TaskCon.gridx = 0;
        TaskCon.gridy = 0;
        TaskCon.anchor = GridBagConstraints.CENTER;
        userPanel.add(labelTaskName, TaskCon);
        TaskCon.gridy = 1;
        userPanel.add(labelTaskDescription, TaskCon);
        TaskCon.gridy = 2;
        userPanel.add(labelTaskDueDate, TaskCon);
        TaskCon.gridy = 3;
        userPanel.add(labelTaskCreatedOn, TaskCon);
        TaskCon.gridy = 4;
        userPanel.add(labelTaskStatus, TaskCon);
        TaskCon.gridy = 5;
        userPanel.add(labelTaskCreatedBy, TaskCon);
        TaskCon.gridy = 6;
        userPanel.add(labelTaskAssignedTo, TaskCon);




        TaskCon.gridx = 1;
        TaskCon.anchor = GridBagConstraints.CENTER;

        TaskCon.gridy = 0;
        userPanel.add(textTaskName, TaskCon);
        TaskCon.gridy = 1;
        userPanel.add(textTaskDescription, TaskCon);
        TaskCon.gridy = 2;
        userPanel.add(textTaskDueDate, TaskCon);
        TaskCon.gridy = 3;
        userPanel.add(textTaskCreatedOn, TaskCon);
        TaskCon.gridy = 4;
        userPanel.add(textTaskStatus, TaskCon);
        TaskCon.gridy = 5;
        userPanel.add(textTaskCreatedBy, TaskCon);
        TaskCon.gridy = 6;
        userPanel.add(textTaskAssignedTo, TaskCon);
        TaskCon.gridx = 3;
        TaskCon.gridy = 7;
        userPanel.add(comboColorBox, TaskCon   );
        TaskCon.gridx = 0;
        TaskCon.gridy = 8;
        TaskCon.anchor = GridBagConstraints.CENTER;
        userPanel.add(buttonReturnSecond, TaskCon);
        TaskCon.gridx = 1;
        userPanel.add(buttonTaskCreate, TaskCon);

        menuCreateTaskVis(false);
        
        //Member adding GUI

        GridBagConstraints MemberAddConstraints = new GridBagConstraints();
        MemberAddConstraints.anchor = GridBagConstraints.WEST;
        MemberAddConstraints.insets = new Insets(10, 10, 10, 10);
        MemberAddConstraints.gridx = 0;
        MemberAddConstraints.gridy = 0;
        MemberAddConstraints.anchor = GridBagConstraints.CENTER;
        userPanel.add(labelMemberUsername, MemberAddConstraints);
        MemberAddConstraints.gridy = 1;
        userPanel.add(labelMemberPassword, MemberAddConstraints);




        MemberAddConstraints.gridx = 1;
        MemberAddConstraints.anchor = GridBagConstraints.CENTER;

        MemberAddConstraints.gridy = 0;
        userPanel.add(textMemberUsername, MemberAddConstraints);
        MemberAddConstraints.gridy = 1;
        userPanel.add(textMemberPassword, MemberAddConstraints);
        MemberAddConstraints.gridy = 2;

        MemberAddConstraints.anchor = GridBagConstraints.CENTER;

        MemberAddConstraints.gridx = 0;
        userPanel.add(buttonMemberReturn, MemberAddConstraints);
        MemberAddConstraints.gridx = 1;
        userPanel.add(buttonMemberCreate, MemberAddConstraints);

        labelMemberUsername.setVisible(false);
        labelMemberPassword.setVisible(false);
        buttonMemberCreate.setVisible(false);
        textMemberUsername.setVisible(false);
        textMemberPassword.setVisible(false);
        buttonMemberReturn.setVisible(false);
        add(userPanel);
        pack();
        setLocationRelativeTo(null);
        // add the panel to this frame
        menu2();

    }
    public void invis(boolean a) //set general stuff visibility to false
    {
        buttonMembers.setVisible(a);
        buttonTeams.setVisible(a);
        buttonTasks.setVisible(a);
        buttonCategories.setVisible(a);
        labelUser.setVisible(a);
    }
    public void menu2() {
        //repaint();
        userPanel.setBackground(Color.WHITE);
        invis(true);
        buttonMembers.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Object src = e.getSource();

                if (src == buttonMembers) // on pressing button
                {
                    userPanel.setBackground(Color.CYAN);
                    invis(false);//set general stuff visibility to false
                    menuMembers(); // moves onto the next menu
                }
            }
        });
        buttonTeams.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if (src == buttonTeams) // on pressing button
                {
                    userPanel.setBackground(Color.RED);
                    invis(false);//set general stuff visibility to false
                    menuTeams(); // moves onto the next menu
                }
            }
        });
        buttonTasks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if (src == buttonTasks) // on pressing button
                { // turns the menu buttons off
                    userPanel.setBackground(Color.GREEN);
                    invis(false);//set general stuff visibility to false
                    menuTasks(); // moves onto the next menu
                }
            }
        });

        buttonCategories.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if (src == buttonCategories) // on pressing button
                {
                    userPanel.setBackground(Color.YELLOW);
                    invis(false);//set general stuff visibility to false
                    menuCategories(); // moves onto the next menu
                }
            }
        });
    }

    private JLabel labelMenuMembers = new JLabel("Current Member(s)");
    private JLabel labelMenuUsername = new JLabel("Username: ");
    private JLabel labelMenuPassword = new JLabel("Password: ");
    private JButton buttonPreviousMember = new JButton("Previous Member");
    private JButton buttonNextMember = new JButton("Next Member");
    private JButton buttonCreateMember = new JButton("Create New Member");
    private JButton buttonReturn = new JButton("Main Menu");

    int memberIndex = 0;
    public void menuMembersVis(Boolean a)
    {
        labelMenuMembers.setVisible(a);//menu visibility
        buttonCreateMember.setVisible(a);
        buttonReturn.setVisible(a);
        buttonNextMember.setVisible(a);
        buttonPreviousMember.setVisible(a);
        labelMenuUsername.setVisible(a);
        labelMenuPassword.setVisible(a);
    }
    public void menuMembers()
    {

        labelMenuUsername.setText("Username: " + members.get(memberIndex).getUsername());
        labelMenuPassword.setText("Password: " + members.get(memberIndex).getPassword());
        menuMembersVis(true);
        buttonCreateMember.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if( src == buttonCreateMember) // on pressing button
                {

                    menuMembersVis(false);
                    menuCreateMember(); // moves onto the next menu
                }
            }
        });
        buttonNextMember.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Object src = e.getSource();

            if( src == buttonNextMember) // on pressing button
            {
                if((memberIndex+1) <members.size()) {
                    memberIndex++;
                    labelMenuUsername.setText("Username: " + members.get(memberIndex).getUsername());
                    labelMenuPassword.setText("Password: " + members.get(memberIndex).getPassword());
                }

            }
        }
    });

        buttonPreviousMember.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if( src == buttonPreviousMember) // on pressing button
                {
                    if((memberIndex-1) >= 0) {
                        memberIndex--;
                        labelMenuUsername.setText("Username: " + members.get(memberIndex).getUsername());
                        labelMenuPassword.setText("Password: " + members.get(memberIndex).getPassword());
                    }

                }
            }
        });
        buttonReturn.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if( src == buttonReturn) // on pressing button
                {
                    menuMembersVis(false);
                    menu2(); // moves onto the next menu
                }
            }
        });
    }

    private JLabel labelMenuTeams = new JLabel("Current Team(s)");
    private JButton buttonCreateTeam = new JButton("Create New Team");
    public void menuTeamsVis(Boolean a)
    {
        labelMenuTeams.setVisible(a);
        buttonCreateTeam.setVisible(a);
        buttonReturn.setVisible(a);
    }
    public void menuTeams()
    {
        menuTeamsVis(true);
        buttonCreateTeam.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if( src == buttonCreateTeam) // on pressing button
                {
                    menuTeamsVis(false);
                    //menuCreateTeam(); // moves onto the next menu
                }
            }
        });

        buttonReturn.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if( src == buttonReturn) // on pressing button
                {
                    menuTeamsVis(false);
                    menu2(); // moves onto the next menu
                }
            }
        });
    }

    private JLabel labelMenuTasks = new JLabel("Current Task(s)");
    private JLabel labelMenuTaskName = new JLabel();
    private JLabel labelMenuTaskDescription = new JLabel();
    private JLabel labelMenuTaskDueDate = new JLabel();
    private JLabel labelMenuTaskCreatedOn = new JLabel();
    private JLabel labelMenuTaskStatus = new JLabel();
    private JLabel labelMenuTaskCreatedBy = new JLabel();
    private JLabel labelMenuTaskAssignedTo = new JLabel();
    private JLabel labelMenuTaskSubtasks = new JLabel();
    private JButton buttonTaskReturn = new JButton ("Back");
    private JButton buttonCreateTask = new JButton("Create New Task");

    private JButton buttonNextTask = new JButton ("Next");
    private JButton buttonPreviousTask = new JButton ("Previous");
    private int taskIndex = 0;
    public void menuTasksVis(Boolean a)
    {
        labelMenuTasks.setVisible(a);
        labelMenuTaskDescription.setVisible(a);
        labelMenuTaskDueDate.setVisible(a);
        labelMenuTaskCreatedOn.setVisible(a);
        labelMenuTaskStatus.setVisible(a);
        labelMenuTaskCreatedBy.setVisible(a);
        labelMenuTaskAssignedTo.setVisible(a);
        labelMenuTaskSubtasks.setVisible(a);
        labelMenuTaskName.setVisible(a);
        buttonCreateTask.setVisible(a);
        buttonNextTask.setVisible(a);
        buttonTaskReturn.setVisible(a);
        buttonPreviousTask.setVisible(a);
    }
    public void menuTasks()
    {
        labelMenuTaskName.setText("Name: " + tasks.get(taskIndex).getName());
        if(tasks.get(taskIndex).getTextColor()== "White") {
            labelMenuTaskName.setForeground(Color.WHITE);
        }
        else if(tasks.get(taskIndex).getTextColor()== "Black")
            labelMenuTaskName.setForeground(Color.BLACK);
        else if(tasks.get(taskIndex).getTextColor()== "Red")
            labelMenuTaskName.setForeground(Color.RED);
        else if(tasks.get(taskIndex).getTextColor()== "Green")
            labelMenuTaskName.setForeground(Color.GREEN);

        labelMenuTaskDescription.setText("Description: " + tasks.get(taskIndex).getDescription());
        labelMenuTaskDueDate.setText("Due Date: " + tasks.get(taskIndex).getDue_date());
        labelMenuTaskCreatedOn.setText("Created On: " + tasks.get(taskIndex).getCreated_on());
        labelMenuTaskStatus.setText("Status: " + tasks.get(taskIndex).getStatus());
        labelMenuTaskCreatedBy.setText("Created By: " + tasks.get(taskIndex).getCreated_by().getUsername());
        labelMenuTaskAssignedTo.setText("Assigned To: " + tasks.get(taskIndex).getAssigned_to().getUsername());
        labelMenuTaskSubtasks.setText("Subtasks: " + tasks.get(taskIndex).getSubtasks());
        menuTasksVis(true);
        // add the panel to this frame
        buttonCreateTask.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if( src == buttonCreateTask) // on pressing button
                {
                    menuTasksVis(false);
                    menuCreateTask(); // moves onto the next menu
                }
            }
        });

        buttonNextTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if( src == buttonNextTask) // on pressing button
                {
                    if((taskIndex+1) <tasks.size()) {
                        taskIndex++;
                        labelMenuTaskName.setText("Name: " + tasks.get(taskIndex).getName());
                        if(tasks.get(taskIndex).getTextColor()== "White") {
                            labelMenuTaskName.setForeground(Color.WHITE);
                        }
                        else if(tasks.get(taskIndex).getTextColor()== "Black")
                            labelMenuTaskName.setForeground(Color.BLACK);
                        else if(tasks.get(taskIndex).getTextColor()== "Red")
                            labelMenuTaskName.setForeground(Color.RED);
                        else if(tasks.get(taskIndex).getTextColor()== "Green")
                            labelMenuTaskName.setForeground(Color.GREEN);
                        labelMenuTaskDescription.setText("Description: " + tasks.get(taskIndex).getDescription());
                        labelMenuTaskDueDate.setText("Due Date: " + tasks.get(taskIndex).getDue_date());
                        labelMenuTaskCreatedOn.setText("Created On: " + tasks.get(taskIndex).getCreated_on());
                        labelMenuTaskStatus.setText("Status: " + tasks.get(taskIndex).getStatus());
                        labelMenuTaskCreatedBy.setText("Created By: " + tasks.get(taskIndex).getCreated_by().getUsername());
                        labelMenuTaskAssignedTo.setText("Assigned To: " + tasks.get(taskIndex).getAssigned_to().getUsername());
                        labelMenuTaskSubtasks.setText("Subtasks: " + tasks.get(taskIndex).getSubtasks());
                    }

                }
            }
        });

        buttonPreviousTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if( src == buttonPreviousTask) // on pressing button
                {
                    if((taskIndex-1) >= 0) {
                        taskIndex--;
                        labelMenuTaskName.setText("Name: " + tasks.get(taskIndex).getName());
                        if(tasks.get(taskIndex).getTextColor()== "White") { // Color
                            labelMenuTaskName.setForeground(Color.WHITE);
                        }
                        else if(tasks.get(taskIndex).getTextColor()== "Black")
                            labelMenuTaskName.setForeground(Color.BLACK);
                        else if(tasks.get(taskIndex).getTextColor()== "Red")
                            labelMenuTaskName.setForeground(Color.RED);
                        else if(tasks.get(taskIndex).getTextColor()== "Green")
                            labelMenuTaskName.setForeground(Color.GREEN);
                        labelMenuTaskDescription.setText("Description: " + tasks.get(taskIndex).getDescription());
                        labelMenuTaskDueDate.setText("Due Date: " + tasks.get(taskIndex).getDue_date());
                        labelMenuTaskCreatedOn.setText("Created On: " + tasks.get(taskIndex).getCreated_on());
                        labelMenuTaskStatus.setText("Status: " + tasks.get(taskIndex).getStatus());
                        labelMenuTaskCreatedBy.setText("Created By: " + tasks.get(taskIndex).getCreated_by().getUsername());
                        labelMenuTaskAssignedTo.setText("Assigned To: " + tasks.get(taskIndex).getAssigned_to().getUsername());
                        labelMenuTaskSubtasks.setText("Subtasks: " + tasks.get(taskIndex).getSubtasks());
                    }

                }
            }
        });
        buttonTaskReturn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();
                if( src == buttonTaskReturn) // on pressing button
                {
                    menuTasksVis(false);
                    menu2(); // moves onto the next menu
                }
            }
        });
    }
    private JLabel labelMenuCategory = new JLabel("Current Category(s)");
    private JButton buttonCreateCategory = new JButton("Create New Category");
    public void menuCategoryVis(Boolean a)
    {
        labelMenuCategory.setVisible(a);
        buttonCreateCategory.setVisible(a);
        buttonReturn.setVisible(a);
    }
    public void menuCategories()
    {
        menuCategoryVis(true);
        buttonCreateCategory.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if(src == buttonCreateCategory)
                {
                    menuCategoryVis(false);
                    //menuCreateCategory(); // moves onto the next menu
                }

            }
        });
        buttonReturn.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if( src == buttonReturn) // on pressing button
                {
                    menuCategoryVis(false);
                    menu2(); // moves onto the next menu
                }
            }
        });
    }
    //TODO: Complete Create Functions
    //instantiate text field

    
    private JLabel labelTaskName = new JLabel("Name: ");
    private JLabel labelTaskDescription = new JLabel("Description: ");
    private JLabel labelTaskDueDate = new JLabel("DueDate: ");
    private JLabel labelTaskCreatedOn = new JLabel("CreatedOn: ");
    private JLabel labelTaskStatus = new JLabel("Status: ");
    private JLabel labelTaskCreatedBy = new JLabel("CreatedBy: ");
    private JLabel labelTaskAssignedTo = new JLabel("AssignedTo: ");
    private JTextField textTaskName = new JTextField(20);
    private JTextField textTaskDescription = new JTextField(20);
    private JTextField textTaskDueDate = new JTextField(20);
    private JTextField textTaskCreatedOn = new JTextField(20);
    private JTextField textTaskStatus = new JTextField(20);
    private JTextField textTaskCreatedBy = new JTextField(20);
    private JTextField textTaskAssignedTo = new JTextField(20);
    private JButton buttonReturnSecond = new JButton("Back");
    private JButton buttonTaskCreate = new JButton("Create");
    String[] textColors = {"Black", "White", "Red", "Green"};
    private JComboBox comboColorBox = new JComboBox(textColors);
    public void menuCreateTaskVis(boolean a)
    {

        labelTaskName.setVisible(a);
        labelTaskDescription.setVisible(a);
        labelTaskDueDate.setVisible(a);
        labelTaskCreatedOn.setVisible(a);
        labelTaskStatus.setVisible(a);
        labelTaskCreatedBy.setVisible(a);
        labelTaskAssignedTo.setVisible(a);
        textTaskName.setVisible(a);
        textTaskDescription.setVisible(a);
        textTaskDueDate.setVisible(a);
        textTaskCreatedOn.setVisible(a);
        textTaskStatus.setVisible(a);
        textTaskCreatedBy.setVisible(a);
        textTaskAssignedTo.setVisible(a);
        buttonReturnSecond.setVisible(a);
        buttonTaskCreate.setVisible(a);
        comboColorBox.setVisible(a);
    }
    public void menuCreateTask()
    {
        menuCreateTaskVis(true);
        buttonTaskCreate.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Object src = e.getSource();
            if( src == buttonTaskCreate ) // on pressing button
            {
                menuCreateTaskVis(false);
                // name, description, due date, created on, status, created by, assigned to
                Task task = new Task(textTaskName.getText(), textTaskDescription.getText(), textTaskDueDate.getText(), textTaskCreatedOn.getText(),
                        textTaskStatus.getText(), nobody, nobody);
                task.assignColor((String)comboColorBox.getSelectedItem());
                tasks.add(task);
                //Task task = new Task(textTaskName.getText(), textTaskDescription.getText(), textTaskDueDate.getText(), textTaskCreatedOn.getText(),
                        //textTaskStatus.getText(), textTaskCreatedBy.getText(), textTaskAssignedTo.getText());
                menuTasks(); // moves onto the next menu
            }
        }
    });
        buttonReturnSecond.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();
                if( src == buttonReturnSecond) // on pressing button
                {

                    menuCreateTaskVis(false);
                    menuTasks(); // moves onto the next menu
                }
            }
        });
    }
    //instantiate text field
    public void menuCreateTeam()
    {
        //set fields and button visible
        // on click ok
        //Team team = new Team(namefield, descfield, etc..)
    }//instantiate text field
    public void menuCreateCategory()
    {
        //set fields and button visible
        // on click ok
        //Category category = new Category(namefield, descfield, etc..)
    }

    private JButton buttonMemberCreate = new JButton("Create");
    private JButton buttonMemberReturn = new JButton("Back");
    private JLabel labelMemberUsername = new JLabel("Username: ");
    private JLabel labelMemberPassword = new JLabel("Password: ");
    private JTextField textMemberUsername = new JTextField(20);
    private JTextField textMemberPassword = new JTextField(20);
    public void menuCreateMember()
    {
        buttonMemberReturn.setVisible(true);
        labelMemberUsername.setVisible(true);
        labelMemberPassword.setVisible(true);
        buttonMemberCreate.setVisible(true);
        textMemberUsername.setVisible(true);
        textMemberPassword.setVisible(true);
        //set fields and button visible
        buttonMemberCreate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();
                if( src == buttonMemberCreate ) // on pressing button
                {

                    buttonMemberReturn.setVisible(false);
                    labelMemberUsername.setVisible(false);
                    labelMemberPassword.setVisible(false);
                    buttonMemberCreate.setVisible(false);
                    textMemberUsername.setVisible(false);
                    textMemberPassword.setVisible(false);
                    // UserName, Pass
                    Member member = new Member(textMemberUsername.getText(), textMemberPassword.getText());
                    members.add(member);
                    menuMembers(); // moves onto the next menu
                }
            }
        });
        buttonMemberReturn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();
                if( src == buttonMemberReturn ) // on pressing button
                {

                    buttonMemberReturn.setVisible(false);
                    labelMemberUsername.setVisible(false);
                    labelMemberPassword.setVisible(false);
                    buttonMemberCreate.setVisible(false);
                    textMemberUsername.setVisible(false);
                    textMemberPassword.setVisible(false);
                    menuMembers(); // moves onto the next menu
                }
            }
        });
    }
    //instantiate text field

    private static Member nobody = new Member("N/A", "1234");
    private static Task nullTask = new Task("N/A", "N/A", "N/A", "N/A", "N/A", nobody,nobody);
    private static  ArrayList<Member> members = new ArrayList<Member>();
    private static ArrayList<Task> tasks = new ArrayList<Task>();
    private static ArrayList<Team> teams = new ArrayList<Team>();
    private static ArrayList<TaskCategory> categories = new ArrayList<TaskCategory>();
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        members.add(nobody);
        tasks.add(nullTask);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JPanelManager().setVisible(true);
            }
        });
    }
}
