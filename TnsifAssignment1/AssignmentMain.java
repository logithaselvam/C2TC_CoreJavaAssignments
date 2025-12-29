package com.logitha1.assignment;
import com.logitha.assignment.employees.Manager;
import com.logitha.assignment.employees.Developer;
import com.logitha.assignment.utilities.EmployeeUtilities;

	/**
	 * Main class (no package) to demo creating Manager and Developer and using utilities.
	 */
	public class AssignmentMain {
	    public static void main(String[] args) {
	        // Create manager and developer
	        Manager mgr = new Manager("Anitha", "M001", 70000, "Sales", 8);
	        Developer dev = new Developer("Karthi", "D101", 45000, "Java", "Mid");

	        // Print before changes
	        System.out.println("Before changes:");
	        EmployeeUtilities.printSummary(mgr);
	        EmployeeUtilities.printSummary(dev);

	        // Use subclass-specific methods
	        mgr.giveTeamBonus(3000);          // uses protected method in Employee
	        dev.promote(5000, "Senior");     // uses protected method and sets new level

	        // Use utilities to give a percent raise to both
	        EmployeeUtilities.giveRaiseByPercent(mgr, 5);  // +5%
	        EmployeeUtilities.giveRaiseByPercent(dev, 10); // +10%

	        System.out.println("\nAfter raises and promotion:");
	        EmployeeUtilities.printSummary(mgr);
	        EmployeeUtilities.printSummary(dev);

	        // Print full toString for more info
	        System.out.println("\nDetailed:");
	        System.out.println(mgr);
	        System.out.println(dev);

	        EmployeeUtilities.explainAccessRules();
	    }
	}


