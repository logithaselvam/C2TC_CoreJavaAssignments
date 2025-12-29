package airfareAssignment;
import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Read inputs
	        int choice = Integer.parseInt(sc.nextLine().trim());
	        int hours = Integer.parseInt(sc.nextLine().trim());
	        double costPerHour = Double.parseDouble(sc.nextLine().trim());

	        Airfare fare = null;

	        switch (choice) {
	            case 1:
	                fare = new AirIndia(hours, costPerHour);
	                break;
	            case 2:
	                fare = new KingFisher(hours, costPerHour);
	                break;
	            case 3:
	                fare = new Indigo(hours, costPerHour);
	                break;
	            default:
	                // If invalid choice, print 0.00 (or you can handle as required)
	                System.out.println("0.00");
	                sc.close();
	                return;
	        }

	        // Print the calculated amount rounded to 2 decimals via display()
	        fare.display();

	        sc.close();
	    }
	}


