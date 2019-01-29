package w3;
/*
    Example of modeling a Car in Java
 */
public class Car {

    // We should start with fields, or in other words, the attributes of a car.
    String brand;
    String licensePlate;

    double tankCapacity; // This represents how many liters are in the tank.

    // Constructors
    // This class has one simple constructor, which will initialize all 3 fields
    public Car(String carBrand, String carPlate, float initialCapacity){
        brand = carBrand;
        licensePlate = carPlate;
        tankCapacity = initialCapacity;
    }

    // Here we create our first method, the toString() method.
    // This allows us to describe the object, and would be called behind the scenes whenever you try to print a car
    public String toString(){
        // brand refers to the brand of the car we are converting to a String. Same for licensePlate and tankCapacity
        return brand + "-" + licensePlate + " with " + tankCapacity + " liters left";
    }

    // Very simple method that tells us if the car can move or not.
    public boolean canMove(){
        return tankCapacity > 0;
    }

    /* Slightly more complex method:
     If the car can move, reduce capacity by 0.5 and print that we moved
     else, print we can't move
     As practice, add a new field to the car object: consumptionPerKilometer. This will indicate how much fuel the car
     uses each kilometer.

     You can then modify this method to take a parameter distance, and substract the right amount from tankCapacity.
    */
    public void move(){
        // Note here that it's ok to call a non-static method from inside another non-static method.
        // This is because it is still clear what object we are acting on: The object we are calling the canMove() method
        // on is the same object move was called on.
        if (canMove()){
            tankCapacity = tankCapacity - 0.5;
            System.out.println("We moved!");
        } else {
            System.out.println("Can't move!");
        }
    }

    // This method is mean: a car will drain all the fuel from a victim car, and add it to its tank.
    // Note here that the 'this.' is optional, but it makes this a bit more readable
    // Later in main, we will call testCar1.drainFrom(testCar2). testCar1 will be the same as "this" below,
    // and testCar2 will be the same as victimCar.

    public void drainFrom(Car victimCar){
        // Add the victim's capacity to the current car
        this.tankCapacity = this.tankCapacity + victimCar.tankCapacity;
        victimCar.tankCapacity = 0;
    }

    // Let's try all of this in our main
    public static void main(String[] args) {

        Car testCar1 = new Car("Jaguar", "I<3CS", 1);
        // First car should move
        testCar1.move();

        Car testCar2 = new Car("Bentley", "DBF", 5);
        // Second car should also move
        testCar2.move();

        System.out.println("Before draining");
        System.out.println(testCar1.tankCapacity);
        System.out.println(testCar2.tankCapacity);

        // we drain from the second car, and put the fuel in the first
        testCar1.drainFrom(testCar2);

        System.out.println("After draining");
        System.out.println(testCar1.tankCapacity);
        System.out.println(testCar2.tankCapacity);

        // The second car should not be able to move anymore
        testCar2.move();
    }
}
