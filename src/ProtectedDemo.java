import w5.StudentRecord;

/* This class is just here to demonstrate the 'protected' keyword:
 in the w5 package, the studentRecord class has a protected field for student name, commenting out line 11
 from the main function will therefore trigger an error.
 */
public class ProtectedDemo {

    public static void main(String[] args) {
        StudentRecord record1 = new StudentRecord(4.9, "Theoneste", "theoneste@gmail.com");
//        System.out.println(record1.studentName);
    }
}
