/**
 * Created by alexandraqin on 4/14/15.
 */
public class ClassesAndObjects {

  public static void main (String args[]) {
      //1. Cool Cats
      //Create 3 cats named Garfield, Pink Panther, and Catwoman.
      //Assign each of them a favorite food (Garfield's favorite food should be Lasagna).
      //Assign each of them an age.

      Cat garfield = new Cat("Garfield");
      garfield.setFavoriteFood("lasagna");
      garfield.setAge(5);

      Cat panther = new Cat("Panther");
      panther.setFavoriteFood("Cereal");
      garfield.setAge(25);


      Cat catWoman = new Cat("Catwoman");
      catWoman.setFavoriteFood("pizza");
      catWoman.setAge(27);

      System.out.println("isOlder(garfield, catWoman): " + isOlder(garfield, catWoman));

      System.out.print("makeBestFriends(garfield, panther): ");
      makeBestFriends(garfield, panther);

      System.out.println();

      System.out.print("makeKitten(panther, catWoman): " + makeKitten(panther,catWoman).getName() + "  Age: " + makeKitten(panther, catWoman).getAge());

      System.out.println();


      Person sam =new Person ("Sam");
      System.out.print("adoption(catWoman, sam ): ");
      adoption(catWoman, sam);




  }

    // 2. isOlder
    //Write a method called isOlder that takes 2 Cats as parameters
    // and returns whether or not the first Cat is older than the second.
    public static boolean isOlder (Cat first, Cat second) {
        if(first.getAge() > second.getAge()) {
            return true;
        }else {
            return false;
        }
    }

    //3.Best Friends
    //Write a method called makeBestFriends that takes 2 Cats as parameters
    // and sets both of their favorite foods to the same thing.
    public static void makeBestFriends (Cat first, Cat second) {
        second.setFavoriteFood(first.getFavoriteFood());//sets food of second cat to first cats favorite food

        System.out.print(first.getFavoriteFood() + " " + second.getFavoriteFood());
    }

    //4.Kitten
    //Write a method called makeKitten that takes 2 Cats as parameters and returns a new Cat
    // with a name that is the combination of the 2 parent Cats' names. The age of the new Cat should be 0.

    public static Cat makeKitten (Cat first, Cat second) {
        Cat kitten = new Cat (first.getName() + " " + second.getName());
        kitten.setAge(0);

        return kitten;
    }

    //5.Adoption
    //Write a method called adoption that takes 1 Cat and 1 Person as a paramater and sets the Cat's owner to be the Person.
    //Bonus: If the Cat's name is Catwoman, don't set the owner, but instead print: "Catwoman will never be anyone's pet!"
    public static void adoption (Cat adoptee, Person adopter) {

        if(adoptee.getName() == "Catwoman" ) {
            System.out.print("Catwoman will never be anyone's pet!");
        } else {
            adoptee.setOwner(adopter);
        }
    }

    //6. isFree
    //Write a method called isFree that checks whether or not a Cat has an owner.
    public static boolean isFree (Cat any) {

        if (any.)
    }

    //7.isSibling
    //Write a method called isSibling that checks whether or not 2 Cats have the same owner.
    public static boolean isSibling (Cat one, Cat two){
        if (one.getOwner().getName() == two.getOwner().getName()) {
            return true;
        }else {
            return false;
        }
    }

}
