import java.util.Scanner;

/**
 * This is a program to compute statistics of students marks in an assignment.
 *
 * @author (Kulana Avinash Welihena Vithanage)
 * @version (version 1.0 06/09/2023)
 */
public class StudentsStatistics
{
    // instance variables - replace the example below with your own
    private int x;
    private String assignmentName;

    /**
     * Constructor for objects of class StudentsStatistics
     */
    public StudentsStatistics()
    {
        // initialise instance variables
        
    }

    public void inputAssignmentName() {
        
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter Assignment Name:");
        assignmentName = userInput.nextLine();
        System.out.println("Assignment name is " + assignmentName);
    }


}
