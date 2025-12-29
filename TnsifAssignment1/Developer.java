package com.logitha.assignment.employees;


	

	/**
	 * Developer extends Employee and adds programmingLanguage and level attributes.
	 */
	public class Developer extends Employee {
	    private String programmingLanguage;
	    private String level; // e.g., Junior, Mid, Senior

	    public Developer(String name, String employeeId, double salary, String programmingLanguage, String level) {
	        super(name, employeeId, salary);
	        this.programmingLanguage = programmingLanguage;
	        this.level = level;
	    }

	    public String getProgrammingLanguage() {
	        return programmingLanguage;
	    }

	    public void setProgrammingLanguage(String programmingLanguage) {
	        this.programmingLanguage = programmingLanguage;
	    }

	    public String getLevel() {
	        return level;
	    }

	    public void setLevel(String level) {
	        this.level = level;
	    }

	    /**
	     * Promote developer: uses protected increaseSalaryBy method.
	     *
	     * @param bump amount to increase
	     */
	    public void promote(double bump, String newLevel) {
	        increaseSalaryBy(bump);
	        this.level = newLevel;
	    }

	    @Override
	    public String toString() {
	        return String.format("Developer[id=%s, name=%s, lang=%s, level=%s, salary=%.2f]",
	                getEmployeeId(), getName(), programmingLanguage, level, getSalary());
	    }
	}


