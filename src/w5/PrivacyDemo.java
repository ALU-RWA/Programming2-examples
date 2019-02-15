package w5;

/* This class is here to demonstrate privacy keywords 'private' and 'protected'
    This also shows off the syntax for using static methods and fields of another class.
 */

public class PrivacyDemo {
    public static void main(String[] args) {
        StudentRecord record1 = new StudentRecord(4.9, "Theoneste", "theoneste@gmail.com");
//        This line won't work because averageGrade is a private field
//        System.out.println(record1.averageGrade);
//        The getAverageGrade method however is public, so we could get access to the info
        System.out.println(record1.getAverageGrade());

//        Now we have some examples of calling a static method, note the pattern:
//        Class.methodName()
        StudentRecord.institution();
//        The same patter works for static fields: Class.fieldName
        System.out.println(StudentRecord.count);
    }
}
