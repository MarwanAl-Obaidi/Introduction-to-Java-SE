import java.util.Scanner;
public class DecimalCalculations {
  public static void main(String[] args) {
	  float first_number, second_number;
	  
	  Scanner reader = new Scanner(System.in);
	  System.out.print("Type in the first number: ");
	  first_number = reader.nextFloat();
	  System.out.print("Type in the second number: ");
	  second_number = reader.nextFloat();
	  System.out.print("Result of the multiplication: " + first_number * second_number + "\n");
	  System.out.print("Result of the division: " + first_number / second_number);
  }
}