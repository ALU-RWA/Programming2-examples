package w3;

/*
    Example of modeling a TrafficLight in Java.
 */

public class TrafficLight {
    // We should start with fields, or in other words, the attributes of a trafficLight.
    // The following three fields will define what colors are used to signal warning, stop, and go.
    String warningColor;
    String stopColor;
    String goColor;

    // The following three fields will define which lights are on.
    boolean warningOn;
    boolean stopOn;
    boolean goOn;

    //Constructor creation:
    // This class has one simple constructor, which will initialize all fields
    // The colors will come from the parameter
    // By default, we will make any new Traffic Light start with only the stop light on.

    public TrafficLight(String warning, String go, String on){
        warningColor = warning;
        goColor = go;
        stopColor = on;

        stopOn = true;
        warningOn = false;
        goOn = false;
    }

    // Here we create our first method, the toString() method.
    // This allows us to describe the object, and would be called behind the scenes whenever you try to print a traffic
    // light
    public String toString(){
        return "Warning: " + warningOn + " Go: " + goOn + " Stop: " + stopOn;
    }

    // This allows us to turn off a traffic light completely.
    public void switchOff(){
        goOn = false;
        stopOn = false;
        warningOn = false;
    }

    /* Slightly more complex method:
        Given another traffic light, make the current traffic light turn on the same lights
        This could be useful if you have to opposing traffic lights that should turn on and off at the same time.
    */
    public void copyFrom (TrafficLight otherLight){
        this.goOn = otherLight.goOn;
        this.stopOn = otherLight.stopOn;
        this.warningOn = otherLight.warningOn;
    }



    public static void main(String[] args) {

        TrafficLight test1 = new TrafficLight("Yellow", "Green", "Red");
        TrafficLight test2 = new TrafficLight("Yellow", "Blue", "Red");
        // Initial state for both lights should be that only the stop light is on
        System.out.println("Initial state");
        System.out.println(test1);
        System.out.println(test2);

        // the first one should be completely off
        System.out.println("After switching off test1");
        test1.switchOff();
        System.out.println(test1);
        System.out.println(test2);

        // This should now turn off the second light as well.
        System.out.println("After test2 copies test1");
        test2.copyFrom(test1);
        System.out.println(test1);
        System.out.println(test2);

    }
}
