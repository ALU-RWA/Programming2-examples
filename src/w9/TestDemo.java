package w9;

public class TestDemo {
    public static String fizzbuzz(int n){
        String output = "";

        if (n % 3 == 0){
            output+= "fizz";
        }
        if (n % 5 == 0) {
            output += "buzz";
        }
//        } else if (n % 15 == 0){
//            output += "fizzbuzz";
//        }

        return output;
    }


    public static boolean palindrome(String s){
        return true;
    }
}
