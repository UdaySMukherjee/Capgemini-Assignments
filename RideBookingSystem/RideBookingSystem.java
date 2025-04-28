package RideBookingSystem;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class RideBookingSystem {
    private List<Customer> customers;
    private List<Driver> drivers;
    private List<Ride> rides;

    public RideBookingSystem() {
        customers = new ArrayList<>();
        drivers = new ArrayList<>();
        rides = new ArrayList<>();
    }

    void registerCustomer(Customer customer) {
        customers.add(customer);
    }

    void registerDriver(Driver driver) {
        drivers.add(driver);
    }

    Ride bookRide(Customer customer) {
        List<Driver> availableDrivers = drivers.stream().filter(Driver::isAvailable).toList();
        
        if (availableDrivers.isEmpty()) {
            throw new InvalidRideException("No available drivers.");
        }

        Driver driver = availableDrivers.get(0);
        driver.setAvailable(false);

        Ride ride = new Ride(customer, driver);
        rides.add(ride);
        saveRides();

        return ride;
    }

    void saveRides() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\UDAY SANKAR\\Desktop\\CASESTUDY\\rides.txt"))) {
            for (Ride ride : rides) {
                writer.write(ride.rideDetails()); 
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving rides: " + e.getMessage());
        }
    }

    void loadDriversFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\UDAY SANKAR\\Desktop\\CASESTUDY\\drives.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 2) {
                    String id = parts[0];
                    String name = parts[1];
                    Driver driver = new Driver(id, name);
                    registerDriver(driver);
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading drivers: " + e.getMessage());
        }
    }

    void saveDriversToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\UDAY SANKAR\\Desktop\\CASESTUDY\\drives.txt"))) {
            for (Driver driver : drivers) {
                writer.write(driver.id + "," + driver.name);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving drivers: " + e.getMessage());
        }
    }

    void showAllDrivers() {
        for (Driver driver : drivers) {
            driver.showProfile();
        }
    }

    public Customer findCustomerById(String customerId) {
        for (Customer customer : customers) {
            if (customer.id.equals(customerId)) {
                return customer;
            }
        }
        return null;
    }
}
