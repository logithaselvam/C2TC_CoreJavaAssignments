package com.logitha.assignment.employees;


	

	/**
	 * Manager extends Employee and introduces department and teamSize attributes.
	 */
	public class Manager extends Employee {
	    private String department;
	    private int teamSize;

	    /**
	     * Constructor for Manager.
	     *
	     * @param name       manager name
	     * @param employeeId id
	     * @param salary     base salary
	     * @param department department name
	     * @param teamSize   number of team members
	     */
	    public Manager(String name, String employeeId, double salary, String department, int teamSize) {
	        super(name, employeeId, salary);
	        this.department = department;
	        this.teamSize = teamSize;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
	    }

	    public int getTeamSize() {
	        return teamSize;
	    }

	    public void setTeamSize(int teamSize) {
	        this.teamSize = teamSize;
	    }

	    /**
	     * Give a manager-specific raise: demonstrates using protected method from superclass.
	     *
	     * @param amount amount to increase
	     */
	    public void giveTeamBonus(double amount) {
	        // Uses protected method increaseSalaryBy from Employee
	        increaseSalaryBy(amount);
	    }

	    @Override
	    public String toString() {
	        return String.format("Manager[id=%s, name=%s, dept=%s, teamSize=%d, salary=%.2f]",
	                getEmployeeId(), getName(), department, teamSize, getSalary());
	    }
	}
	


