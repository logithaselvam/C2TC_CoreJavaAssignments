package details2;


	import java.util.Scanner;

	/**
	 * Commission class holds sales employee details and calculates commission based on sales amount.
	 */
	public class Commission {
	    // Data members (private for encapsulation)
	    private String name;
	    private String address;
	    private String phone;
	    private double salesAmount;

	    /**
	     * Default no-arg constructor (optional).
	     */
	    public Commission() {}

	    /**
	     * Accept details of the sales employee from the provided Scanner.
	     * @param sc Scanner object used for input
	     */
	    public void acceptDetails(Scanner sc) {
	        System.out.print("Enter name: ");
	        this.name = sc.nextLine().trim();

	        System.out.print("Enter address: ");
	        this.address = sc.nextLine().trim();

	        System.out.print("Enter phone: ");
	        this.phone = sc.nextLine().trim();

	        System.out.print("Enter sales amount: ");
	        // read as double; if user enters non-number this will throw; keep simple
	        this.salesAmount = Double.parseDouble(sc.nextLine().trim());
	    }

	    /**
	     * Calculate commission percentage according to given slabs and return commission amount.
	     *
	     * Rules:
	     * - salesAmount >= 100000 => commission = 10%
	     * - 50000 <= salesAmount < 100000 => commission = 5%
	     * - 30000 <= salesAmount < 50000 => commission = 3%
	     * - salesAmount < 30000 => commission = 0%
	     *
	     * @return commission amount in same currency as salesAmount
	     */
	    public double calculateCommission() {
	        double percent = 0.0;
	        if (salesAmount >= 100000) {
	            percent = 10.0;
	        } else if (salesAmount >= 50000) {
	            percent = 5.0;
	        } else if (salesAmount >= 30000) {
	            percent = 3.0;
	        } else {
	            percent = 0.0;
	        }
	        return salesAmount * percent / 100.0;
	    }

	    /**
	     * Helper to print employee details and calculated commission.
	     */
	    public void printDetailsWithCommission() {
	        double commission = calculateCommission();
	        System.out.println("\n--- Employee Commission Details ---");
	        System.out.println("Name       : " + name);
	        System.out.println("Address    : " + address);
	        System.out.println("Phone      : " + phone);
	        System.out.printf("Sales Amt  : %.2f%n", salesAmount);
	        System.out.printf("Commission : %.2f%n", commission);
	    }

	    // optional getters/setters if needed
	}


