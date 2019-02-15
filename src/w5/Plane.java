package w5;

/*
    This class is a child of the vehicle class, as you see us using the keyword "extends" followed by Vehicle.
    In essence, this is us telling Java that a Plane IS A Vehicle.
    In more details, the Plane class will inherit:
    - All public and protected fields of Vehicle
    - All public and protected methods of Vehicle
 */
public class Plane extends Vehicle {
//    In addition to model, capacity, and passengerCount (all fields of Vehicle) You can define fields for Plane in
//    particular.
    double currentAltitude;

//    We define some new methods here: A Plane can rise, but other vehicles may not.
    public void rise(double newAltitude){
        this.currentAltitude += newAltitude;
    }

//    Here we OVERLOAD a method from our parent.
//    A Plane object automatically has access to the dropPassengers method in vehicle, but you can still
//    redefine it if it makes sense for you. In this case: Only drop  passengers if we are on the ground.
    public void dropPassengers(int passengers){
        if (currentAltitude == 0){
            passengerCount -= passengers;
        }
    }

    public static void main(String[] args) {
        Plane plane1 = new Plane();
        plane1.loadPassengers(300); // This uses the Vehicle class's method
        System.out.println(plane1.passengerCount);

        plane1.rise(10000);
        plane1.dropPassengers(300); // This uses the Plane class's method
        System.out.println(plane1.passengerCount); // This gets ignored

        Vehicle car = new Vehicle();
        car.loadPassengers(7); // This uses the Vehicle class's method
        car.dropPassengers(2); // This uses the Vehicle class's method

        System.out.println(car.passengerCount);


        // This is an array of Vehicle objects, but we can still put a Plane there, since a Plane IS A Vehicle
        Vehicle[] garage = new Vehicle[2];

        garage[0] = car;
        System.out.println(garage[0]);
        garage[1] = plane1;
        System.out.println(garage[1]);
    }

}
