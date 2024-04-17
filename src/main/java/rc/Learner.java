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
    public int gettestMark(){
        return testMark;
    }
    
     public void settestMark(int testMark){
        this.testMark = testMark;
    }
     
    // the getter and setter methods for the int examMark
    public int getexamMark(){
        return examMark;
    }
    
     public void setexamMark(int examMark){
        this.examMark = examMark;
    }
    
    //The methods for calculating the final mark using the user input.
    
     // the getter and setter methods for the double finalMark
    public float getfinalMark(){
        return calcFinalMark(assignmentMark, testMark, examMark);
    }
    
     public void setfinalMark(float finalMark){
        
    }
     
    //The method that calculates the final mark from the marks submitted by the user.
     public float calcFinalMark(int assignmentMark, int testMark, int examMark){
         return (assignmentMark + testMark + examMark) / 3.0f;
     }
     
}
