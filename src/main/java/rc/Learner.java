/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rc;

/**
 *
 * @author user
 */
public class Learner {
    //Attributes for the Learner class.
    private String fullName;
    private String subject;
    private int assignmentMark;
    private int testMark;
    private int examMark;
    
    //Constructor for the Learner class.
    public Learner(String fullName, String subject, int assignmentMark, int testMark, int examMark){
        this.fullName = fullName;
        this.subject = subject;
        this.assignmentMark = assignmentMark;
        this.testMark = testMark;
        this.examMark = examMark;
    }
    
    // The getter and setter methods for the constructors attributes
    
    // the getter and setter methods for the String fullName
    public String getfullName(){
        return fullName;
    }
    
     public void setfullName(String fullName){
        this.fullName = fullName;
    }
     
    // the getter and setter methods for the String subject
    public String getsubject(){
        return subject;
    }
    
     public void setsubject(String subject){
        this.subject = subject;
    }
     
    // the getter and setter methods for the int assignmentMark
    public int getassignmentMark(){
        return assignmentMark;
    }
    
     public void setassignmentMark(int assignmentMark){
        this.assignmentMark = assignmentMark;
    }
     
    // the getter and setter methods for the int testMark
    public int testMark(){
        return testMark;
    }
    
     public void testMark(int testMark){
        this.testMark = testMark;
    }
     
    // the getter and setter methods for the int examMark
    public int examMark(){
        return examMark;
    }
    
     public void examMark(int examMark){
        this.examMark = examMark;
    }
    
}
