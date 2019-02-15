package w5;
/*
    Example practice for getters, setters, and privacy matters
    This class also has examples for static methods and fields
 */
public class StudentRecord {

//    averageGrade is private, you can never use it outside of this class.
    private double averageGrade;
//    studentName has no explicit access control modifier, so by default it's protected
//    this means that only classes from this package and children classes can use studentName.
    String studentName;
//    the email field can be accessed by code from anywhere. Note: This is probably a bad idea :D
    public String email;

    int id;

//    This is a static field: It belongs to the class, not to specific objects. You can use this variable throughout
//    any static or non static method here. This is as close to "globals" as we can get in Java.

    static int count = 0;

//    Our simple constructor, but with a nice feature: A student record's id will be based on the order in which they were
//    created: The first record we create has id 1, the next will have id 2 etc.
    public StudentRecord(double averageGrade, String name, String email){

        this.averageGrade = averageGrade;
        studentName = name;
        this.email = email;
        // Increase the static count before using it for the id. The StudentRecord class will keep track of how many
        // StudentRecord objects it has created over the course of our program.
        count+=1;
        this.id = count;
    }

//    With averageGrade being a private field, we can no longer modify it. We use this setter method to do so.
    public void setAverageGrade(double newAverage){
        if (newAverage >= 0 && newAverage <= 5){
            this.averageGrade = newAverage;
        } else {
            // throw an error
            System.out.println("This won't work");
        }
    }
//    Similarly, we use this to get the grade.
    public double getAverageGrade(){
        return this.averageGrade;
    }

// other example of simple getters and setters for email.
    private String getEmail(){
        return this.email;
    }

    public void setEmail(String newEmail){
        this.email = newEmail;
    }


    public static void main(String[] args) {
        System.out.println("We are now in Student record's main");
        StudentRecord record1 = new StudentRecord(4.9, "Theoneste", "theoneste@gmail.com");
        System.out.println(record1.id);

        StudentRecord record2 = new StudentRecord(4.5, "Mary", "mary@alueducation.com");
        System.out.println(record2.id);

    }
}
