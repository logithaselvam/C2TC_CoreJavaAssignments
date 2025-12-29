package details3;
import java.util.Scanner;

import details1.Student;
import details2.Commission;

	/**
	 * Main class to demonstrate Student constructor and Commission functionality.
	 */
	public class AssignmentMain {
	    public static void main(String[] args) {
	        // Part A: Student demonstration
	        System.out.println("Creating Student object...");
	        new Student();

	        // Part B: Commission demonstration
	        Scanner sc = new Scanner(System.in);

	        Commission emp = new Commission();
	        System.out.println("\nEnter sales employee details:");
	        emp.acceptDetails(sc);

	        // Calculate and print commission details
	        emp.printDetailsWithCommission();

	        sc.close();
	    }
	}
	


