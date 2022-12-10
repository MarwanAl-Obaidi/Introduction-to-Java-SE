import java.util.Scanner;
public class ModifiedPrinting {
  public static void main(String[] args) {
	  String name;
	  Scanner reader = new Scanner(System.in);
	  System.out.print("Type in your first name: ");
	  name = reader.nextLine();
	  System.out.print("\n\nHi, " + "\"" + name + "\"\n");
	  System.out.print("\tThe name of this exercise is 'Modifying printing'.\n");
	  System.out.print("\tTabulator, line change and quotations have already been used in this exercise.\n");
	  System.out.print("\tForward slash (\\) is also usable in printing.");
	  System.out.println("\n");
	  System.out.println("");
	  System.out.print("\t\t*** End of exercise ***");
  }
}