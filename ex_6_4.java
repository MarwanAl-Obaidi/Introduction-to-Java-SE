import java.util.Scanner;
import java.math.MathContext;
public class Calculation {
	public static void main(String[] args) {
		int choice, first_number, second_number;
		float float_first_number, float_second_number;
		//float division_result;
		Scanner reader = new Scanner(System.in);
		System.out.print("Choose from the following calculations:\n");
		System.out.print("1: subtraction\n");
		System.out.print("2: addition\n");
		System.out.print("3: multiplication\n");
		System.out.print("4: division\n");
		System.out.print("5: remainder\n\n");
		System.out.print("Make your choice: ");
		choice = reader.nextInt();
		if (choice >= 1 && choice <= 5) {
			switch (choice) {
			case 1:
				System.out.print("\nType in the first number: ");
				first_number = reader.nextInt();
				System.out.print("Type in the second number: ");
				second_number = reader.nextInt();
				System.out.print("\n" + first_number + " - " + second_number + " = " + (first_number - second_number));
				break;
			case 2:
				System.out.print("\nType in the first number: ");
				first_number = reader.nextInt();
				System.out.print("Type in the second number: ");
				second_number = reader.nextInt();
				System.out.print("\n" + first_number + " + " + second_number + " = " + (first_number + second_number));
				break;
			case 3:
				System.out.print("\nType in the first number: ");
				first_number = reader.nextInt();
				System.out.print("Type in the second number: ");
				second_number = reader.nextInt();
				System.out.print("\n" + first_number + " * " + second_number + " = " + (first_number * second_number));
				break;
			case 4:
				System.out.print("\nType in the first number: ");
				float_first_number = reader.nextInt();
				System.out.print("Type in the second number: ");
				float_second_number = reader.nextInt();
				float division_result = float_first_number / float_second_number;
				System.out.print("\n" + Math.round(float_first_number) + " / " + Math.round(float_second_number) + " = " + division_result);
				break;
			case 5:
				System.out.print("\nType in the first number: ");
				first_number = reader.nextInt();
				System.out.print("Type in the second number: ");
				second_number = reader.nextInt();
				System.out.print("\n" + first_number + " % " + second_number + " = " + (first_number % second_number));
				break;
			default:
				System.out.println("Choice is between 1 and 5.");
			}
		} else {
				System.out.println("Invalid choice.");
		}
	}
}