package com.company;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
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
        buttonLogin.addActionListener(new ActionListener() { // on pressing any button
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

        MemberConstraints.gridx = 0;
        MemberConstraints.gridy = 2;
        MemberConstraints.gridwidth = 2;
        MemberConstraints.anchor = GridBagConstraints.CENTER;
        userPanel.add(buttonCreateMember, MemberConstraints);

        MemberConstraints.gridx = 0;
        MemberConstraints.gridy = 8;
        MemberConstraints.gridwidth = 2;
        MemberConstraints.anchor = GridBagConstraints.CENTER;
        userPanel.add(buttonReturn, MemberConstraints);

        labelMenuMembers.setVisible(false);
        buttonCreateMember.setVisible(false);
        buttonReturn.setVisible(false);
        // TASKS    GUI

        GridBagConstraints constraintsTasks = new GridBagConstraints();
        constraintsTasks.anchor = GridBagConstraints.WEST;
        constraintsTasks.insets = new Insets(10, 10, 10, 10);

        // add components to the panel
        constraintsTasks.gridx = 0;
        constraintsTasks.gridy = 0;
        userPanel.add(labelMenuTasks, constraintsTasks);

        constraintsTasks.gridx = 0;
        constraintsTasks.gridy = 2;
        constraintsTasks.gridwidth = 2;
        constraintsTasks.anchor = GridBagConstraints.CENTER;
        userPanel.add(buttonCreateTask, constraintsTasks);

        constraintsTasks.gridx = 0;
        constraintsTasks.gridy = 8;
        constraintsTasks.gridwidth = 2;
        constraintsTasks.anchor = GridBagConstraints.CENTER;
        userPanel.add(buttonReturn, constraintsTasks);
        labelMenuTasks.setVisible(false);
        buttonReturn.setVisible(false);
        buttonCreateTask.setVisible(false);

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
        // set border for the panel
        /*
        userPanel.setPreferredSize(new Dimension(600, 600));
        userPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Tasks Panel"));
         */
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

    private JLabel labelMenuMembers = new JLabel("Current Members(s)");
    private JButton buttonCreateMember = new JButton("Create New Member");
    private JButton buttonReturn = new JButton("Main Menu");
    
    public void menuMembersVis(Boolean a)
    {
        labelMenuMembers.setVisible(a);//menu visibility
        buttonCreateMember.setVisible(a);
        buttonReturn.setVisible(a);
    }
    public void menuMembers()
    {
        menuMembersVis(true);
        buttonTasks.addActionListener(new ActionListener() { // on pressing any button
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if( src == buttonCreateTask) // on pressing button
                {

                    menuMembersVis(false);
                    //menuCreateMember(); // moves onto the next menu
                }
            }
        });

        buttonReturn.addActionListener(new ActionListener() { // on pressing any button
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
        buttonTasks.addActionListener(new ActionListener() { // on pressing any button
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

        buttonReturn.addActionListener(new ActionListener() { // on pressing any button
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
    private JButton buttonCreateTask = new JButton("Create New Task");
    public void menuTasksVis(Boolean a)
    {
        labelMenuTasks.setVisible(a);
        buttonReturn.setVisible(a);
        buttonCreateTask.setVisible(a);
    }
    public void menuTasks()
    {
        menuTasksVis(true);
        // add the panel to this frame
        buttonTasks.addActionListener(new ActionListener() { // on pressing any button
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if( src == buttonCreateTask) // on pressing button
                {
                    menuTasksVis(false);
                    //menuCreateTask(); // moves onto the next menu
                }
            }
        });

        buttonReturn.addActionListener(new ActionListener() { // on pressing any button
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if( src == buttonReturn) // on pressing button
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
        buttonReturn.addActionListener(new ActionListener() { // on pressing any button
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
        buttonReturn.addActionListener(new ActionListener() { // on pressing any button
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
    public void menuCreateTask()
    {
        //set fields and button visible
        // on click ok
        //Member member = new Member(namefield, descfield, etc..)
    }//instantiate text field
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
    //instantiate text field
    
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JPanelManager().setVisible(true);
            }
        });
    }
}
