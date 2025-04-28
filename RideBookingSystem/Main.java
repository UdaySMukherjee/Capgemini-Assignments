package RideBookingSystem;

import java.util.Scanner;
//C100,Ankan,D101,Soham
//C101,Ankit,D102,Rajarshi
//C600,Bhaskar,D100,Bhargav
public class Main {
    public static void main(String[] args) {
        RideBookingSystem rideBookingSystem = new RideBookingSystem();
        rideBookingSystem.loadDriversFromFile();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n\t\tRide Booking System Menu\t\t");
            System.out.println("1. Register a Customer");
            System.out.println("2. Register a Driver");
            System.out.println("3. Book a Ride");
            System.out.println("4. Show All Drivers");
            System.out.println("0. Save Data and Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Customer ID: ");
                    String customerId = sc.nextLine();
                    System.out.print("Enter Customer Name: ");
                    String customerName = sc.nextLine();
                    Customer newCustomer = new Customer(customerId, customerName);
                    rideBookingSystem.registerCustomer(newCustomer);
                    
                    System.out.println("Customer registered successfully!");
                    break;

                case 2:
                    System.out.print("Enter Driver ID: ");
                    String driverId = sc.nextLine();
                    System.out.print("Enter Driver Name: ");
                    String driverName = sc.nextLine();
                    Driver newDriver = new Driver(driverId, driverName);
                    rideBookingSystem.registerDriver(newDriver);
                    System.out.println("Driver registered successfully!");
                    rideBookingSystem.saveDriversToFile();
                    break;

                case 3:
                    System.out.print("Enter Customer ID to Book Ride: ");
                    String bookingCustomerId = sc.nextLine();
                    Customer bookingCustomer = rideBookingSystem.findCustomerById(bookingCustomerId);
                    if (bookingCustomer != null) {
                        try {
                            Ride ride = rideBookingSystem.bookRide(bookingCustomer);
                            rideBookingSystem.saveRides();
                            System.out.println("Ride booked successfully: " + ride.rideDetails());
                        } catch (InvalidRideException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("Customer not found. Register first.");
                    }
                    break;

                case 4:
                    rideBookingSystem.showAllDrivers();
                    break;

                case 0:
                    rideBookingSystem.saveDriversToFile();
                    rideBookingSystem.saveRides();
                    System.out.println("Data saved & Exiting");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice. Please try again.");
            }
        }
    }
}
