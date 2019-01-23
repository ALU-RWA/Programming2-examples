package w2;

/*
    Demo on how to gather user input in Java.
    Here you will see how Java's approach differs from Python's.
    In Python, the input() function always returns a String, it was up to you to convert it if need be
    In Java, and using the Scanner class, you can specify exactly what you are looking for.
 */

// You must first import the class!
import java.util.Scanner;

public class UserInputDemo {

    public static void main(String[] args) {

        // First we create a Scanner object. reader is simply the name of the variable, you can change
        // it to whatever you see fit. Everything else needs to be there.
        Scanner reader = new Scanner(System.in);

        // Tell the user what you are looking for. In this first example we will get a String from the
        // user
        System.out.println("How are you?");
        String answer = reader.nextLine();
        // answer will have the value of WHATEVER THE USER TYPED BEFORE HITTING ENTER. That's the
        // purpose of the nextLine method we called in line 24.
        System.out.println(answer);

        // Let's try getting a number now
        System.out.println("How old are you?");
        // You can then get the user input by assigning to a variable the result of calling
        // the nextInt method. This will look at what the user types, expecting a valid integer
        int age = reader.nextInt();
        System.out.println(age);

        // More information on the official documentation page:
        // https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html

        // Comment the following line back in to learn about a tricky challenge with the reader class.
        //bugDemo();
    }

    // This function does the same thing as main, except it asks for age first, then for some message from the user.
    // In other words, it calls reader.nextInt() before calling reader.nextLine() and there is a problem there
    public static void bugDemo(){
        Scanner reader = new Scanner(System.in);

        // The following line will print, the message, then read the next number the user gives.
        System.out.println("Bug DemoHow old are you?");
        int age = reader.nextInt();
        System.out.println(age);

        // How are you will print, but we will never have a chance to read the user's input
        // The program will finish shortly after you see the next println. Why?
        System.out.println("BugDemo: How are you?");
        String answer = reader.nextLine();
        System.out.println(answer);

        /*
        The issue lies with the way nextInt() works. It looks at everything the user types, and looks for numbers that
        would form an int.

        Once it found them, it will return that number, and leave everything else you may have typed behind, where future
        methods from the Scanner class can look.

        So if your age is twenty, what you responded to the first question is 20 followed by enter.
        In other words, the complete user input is the String "20\n", Where the \n represents the new line

        Now, after calling nextInt(), it will return 20. What's left from the user's input? The String "\n"
        In other words, an empty new line.

        When we call nextLine(), it finds "\n", and says well, that's the line the user typed! it will immediately
        read it, and assign that whitespace to answer, and print it.

        How do we fix it? 2 options:
            - Make sure to start with nextLine() before nextInt() if possible.
            - in line 52, between the two requests for user input, simply type reader.nextLine(); This will
            remove the new line that was left, so when line 56 executes, it won't find it. Instead, it will wait for new
            input
         */

    }
}
