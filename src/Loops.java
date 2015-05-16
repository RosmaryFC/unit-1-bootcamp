/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops {

  public static void main (String args[]) {

      System.out.print("numOneThrough10(): ");
      numOneThrough10();

      System.out.println();

      System.out.print("numOneThrough10Two(): ");
      numOneThrough10Two();

      System.out.println();

      System.out.print("numOneThroughN(15): ");
      numOneThroughN(15);

      System.out.println();

      System.out.print("evenNumTwoThroughN(20): ");
      evenNumTwoThroughN(20);

      System.out.println();

      System.out.print("sumOfOneThroughTen(): ");
      sumOfOneThroughTen();

      System.out.println();

      System.out.print("sumOfOneThroughN(15): ");
      sumOfOneThroughN(15);

      System.out.println();

      System.out.print("sumOfOneThrough10000(): ");
      sumOfOneThrough10000();

      System.out.println();

      System.out.print("repeatStringSForIntNTimes(10,* ): ");
      repeatStringSForIntNTimes(10, "* ");

      System.out.println();

      System.out.print("repeatStringForintNTimesConcatenated(10,~ ): ");
      repeatStringForIntNTimesConcatenated(10, "~ ");

      System.out.println();

      System.out.print("firstTenFibonaciNumbers(): ");
      firstTenFibonacciNumbers();

      System.out.println();

      System.out.print("sumOfFirstTenFibonacciNumbers(): ");
      sumOfFirstTenFibonacciNumbers();

      System.out.println();

      System.out.print("sumOfFirstNFibonacciNumbers(10): ");
      sumOfFirstNFibonacciNumbers(10);

  }

    //Write a method that prints the numbers 1 through 10 using a loop.
    public static void numOneThrough10 () {

        for(int i = 1; i <= 10; i ++) {
            System.out.print(i + " ");
        }
    }

    //Write a method that prints the numbers 1 through 10 using a different kind of loop.
    public static void numOneThrough10Two () {
        int num = 1;

        while (num <=10) {
            System.out.print(num + " ");
            num ++;
        }
    }

    //Write a method that takes in an int n and prints the numbers 1 through n.
    public static void numOneThroughN (int n) {

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }

    //Write a method that takes in an int n and prints the even numbers 2 through n.
    public static void evenNumTwoThroughN (int n) {

        for(int i = 2; i <= n; i++) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }


    //Write a method that prints the sum of 1 through 10 using a loop.
    public static void sumOfOneThroughTen () {
        int num = 0;

        for(int i = 1; i <=10; i++) {
            num += i;
        }

        System.out.print(num + " ");
    }

    //Write a method that takes in an int n and prints the sum of the numbers 1 through n using a loop.
    public static void sumOfOneThroughN (int n) {
        int num = 0;

        for (int i = 1; i <= n; i ++) {
            num += i;
        }

        System.out.print(num + " ");
    }

    //Use the method you wrote in part 6 to print the sum of the numbers from 1 through 10000.
    public static void sumOfOneThrough10000 () {
        sumOfOneThroughN(10000);
    }

    //Write a method that takes in an int n and a String s and prints out s on its own line, n times.
    // If n is negative, print "".
    public static void repeatStringSForIntNTimes (int n, String s) {
        String line = "";

        if(n < 0)
        {
            System.out.print(line);
        }
        else
        {
            for(int i = 1; i <= n; i++)
            {
                line += s;
            }

            System.out.print(line);

        }
    }
    //Modify the method to print out the string concatenated with itself n times.
    public static void repeatStringForIntNTimesConcatenated (int n, String s) {

        if( n < 0) {
            System.out.print("");
        }else {
            for (int i = 1; i <= n; i++) {
                System.out.print(s);
            }
        }
    }

    //Write a method that prints the first ten Fibonnaci numbers.
    public static void firstTenFibonacciNumbers () {
        int firstNum = 0;
        int secondNum = 1;

        for(int i = 1; i <=10; i++) {

            int totalFirstAndSecond = firstNum + secondNum;
            System.out.print(totalFirstAndSecond + " ");

            firstNum = secondNum;
            secondNum = totalFirstAndSecond;
        }
    }

    //Modify the method to sum the first ten Fibonnaci numbers.
    public static void sumOfFirstTenFibonacciNumbers () {
        int firstNum = 0;
        int secondNum = 1;
        int sum = 0;

        for(int i = 1; i <=10; i++) {
            int totalFirstAndSecond = firstNum + secondNum;
            sum += totalFirstAndSecond;

            firstNum = secondNum;
            secondNum = totalFirstAndSecond;
        }

        System.out.print(sum + " ");
    }

    //Modify the method to take in an int n and sum the first n Fibonnaci numbers.

    public static void sumOfFirstNFibonacciNumbers (int n) {
        int firstNum = 0;
        int secondNum = 1;
        int sum = 0;

        for (int i = 1; i <= n; i ++) {
            int totalFirstAndSecond = firstNum + secondNum;
            sum += totalFirstAndSecond;

            firstNum = secondNum;
            secondNum = totalFirstAndSecond;
        }

        System.out.print(sum + " ");
    }


}
