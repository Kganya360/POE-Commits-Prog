/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.poe;

import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.*;

/**
 *
 * @author kgany
 */
public class POE {

    public static void main(String[] args) {
        //object of a scanner
        Scanner sc = new Scanner(System.in);
        JFrame f;
        //declarationds and user prompt to enter user details
        String Firstname = JOptionPane.showInputDialog("Please enter first name: ");
        String firstname = Firstname;
        String Lastname = JOptionPane.showInputDialog("please enter last name: ");
        String lastname = Lastname;
        String Username = JOptionPane.showInputDialog("please enter username: ");
        String username = Username;
        String pass = JOptionPane.showInputDialog("please enter password: ");
        String password = pass;

        //object of the class
        login log = new login();
        
        //call out the methods from the external class
        log.checkUsername(username);
        log.checkPasswordComplexity(password);
        System.out.println(log.registerUser(firstname, lastname, username, password));
        boolean loginCheck = log.loginUser(username, password);
        System.out.println(log.returnLoginStatus(loginCheck));
        //print out the results 
        //part 2

        if (loginCheck) {
            Task Tas = new Task();
            String prompt;
            f = new JFrame();
            JOptionPane.showMessageDialog(f,"welcome to EasyKanban");

            //promptthe user
            
            prompt = JOptionPane.showInputDialog("a. Option 1) Add tasks" + "\n" + "b. Option 2) Show report" + "\n" + "c. option 3) quit");
            int input = Integer.parseInt(prompt);
            if (input != 3) {

                if (input == 1) {
                    prompt = JOptionPane.showInputDialog("please enter the number of tasks you want to enter or 0 to exit");
                    int taskNum = Integer.parseInt(prompt);
                    int quit = Integer.parseInt(prompt);
                    String[] tasks = new String[taskNum];
                    int count = 0;
                    while (count < taskNum) {
                        tasks[count] += "";

                        count++;

                    }

                    int TaskNumber = 0;
                  
                    while (TaskNumber < taskNum) {
                        if(quit != 0 && TaskNumber < taskNum){
                        JOptionPane.showMessageDialog(f,"task number" + " " + TaskNumber);
                        prompt = JOptionPane.showInputDialog("enter task name");
                        String TaskName = prompt;
                        prompt = JOptionPane.showInputDialog("enter a short task description");
                        String TaskDescription = prompt;
                        prompt = JOptionPane.showInputDialog("enter developer name");
                        String DeveloperDetails = prompt; 
                        prompt = JOptionPane.showInputDialog("enter task duration, task duration should be in hours");
                        int TaskDuration = Integer.parseInt(prompt);
                        prompt = JOptionPane.showInputDialog("please select the status of your task by picking either\n"+"option 1) to do\n"+"option 2) Done\n"+"option 3) Doing");
                        int TaskStatus = Integer.parseInt(prompt); 
                        //call the external methopds
                        boolean testtas = Tas.checkTaskDescription(TaskDescription);
                        if(testtas){
                       JOptionPane.showMessageDialog(f,Tas.checkTaskDescription(TaskDescription));
                       JOptionPane.showMessageDialog(f,"task successfully captured");}
                        JOptionPane.showMessageDialog(f,"Task id:" + Tas.createTaskID(TaskName, TaskNumber, DeveloperDetails));
                        JOptionPane.showMessageDialog(f,"Task details: " +  Tas.PrintTaskDetails(TaskName, TaskNumber, DeveloperDetails, TaskStatus, TaskName, TaskStatus));
                       JOptionPane.showMessageDialog(f,"totalhours: " + Tas.returnTotalhours(TaskDuration));
                        TaskNumber++; }
                        
                        
                    }

                } else if (input == 2) {
                    JOptionPane.showMessageDialog(f,"coming soon");

                }

            }
        }
    }
}
