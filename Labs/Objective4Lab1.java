import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("What is your first name?");
    String fname = input.nextLine();
    System.out.println("What is your last name?");
    String lname = input.nextLine();
    System.out.println("What is your favorite animal?");
    String favoriteAnimal = input.nextLine();
    System.out.println("What is your favorite food?");
    String favoriteFood = input.nextLine();
    System.out.println("What is your favorite song?");
    String favoriteSong = input.nextLine();
System.out.println("My name is " +fname+ " " +lname);
System.out.println("My favorite animal is the " +favoriteAnimal);
System.out.println("My favorite food is " +favoriteFood);
System.out.println("My favorite song is " +favoriteSong);
    //TODO prompt the user to get input for all of the String variables.

    //TODO print the output formatted to look like the expected output using String concatenation.

  }
}
