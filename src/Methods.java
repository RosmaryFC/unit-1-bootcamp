import java.util.Random;

/**
 * Created by alexandraqin on 4/14/15.
 */



public class Methods {

  public static void main (String args[]) {
      System.out.println("calculateSquare(4): " + calculateSquare(4));

      System.out.println("calculateSquareRoot(9): " + calculateSquareRoot(9));

      System.out.println("toLowerCase(Hello, World!): " + toLowerCase("Hello, World!"));

      System.out.println("isMultiple(5, 100): " + isMultiple(5, 100));

      System.out.print("prettyInteger(10): ");
      prettyInteger(10);

      System.out.println("random(15, 20): " + random(15, 20));


  }
    //Write a method called calculateSquare that takes an int as a parameter and returns the square of that integer.
    public static int calculateSquare (int num) {
        return num*num;
    }

    //Write a method called calculateSquareRoot that takes an int as a parameter and returns the square root of that integer.
    public static int calculateSquareRoot (int num) { // todo: have someone check this
        int squareRoot = 1;
        boolean haveNotFoundSquareRoot = true;
        while (haveNotFoundSquareRoot) {
            int squareRootSquared = calculateSquare(squareRoot);
            if(squareRootSquared == num) {
                return squareRoot;
            } else if (squareRootSquared > (num)){
                return (squareRoot-1);
            } else if(squareRoot < 0) {
                return -1;
            }
            squareRoot ++;
        }
        return 0;
    }

    //Write a method called toLowerCase that takes a String as a parameter and returns the String in lower case.
    public static String toLowerCase (String sentence){

        return sentence.toLowerCase();
    }

    //Write a method called isMultiple that takes 2 int parameters and determines if the second is a multiple of the first.
    public static boolean isMultiple (int num, int possibleMultiple) {
        if( possibleMultiple % num == 0) {
            return true;
        } else {
            return false;
        }
    }

    //Write a method called prettyInteger that takes an int as a parameter and prints the integer
    // surrounded by asterisks with the length of each side equal to the given integer.
    public static void prettyInteger (int num) {
    String beginningAndEnd = "";
        for (int i = 0; i < num; i ++) {
            beginningAndEnd += '*';
        }

        System.out.println(beginningAndEnd + " " + num + " " + beginningAndEnd);
    }

    //Write a method called random that takes 2 ints as parameters and returns a random int within that range.
    public static int random (int startRange, int endRange) {
        Random rand = new Random();
        int num = rand.nextInt(endRange) + startRange;

        boolean isbetweenRange = false;

        while (! isbetweenRange) {

            if (num >= startRange && num <= endRange) {
                isbetweenRange = true;
            } else {
                num = rand.nextInt(endRange) + startRange;
            }

        }

        return num;
    }



}
