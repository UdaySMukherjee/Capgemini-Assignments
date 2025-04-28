package RideBookingSystem;

import java.util.Iterator;
import java.util.List;

@SecurityCheck(role = "Admin")
public class Admin extends User {

    Admin(String id, String name) {
        super(id, name);
    }

    @Override
    void showProfile() {
        System.out.println("Admin name: " + name + "\nRole: "+getRole());
    }

    public void removeDriver(List<Driver> drivers, String driverId) {
        if (getRole().equals("Admin")) {
            Iterator<Driver> iterator = drivers.iterator();
            while (iterator.hasNext()) {
                Driver d = iterator.next();
                if (d.id.equals(driverId)) {
                    iterator.remove();
                    System.out.println("Driver ID: " + driverId + " removed.");
                }
            }
            System.out.println("Driver ID: " + driverId + " not found.");
        } else {
            System.out.println("Unauthorized action.");
        }
    }

    private String getRole() {
        SecurityCheck securityCheck = this.getClass().getAnnotation(SecurityCheck.class);
        if (securityCheck != null) {
            return securityCheck.role();
        }
        return null;
    }
}
