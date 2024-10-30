/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe;

import java.time.Duration;

/**
 *
 * @author kgany
 */
public class Task {
    private String TaskName;
     private int TaskNumber;
     private String taskDescription;
     private String developerDetails;
     private int TaskDuration;
     private String TaskID;
     private int TaskStatus;
    public boolean checkTaskDescription(String taskDescription){
       boolean test = false; 
      if(taskDescription.length()<= 50){
        test = true;
          System.out.println("Task successfully captured");
      }else{
          test = false;
          System.out.println("Please enter a task description less than 50 characters");
      }
      return test;  
   }
    public String createTaskID( String TaskName, int taskNumber, String developerDetails){
      this.TaskName= TaskName;
      this.TaskNumber = taskNumber; 
      this.developerDetails = developerDetails;
      String TaskID = this.TaskName.substring(0, 2) + ":" + this.TaskNumber + ":" + this.developerDetails.substring(this.developerDetails.length()-3, this.developerDetails.length());
      return TaskID.toUpperCase();
    }
    public String PrintTaskDetails(String TaskName, int TaskNumber, String developerDetails, int TaskDuration, String TaskID, int TaskStatus){
       this.TaskName = TaskName;
       this.TaskNumber = TaskNumber;
       this.developerDetails = developerDetails;
       this.TaskStatus = TaskStatus;
       if(TaskStatus == 1){
           return "To do";
       }
       if(TaskStatus == 2){
           return "done";
       }
       if(TaskStatus == 3){
           return "doing";
       }
        return ("Taskname:"+" "+TaskName+"\n"+"Task Number:"+" "+ TaskNumber+"\n"+"Developer details:"+" "+developerDetails+"\n"+"Task duration:"+" "+TaskDuration+"\n"+"Task ID:"+" " +"("+createTaskID(TaskName, TaskNumber, developerDetails)+")"+"\n"+"Task status:"+" "+TaskStatus);  
   }
    public int returnTotalhours(int TaskDuration){
        this.TaskDuration = TaskDuration;
        int total = 0; 
        if(TaskNumber == 0){
          total = TaskDuration;  
        }else if(TaskNumber >= 1){
            total = total+TaskDuration; 
        }
        return total;
    }
    

}