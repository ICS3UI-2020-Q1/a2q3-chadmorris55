import java.util.Scanner;
/**
 * This program will put 2 entered integers in ascending order
 * @Chad 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner for user input
    Scanner input = new Scanner(System.in);
    
    // asks user for two integers and records them
    System.out.println("Please enter an integer:");
    int num1 = input.nextInt();
    System.out.println("Please enter another integer:");
    int num2 = input.nextInt();

    //finds out which is larger and tells the user the order
    if (num1 > num2){
      System.out.println("Your numbers in ascending order are " + num2 + ", " + num1);
    } else if (num2 > num1){
        System.out.println("Your numbers in ascending order are " + num1 + ", " + num2);
    } else if (num1 == num2){
        System.out.println("Your numbers in ascending order are " + num1 +", " + num2);
    } else {
      System.out.println("how");
    }

  }
}
