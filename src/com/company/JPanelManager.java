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
    public void loginMenu(){
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
        loginPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Login Panel"));

        // add the panel to this frame
        add(loginPanel);

        pack();
        setLocationRelativeTo(null);
        buttonLogin.addActionListener(new ActionListener() { // on pressing any button
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if( src == buttonLogin) // on pressing login button
                {
                    loginPanel.removeAll(); // removes all loginPanel components
                    menu2(); // moves onto the next menu
                }
            }
        });
    }
    
    private JLabel labelUser = new JLabel("Hello User.");
    private JButton buttonMembers = new JButton("View Member(s)");
    private JButton buttonTeams = new JButton("View Team(s)");
    private JButton buttonTasks = new JButton("View Task(s)");
    private JButton buttonCategories = new JButton("View Categories");
    public void menu2() {
        //repaint();
        //TODO: create gui for menu2
        // create a new panel with GridBagLayout manager
        JPanel userPanel = new JPanel(new GridBagLayout());

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
        userPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "User Panel"));

        // add the panel to this frame
        add(userPanel);

        pack();
        setLocationRelativeTo(null);
        buttonMembers.addActionListener(new ActionListener() { // on pressing any button
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if( src == buttonMembers) // on pressing button
                {
                    userPanel.removeAll(); // removes all userPanel components
                    menuMembers(); // moves onto the next menu
                }
            }
        });
        
        buttonTeams.addActionListener(new ActionListener() { // on pressing any button
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if( src == buttonTeams) // on pressing button
                {
                    userPanel.removeAll(); // removes all userPanel components
                    menuTeams(); // moves onto the next menu
                }
            }
        });
        
        buttonTasks.addActionListener(new ActionListener() { // on pressing any button
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if( src == buttonTasks) // on pressing button
                {
                    userPanel.removeAll(); // removes all userPanel components
                    menuTasks(); // moves onto the next menu
                }
            }
        });
        
        buttonCategories.addActionListener(new ActionListener() { // on pressing any button
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if( src == buttonCategories) // on pressing button
                {
                    userPanel.removeAll(); // removes all userPanel components
                    menuCategories(); // moves onto the next menu
                }
            }
        });
    }
    
    private JLabel labelMenuMembers = new JLabel("Current Members(s)");
    private JButton buttonCreateMember = new JButton("Create New Member");
    private JButton buttonReturn = new JButton("Main Menu");
    public void menuMembers()
    {
        JPanel membersPanel = new JPanel(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);

        // add components to the panel
        constraints.gridx = 0;
        constraints.gridy = 0;
        membersPanel.add(labelMenuMembers, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        membersPanel.add(buttonCreateMember, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 8;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        membersPanel.add(buttonReturn, constraints);

        // set border for the panel
        membersPanel.setPreferredSize(new Dimension(600, 600));
        membersPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Members Panel"));

        // add the panel to this frame
        add(membersPanel);

        pack();
        setLocationRelativeTo(null);
        buttonTasks.addActionListener(new ActionListener() { // on pressing any button
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if( src == buttonCreateTask) // on pressing button
                {
                    membersPanel.removeAll(); // removes all membersPanel components
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
                    membersPanel.removeAll(); // removes all membersPanel components
                    menu2(); // moves onto the next menu
                }
            }
        });
    }
    
    private JLabel labelMenuTeams = new JLabel("Current Team(s)");
    private JButton buttonCreateTeam = new JButton("Create New Team");
    
    public void menuTeams()
    {
        JPanel teamsPanel = new JPanel(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);

        // add components to the panel
        constraints.gridx = 0;
        constraints.gridy = 0;
        teamsPanel.add(labelMenuTeams, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        teamsPanel.add(buttonCreateTeam, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 8;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        teamsPanel.add(buttonReturn, constraints);

        // set border for the panel
        teamsPanel.setPreferredSize(new Dimension(600, 600));
        teamsPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Teams Panel"));

        // add the panel to this frame
        add(teamsPanel);

        pack();
        setLocationRelativeTo(null);
        buttonTasks.addActionListener(new ActionListener() { // on pressing any button
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if( src == buttonCreateTeam) // on pressing button
                {
                    teamsPanel.removeAll(); // removes all teamsPanel components
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
                    teamsPanel.removeAll(); // removes all teamsPanel components
                    menu2(); // moves onto the next menu
                }
            }
        });
    }
    
    private JLabel labelMenuTasks = new JLabel("Current Task(s)");
    private JButton buttonCreateTask = new JButton("Create New Task");
    
    public void menuTasks()
    {
        JPanel tasksPanel = new JPanel(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);

        // add components to the panel
        constraints.gridx = 0;
        constraints.gridy = 0;
        tasksPanel.add(labelMenuTasks, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        tasksPanel.add(buttonCreateTask, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 8;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        tasksPanel.add(buttonReturn, constraints);

        // set border for the panel
        tasksPanel.setPreferredSize(new Dimension(600, 600));
        tasksPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Tasks Panel"));

        // add the panel to this frame
        add(tasksPanel);

        pack();
        setLocationRelativeTo(null);
        buttonTasks.addActionListener(new ActionListener() { // on pressing any button
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if( src == buttonCreateTask) // on pressing button
                {
                    tasksPanel.removeAll(); // removes all tasksPanel components
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
                    tasksPanel.removeAll(); // removes all tasksPanel components
                    menu2(); // moves onto the next menu
                }
            }
        });
    }
    
    public void menuCategories()
    {
        JPanel categoriesPanel = new JPanel(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);

        // add components to the panel        
        constraints.gridx = 0;
        constraints.gridy = 8;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        categoriesPanel.add(buttonReturn, constraints);

        // set border for the panel
        categoriesPanel.setPreferredSize(new Dimension(600, 600));
        categoriesPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Categories Panel"));

        // add the panel to this frame
        add(categoriesPanel);

        pack();
        setLocationRelativeTo(null);
        buttonReturn.addActionListener(new ActionListener() { // on pressing any button
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if(src == buttonReturn)
                {
                    categoriesPanel.removeAll();
                    menu2();
                }
            }
        });
    }
    
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