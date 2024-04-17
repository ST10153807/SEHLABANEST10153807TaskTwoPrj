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
    
    
}
