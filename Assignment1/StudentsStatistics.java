import java.util.Scanner;
import java.util.ArrayList;

/**
 * This is a program to compute statistics of students marks in an assignment.
 *
 * @author (Kulana Avinash Welihena Vithanage)
 * @version (version 1.0 06/09/2023)
 */
public class StudentsStatistics
{
    // instance variables 
    private ArrayList<String> studentMarks;
    private String assignmentName;

    /**
     * Constructor for objects of class StudentsStatistics
     */
    public StudentsStatistics()
    {
        // initialise instance variables
        studentMarks = new ArrayList<>();

    }

    public void inputAssignmentName() {
        
        //create a Scanner object
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter Assignment Name:");
        
        //Read User Input
        assignmentName = userInput.nextLine();
        System.out.println("Assignment Name :" + assignmentName);
    }
     public void inputStudentMarks() {
         
        
    }


}
