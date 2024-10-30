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

    /**
     * Test of createTaskID method, of class Task.
     */
    @Test
    public void testCreateTaskID() {
        System.out.println("createTaskID");
        String TaskName = "";
        int taskNumber = 0;
        String developerDetails = "";
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
        String TaskName = "";
        int TaskNumber = 0;
        String developerDetails = "";
        int TaskDuration = 0;
        String TaskID = "";
        int TaskStatus = 0;
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
        int TaskDuration = 0;
        Task instance = new Task();
        int expResult = 0;
        int result = instance.returnTotalhours(TaskDuration);
        assertEquals(expResult, result);
       
    }
    
}
