package w3;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        // Get names from the students to show a pre-set array
        String[] names = {"Theoneste", "Taiwo", "Uche", "Musa"};

        // This creates an array with a certain number of spots, but no content yet.
        int[] answers = new int[4];

        // This is how you overwrite some content from the Array
        names[2] = "Uchechukwu";

        // You can check how large an array is using the length attribute.
        int numberOfNames = names.length;

        // Let's fll up our answers array using some user input.
        // We set up a basic loop to go through all the indeces of the array (0 -> 3)
        int index = 0;

        Scanner annoyingQuestions = new Scanner(System.in);

        while (index < numberOfNames){
            // Ask the question to the right person
            System.out.println("What did you think of the assignment, " + names[index]);

            // Receive and store their answer.
            answers[index] = annoyingQuestions.nextInt();

            index = index + 1;
        }

        // This loops again through answers just to convince us the array was updated.
        int i = 0;
        while (i < answers.length){
            System.out.println(answers[i]);
            i += 1;
        }

        // We use our average function to compute the average.
        System.out.println(average(answers));

        // Another test for average, with a larger array and larger numbers.
        int[] test = {2019, 2018, 7, 8,15,75};
        System.out.println(average(test));
    }

    // Create a function that takes an int array as a parameter, and returns the average
    public static double average(int[] numbers){
        // Create a variable for the sum. It's convenient for us to make it a double from the get go.
        double sum = 0;

        // Loop through all the numbers
        int index = 0;
        while (index < numbers.length){
            // Add each numbre to the sum
            sum = sum + numbers[index];
            index = index + 1;
        }

        // Average is sum total divided by the number of elements. Since sum is a double, the whole result will
        // be a double.
        return sum / numbers.length;
    }
}
