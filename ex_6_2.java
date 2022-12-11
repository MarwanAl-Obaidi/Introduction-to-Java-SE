import java.util.Scanner;
public class ForLoop {
  public static void main(String[] args) {
	  int number;
	  Scanner reader = new Scanner(System.in);
	  System.out.print("Type in an integer: ");
	  number = reader.nextInt();
	  if (number >= 0)
		  for(int i = number; i >= 0; i--) {
		  System.out.print(i + "\n");
	  }
	  else
		  System.out.print("Input is not a positive integer.");
  }
}