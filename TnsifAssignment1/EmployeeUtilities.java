package com.logitha.assignment.utilities;


	import com.logitha.assignment.employees.Employee;

	/**
	 * Utility class for operations on Employee objects.
	 * Demonstrates that a class in a DIFFERENT package must use public getters/setters
	 * and cannot access private/protected fields directly (unless subclass).
	 */
	public class EmployeeUtilities {

	    /**
	     * Print a brief summary of the employee.
	     * Uses public getters of Employee.
	     *
	     * @param e employee instance
	     */
	    public static void printSummary(Employee e) {
	        System.out.println("---- Employee Summary ----");
	        System.out.println("ID: " + e.getEmployeeId());
	        System.out.println("Name: " + e.getName());
	        System.out.println("Salary: " + e.getSalary());
	    }

	    /**
	     * Gives a raise by percent (e.g., 10 means +10%).
	     * Uses public getter/setter to modify salary because salary is not directly accessible here.
	     *
	     * @param e       employee to raise
	     * @param percent percent increase
	     */
	    public static void giveRaiseByPercent(Employee e, double percent) {
	        double current = e.getSalary();
	        double increased = current + current * percent / 100.0;
	        e.setSalary(increased);
	    }

	    /**
	     * Demonstration method: tries to explain access rules (commented).
	     * - Can't do: e.salary or e.name (private/protected) directly here, because this class is in a different package
	     *   and is not a subclass of Employee.
	     */
	    public static void explainAccessRules() {
	        System.out.println("Access rules: utilities must use public methods to interact with Employee.");
	    }
	}


