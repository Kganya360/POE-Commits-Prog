/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe;

import java.util.regex.Pattern;

/**
 *
 * @author kgany
 */
public class login {

    private String firstname;
    private String lastname;
    private String username;
    private String password;

    public boolean checkUsername(String username) {
        //declare a test variable set to false
        boolean test = false;
        // check wether the username contains an underscore and is no more than 5 characters long
        if (username.contains("_") && username.length() <= 5) {
            //set the test variable to true
            test = true;
            //print out the message
            System.out.println("Username successfully captured");
        } else {
            //assign test variable to false
            test = false;
            //print out the message
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");

        }
        return test;
    }

    public boolean checkPasswordComplexity(String password) {
        //pattern regex, checks whether password contains a number
        Pattern CheckNum = Pattern.compile("[0123456789]");
        //pattern regex, checks whether password contains a capital letter
        Pattern CheckCaps = Pattern.compile("[A-Z,a-z]");
        //pattern regex, check whether password contains a special character
        Pattern CheckChar = Pattern.compile("[!@#$%^&*()~`':]");
        //declare test variable and assign test variable to false
        boolean test = false;
        if (CheckNum.matcher(password).find() && CheckCaps.matcher(password).find() && CheckChar.matcher(password).find() && password.length() >= 8) {
            //set test variable to true
            test = true;
            //Print out ht e message
            System.out.println("Password successfully captured");

        } else {
            //set test variable to false
            test = false;
            //print oout the message
            System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character");
        }
        return test;

    }

    public String registerUser(String firstname, String lastname, String username, String password) {
        if (!checkUsername(username)) {

            return ("the username is incorrectly formatted");

        } 
        
        if(!checkPasswordComplexity(password)){
            return ("password does not met the requirements");
        }
        if(checkUsername(username) && checkPasswordComplexity(password)){
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
            System.out.println("name: "+firstname+"\n"+"surname: "+lastname+"\n"+"username: "+username+"\n"+"password:"+" "+password);
        }
        
        return ("the two above conditions have been met and the user has been registerd successfully");
        
    }

    public boolean loginUser(String username, String password) {
        //declare test variable and set to false
        boolean test = false;
        if(this.username.equals(username) && this.password.equals(password)){
            //set test varable to true
            test = true;
        } else {
            test = false;
        }
        return test;
    }

    public String returnLoginStatus(boolean login) {
        if (login) {
            return "welcome " + firstname +" "+ lastname + " it is great to see you again.";
        }else{
            return ("username or password incorrect, please try again");
        }
        
    }
}
