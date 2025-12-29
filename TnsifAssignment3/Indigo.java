package airfareAssignment;
	/**
	 * Indigo implementation of Airfare.
	 * Attributes: hours (Integer), costPerHour (Double)
	 * For Indigo multiply the base product by 8.
	 */
	public class Indigo implements Airfare {
	    private Integer hours;
	    private Double costPerHour;

	    // default constructor
	    public Indigo() {
	        this.hours = 0;
	        this.costPerHour = 0.0;
	    }

	    // parameterized constructor
	    public Indigo(Integer hours, Double costPerHour) {
	        this.hours = hours;
	        this.costPerHour = costPerHour;
	    }

	    // getters and setters
	    public Integer getHours() {
	        return hours;
	    }

	    public void setHours(Integer hours) {
	        this.hours = hours;
	    }

	    public Double getCostPerHour() {
	        return costPerHour;
	    }

	    public void setCostPerHour(Double costPerHour) {
	        this.costPerHour = costPerHour;
	    }

	    /**
	     * calculateAmount for Indigo: (hours * costPerHour) * 8
	     */
	    @Override
	    public Double calculateAmount() {
	        return hours * costPerHour * 8;
	    }

	    /**
	     * display method prints the amount rounded to 2 decimals
	     */
	    @Override
	    public void display() {
	        Double amount = calculateAmount();
	        System.out.println(String.format("%.2f", amount));
	    }
	}
	


