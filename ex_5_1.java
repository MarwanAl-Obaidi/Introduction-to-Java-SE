import java.util.Scanner;
public class Calculation {
  public static void main(String[] args) {
	  int first_number, second_number;
	  Scanner reader = new Scanner(System.in);
	  System.out.print("Type the first number: ");
	  first_number = reader.nextInt();
	  System.out.print("Type the second number: ");
	  second_number = reader.nextInt();
	  System.out.print("Sum of the numbers you typed is " + (first_number + second_number));
  }
}