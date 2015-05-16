/**
 * Created by alexandraqin on 4/14/15.
 */
public class Variables {

  public static void main (String args[]) {

      int room = 113;
      double eIsCloseTo = 2.71828;
      String program = "Computer Science";

      System.out.println("This is room # " + room);
      System.out.println("e is close to " + eIsCloseTo);
      System.out.println("I am learning a bit about " + program);

  }

  //Consider a method isOdd. What type should it return? What type(s) should it take in? Create the method signature.
  public static boolean isOdd(int number) {
      if(number % 2 == 0) {
          return false;
      }else {
          return true;
      }
  }

  //Consider a method printHelloWorld. What type should it return? What type(s) should it take in?
  // Create the method signature.
  public static void printHelloWorld (){
      System.out.println("Hello World");
  }

  //Consider a method greatestCommonFactor.
  // What type should it return? What type(s) should it take in? Create the method signature.
  // todo: try to solve later.
    public static int greatestCommonFactor (int numOne, int numTwo){
        for(int i = numTwo; i > 0 ; i--) {
            System.out.println(i % numOne);
            if(i % numOne == 0) {

            }
        }
        return -1;
    }
}
