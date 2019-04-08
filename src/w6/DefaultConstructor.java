package w6;

public class DefaultConstructor {
    int basicInt;
    boolean basicBool;

    public static void main(String[] args) {
        DefaultConstructor testObject = new DefaultConstructor();
        testObject.basicInt = 5;
        System.out.println(testObject.basicInt);
    }
}
