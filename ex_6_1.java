import java.util.Scanner;
public class OddOrEven {
  public static void main(String[] args) {
	  int number;
	  Scanner reader = new Scanner(System.in);
	  System.out.print("Type in an integer: ");
	  number = reader.nextInt();
	  if (number % 2 == 0)
		  System.out.println("Number " + number + " is even.");
	  else
		  System.out.println("Number " + number + " is odd.");
  }
}