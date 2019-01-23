package w2;

    /*
        This is a quick demo on creating function:
        Here we are going to create a simple function that takes 2 parameters, then prints out and returns
        the smaller one.
     */
public class CompareNumbers {

    //Create a function that takes 2 int parameters
    // You should print which one of them is the smaller one
    // return the smaller one

    // Note that this is a public static int function, not public static void. This is because we will
    // return an int
    public static int compareNumbers(int a, int b){
        // If statements still work as we've seen before
        if (a < b){
            System.out.println(a);
            return a; // return also has a similar syntax
        } else {
            System.out.println(b);
            return b;
        }
    }

    public static void main(String[] args) {
        // The function returns, so you can store that return value in a variable of the corresponding type
        int result = compareNumbers(3, 5);


        System.out.println(result);
    }
}
