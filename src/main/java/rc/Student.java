/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package rc;

import javax.swing.JOptionPane;
/**
 *
 * @author ST10153807
 */
public class Student {

    public static void main(String[] args) {
        //Getting the learners data using the JOptionPane.
        //The input String used to pass information from the JOptionPane to the variable container
        String input;
        input = JOptionPane.showInputDialog("Enter your full name");
        //full name variable
        String fName = input;
        
        //The subject variable
        input = JOptionPane.showInputDialog("Enter the subject");
        String module = input;
        
        //The assignment mark variable
        input = JOptionPane.showInputDialog("Enter your assignment.");
        int assignment = Integer.parseInt(input);
        
        //The test mark variable
        input = JOptionPane.showInputDialog("Enter your test mark.");
        int testM = Integer.parseInt(input);
        
        //The exam mark variable
        input = JOptionPane.showInputDialog("Enter your exam mark.");
        int exam = Integer.parseInt(input);
    }
    
    //The method for retrieving the data from the Learner class
    public String getLearnerInput(String fName, String module, int assignment, int testM, int exam){
        //The object for the Learner class
        Learner learner = new Learner( fName, module, assignment, testM, exam);
        //The string that will return the user input from the class
        String learnerData = "\n" + learner.getfullName() + "\n"
                               + "Subject: " + learner.getsubject() + "\n"
                               + "Assignment Mark: " + learner.getassignmentMark() + "\n"
                               + "Test Mark: " + learner.gettestMark() + "\n"
                               + "Exam Mark: " + learner.getexamMark() + "\n";
        return learnerData;
    }
    
    //The method for displaying the final mark
    public float displayFinalMark(String fName, String module, int assignment, int testM, int exam){
        
        Learner learner = new Learner( fName, module, assignment, testM, exam);
        return learner.getfinalMark();
        
    }
}
