package w5;

/* Quick side demo for the two uses of the ++ operator*/

public class OperatorDemo {
    public static void main(String[] args) {
        int x = 0;
        System.out.println(++x);

        /* The above is equivalent to lines 11 and 12: Increment first!
        x+=1;
        print(x)
         */

        System.out.println(x++);
        /* The above is equivalent to lines 17 and 18: Use x as it is, then increment
        print(x)
        x +=1;
        */

        System.out.println(x); // should print 2.
    }
}
