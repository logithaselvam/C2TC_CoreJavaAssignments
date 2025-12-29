package airfareAssignment;

public interface Airfare {
	/**
	 * Airfare interface defines the contract for calculating and displaying fare amount.
	 */

	    /**
	     * Calculate and return the amount (as Double).
	     * @return calculated amount
	     */
	    Double calculateAmount();

	    /**
	     * Display the amount (implementation decides format).
	     */
	    void display();
	}
