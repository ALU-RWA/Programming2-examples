package w2;

import java.util.Scanner;

public class AkanNames {

    public static int dateToDay(int m, int d, int y){
        int y0 = y - (14 - m) / 12;
        int x;
        x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        int m0 = m + 12 * ((14 - m) / 12) -2;

        return (d + x + 31 * m0 / 12) % 7;
    }

    public static void main(String[] args) {
        // We want user input, so let's create a Scanner.
        Scanner reader = new Scanner(System.in);

        // We first grab the gender
        System.out.println("Please type your gender. Male or Female?");
        String gender = reader.nextLine();

        // We then grab the 3 numbers that make up our date.
        System.out.println("Please type your date of birth. First the day");
        int day = reader.nextInt();
        System.out.println("Now the month");
        int month = reader.nextInt();
        System.out.println("Finally the year");
        int year = reader.nextInt();

        // We can now use the function we created to figure out which day of the week
        // that day occured using the function
        int dayOfTheWeek = dateToDay(month, day, year);

        // Create an array for the names of each gender.
        String[] femaleNames = {"Akosua", "Adwoa", "Abenaa", "Akua", "Yaa", "Afua", "Ama"};
        String[] maleNames = {"Kwasi", "Kwadwo", "Kwabena", "Kwaku", "Yaw", "Kofi", "Kwame"};

        // Now we print the appropriate name, we made sure to set up the arrays based on the output of dateToDay
        // dateToDay gives us an int between 0 and 6, where 0 means Sunday, 1 Monday, etc.
        // So the array has the Sunday name in position 0, the Monday name in position 1, etc.
        if (gender.equals("Female")){
            System.out.println(femaleNames[dayOfTheWeek]);
        }

        if (gender.equals("Male")){
            System.out.println(maleNames[dayOfTheWeek]);
        }
    }
}

