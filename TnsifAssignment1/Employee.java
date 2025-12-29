package com.logitha.assignment.employees;



	/**
	 * Represents a generic Employee.
	 * Demonstrates use of private and protected attributes and public getters/setters.
	 */
	public class Employee {
	    // private fields: can't be accessed directly from other classes
	    private String name;
	    private String employeeId;

	    /**
	     * Protected salary: accessible inside subclasses (same package or subclass).
	     * Demonstrates protected access modifier usage.
	     */
	    protected double salary;

	    /**
	     * Public constructor.
	     *
	     * @param name       employee name
	     * @param employeeId unique id
	     * @param salary     starting salary
	     */
	    public Employee(String name, String employeeId, double salary) {
	        this.name = name;
	        this.employeeId = employeeId;
	        this.salary = salary;
	    }

	    /** @return employee name */
	    public String getName() {
	        return name;
	    }

	    /** @param name new name */
	    public void setName(String name) {
	        this.name = name;
	    }

	    /** @return employee id */
	    public String getEmployeeId() {
	        return employeeId;
	    }

	    /** @param employeeId set id */
	    public void setEmployeeId(String employeeId) {
	        this.employeeId = employeeId;
	    }

	    /** @return current salary */
	    public double getSalary() {
	        return salary;
	    }

	    /** @param salary set salary */
	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    /**
	     * Protected helper method to increase salary.
	     * Subclasses can call this directly.
	     *
	     * @param amount amount to add to salary
	     */
	    protected void increaseSalaryBy(double amount) {
	        this.salary += amount;
	    }

	    @Override
	    public String toString() {
	        return String.format("Employee[id=%s, name=%s, salary=%.2f]", employeeId, name, salary);
	    }
	}
	


