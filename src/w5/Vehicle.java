package w5;

/*
    This class helps us demonstrate the basic principles of inheritance by being the parent class of Plane
 */
public class Vehicle {
    String model;
    int capacity;
    int passengerCount;

    // Simple methods to load and drop passengers.
    public void loadPassengers(int passengers){
        this.passengerCount += passengers;
    }

    public void dropPassengers(int passengers){
        this.passengerCount -= passengers;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(); // Note here that even if we don't define a constructor, we can use the default one.
        v1.loadPassengers(7);
        System.out.println(v1.passengerCount);
    }
}
