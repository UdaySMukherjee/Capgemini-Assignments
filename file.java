// Interface for Vehicle
interface Vehicle {
    void start();
    void stop();
    void accelerate(int increment);
    void brake(int decrement);
    int getCurrentSpeed();
    void displayType();
}

// Abstract class implementing Vehicle
abstract class AbstractVehicle implements Vehicle {
    protected String name;
    protected int speed;

    public AbstractVehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Speed: " + speed);
    }

    @Override
    public void accelerate(int increment) {
        speed += increment;
    }

    @Override
    public void brake(int decrement) {
        speed -= decrement;
    }

    @Override
    public int getCurrentSpeed() {
        return speed;
    }
}

// Car class extending AbstractVehicle
class Car extends AbstractVehicle {
    public Car(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void start() {
        System.out.println(name + " is starting.");
    }

    @Override
    public void stop() {
        System.out.println(name + " is stopping.");
    }

    @Override
    public void displayType() {
        System.out.println("This is a Car.");
    }
}

// Bike class extending AbstractVehicle
class Bike extends AbstractVehicle {
    public Bike(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void start() {
        System.out.println(name + " is starting.");
    }

    @Override
    public void stop() {
        System.out.println(name + " is stopping.");
    }

    @Override
    public void displayType() {
        System.out.println("This is a Bike.");
    }
}

// Truck class extending AbstractVehicle
class Truck extends AbstractVehicle {
    public Truck(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void start() {
        System.out.println(name + " is starting.");
    }

    @Override
    public void stop() {
        System.out.println(name + " is stopping.");
    }

    @Override
    public void displayType() {
        System.out.println("This is a Truck.");
    }
}

// VehicleTest class
public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Car("Sedan", 60);
        Vehicle bike = new Bike("Sports Bike", 40);
        Vehicle truck = new Truck("Cargo Truck", 30);

        Vehicle[] vehicles = {car, bike, truck};
        for (Vehicle v : vehicles) {
            v.start();
            v.accelerate(10);
            v.displayType();
            System.out.println("Current Speed: " + v.getCurrentSpeed());
            v.brake(5);
            System.out.println("Speed after braking: " + v.getCurrentSpeed());
            v.stop();
            System.out.println("----------------------");
        }
    }
}
