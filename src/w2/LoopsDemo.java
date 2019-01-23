package w2;

/*
    This is a quick demo on how to use while loops in Java
    The demo consists of one function that contains a loop, we then test the function in main
 */
public class LoopsDemo {

    // This void function takes an int parameter, then print numbers from 0 up to the number
    public static void countUntil(int limit){
        // Declare a variable to count
        int count = 0;
        while ( count <= limit) {
            System.out.println(count);
            count = count + 1;
            /*
            Instead of line 15, you could also do:
            count += 1;
            or
            count++; Which is a shortcut for add 1 to this variable.
             */
        }
    }

    // We use our main function to test:
    public static void main(String[] args) {
        // Should print numbers from 0 to 7, all on one line.
        countUntil(7);

        // Should print numbers from 0 to 12, all on one line.
        countUntil(12);
    }
}
