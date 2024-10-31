/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poe;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kgany
 */
public class TaskIT {
    
   
    @Test
    public void testCheckTaskDescription() {
        System.out.println("checkTaskDescription");
        String taskDescription = "Create login to authenticate users";
        Task instance = new Task();
        boolean expResult = true;
        boolean result = instance.checkTaskDescription(taskDescription);
        assertEquals(expResult, result);
       
    }
    //INCORRECT USER details
@Test
public void invalidtestCheckTaskDescription() {
        System.out.println("checkTaskDescription");
        String taskDescription = "Create add task feature to add task users";
        Task instance = new Task();
        boolean expResult = true;
        boolean result = instance.checkTaskDescription(taskDescription);
        assertEquals(expResult, result);
       
    }
    /**
     * Test of createTaskID method, of class Task.
     */
    @Test
    public void testCreateTaskID() {
        System.out.println("createTaskID");
        String TaskName = "Login Feature";
        int taskNumber = 0;
        String developerDetails = "Robyn Harrison";
        Task instance = new Task();
        String expResult = "AD:1:BYN";
        String result = instance.createTaskID(TaskName, taskNumber, developerDetails);
        assertEquals(expResult, result);
        
    }
  //test incorrect values of the class  
@Test

public void invalidtestCreateTaskID() {
        System.out.println("createTaskID");
        String TaskName = "Add Task Feature";
        int taskNumber = 0;
        String developerDetails = "Mike Smith";
        Task instance = new Task();
        String expResult = "";
        String result = instance.createTaskID(TaskName, taskNumber, developerDetails);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of PrintTaskDetails method, of class Task.
     */
    @Test
    public void testPrintTaskDetails() {
        System.out.println("PrintTaskDetails");
        String TaskName = "Login Feature";
        int TaskNumber = 0;
        String developerDetails = "";
        int TaskDuration = 8;
        String TaskID = "";
        int TaskStatus = 1;
        Task instance = new Task();
        String expResult = "";
        String result = instance.PrintTaskDetails(TaskName, TaskNumber, developerDetails, TaskDuration, TaskID, TaskStatus);
        assertEquals(expResult, result);
        
    }
    //incorrect user details on the method test
@Test
public void invalidtestPrintTaskDetails() {
        System.out.println("PrintTaskDetails");
        String TaskName = "Add Task Feature";
        int TaskNumber = 0;
        String developerDetails = "Mike Smith";
        int TaskDuration = 8;
        String TaskID = "";
        int TaskStatus = 3;
        Task instance = new Task();
        String expResult = "";
        String result = instance.PrintTaskDetails(TaskName, TaskNumber, developerDetails, TaskDuration, TaskID, TaskStatus);
        assertEquals(expResult, result);
        
    }
    /**
     * Test of returnTotalhours method, of class Task.
     */
    @Test
    public void testReturnTotalhours() {
        System.out.println("returnTotalhours");
        int TaskDuration = 8;
        Task instance = new Task();
        int expResult = 0;
        int result = instance.returnTotalhours(TaskDuration);
        assertEquals(expResult, result);
       
    }
    //incorrect user details on the method test
    @Test
    public void invalidtestReturnTotalhours() {
        System.out.println("returnTotalhours");
        int TaskDuration = 10;
        Task instance = new Task();
        int expResult = 3;
        int result = instance.returnTotalhours(TaskDuration);
        assertEquals(expResult, result);
       
    }
}
