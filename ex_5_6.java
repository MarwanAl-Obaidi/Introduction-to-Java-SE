import java.util.Scanner;
public class AbsoluteValue {
  public static void main(String[] args) {
	  float number;
	  
	  Scanner reader = new Scanner(System.in);
	  System.out.print("Type in a floating point number: ");
	  number = reader.nextFloat();
	  System.out.print("The absolute value of the given number is ");
	  System.out.println(Math.abs(number));
  }
}