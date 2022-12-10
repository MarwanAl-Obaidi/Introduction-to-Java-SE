import java.util.Scanner;
public class AskName {
  public static void main(String[] args) {
	  String first_name, last_name;
	  int age;
	  
	  Scanner reader = new Scanner(System.in);
	  System.out.print("Type in your last name: ");
	  last_name = reader.nextLine();
	  System.out.print("Type in your first name: ");
	  first_name = reader.nextLine();
	  System.out.print("Type in your age: ");
	  age = reader.nextInt();
	  System.out.print("You are " + first_name + " " + last_name + " and your age is " + age + " years.");
  }
}