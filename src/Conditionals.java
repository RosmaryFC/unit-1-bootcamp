/**
 * Created by alexandraqin on 4/14/15.
 */
public class Conditionals {

  public static void main (String args[]) {
      System.out.println("isOdd(3): " + isOdd(21));

      System.out.println("isMultipleOfThree(21): " + isMultipleOfThree(21));

      System.out.println("isOddAndIsMultipleOfThree(21): " + isOddAndIsMultipleOfThree(21));

      System.out.println("isOddAndIsMultipleOfThree2(21): " + isOddAndIsMultipleOfThree2(21));

      System.out.print("fizzMultipleOfThree(21): ");
      fizzMultipleOfThree(21);

      Person johnDoe = new Person("John Doe");
      johnDoe.setCity("London");
      System.out.println("isFromLondon(johnDoe): " + isFromLondon(johnDoe));

      Person bobG = new Person ("Bob g");
      System.out.print("printNameOfPerson(johnDoe): ");
      printNameOfPerson(johnDoe);

  }
    //Write a method isOdd that takes in an int n. Returns a true if n is odd, and false otherwise.
    public static boolean isOdd (int n) {
        if(n % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    //Write a method isMultipleOfThree that takes in an int n.
    // Returns true if n is a multiple of three, and false otherwise.
    public static boolean isMultipleOfThree (int n) {
        if(n % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //Write a method isOddAndIsMultipleOfThree that takes in an int n.
    // Returns true if n is both odd and a multiple of three, and false otherwise.
    public static boolean isOddAndIsMultipleOfThree (int n) {
        if(n % 3 == 0 && n % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    //Write a method isOddAndIsMultipleOfThree2 - if you used isOdd and isMultipleofThree in your last solution,
    // don't use it this time. If you did not, write this method building on your last methods.
    public static boolean isOddAndIsMultipleOfThree2 (int n) {

        if (isOdd(n) && isMultipleOfThree(n)) {
            return true;
        }else {
            return false;
        }
    }

    //Write a method fizzMultipleOfThree that takes in an int n
    // and prints "Fizz" if n is a multiple of three, and prints n otherwise.
    public static void fizzMultipleOfThree (int n) {

        if(isMultipleOfThree(n)) {
            System.out.println("Fizz");
        } else {
            System.out.println(n);
        }
    }

    //Write a method that takes in a Person and returns true if the person is from London, and false otherwise.
    public static boolean isFromLondon (Person nameOfPerson) {
        if(nameOfPerson.getCity() == "London") {
            return true;
        }else {
            return false;
        }
    }

    //Write a method that takes in a Person and prints the name if the person
    // has a name longer than 5 characters, and otherwise prints "Name is too short."
    public static void printNameOfPerson (Person nameOfPerson) {
        if(nameOfPerson.getName().length() > 5) {
            System.out.println(nameOfPerson.getName());
        } else {
            System.out.println("Name is too short.");
        }
    }
}
