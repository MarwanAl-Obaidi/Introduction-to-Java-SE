import java.util.Scanner;
public class SalaryCalculation {
  public static void main(String[] args) {
	  float work, salary, tax;
	  
	  Scanner reader = new Scanner(System.in);
	  System.out.print("Type in the amount of work hours: ");
	  work = reader.nextFloat();
	  System.out.print("Type in the salary per hour: ");
	  salary = reader.nextFloat();
	  System.out.print("Type in the tax percent: ");
	  tax = reader.nextFloat();
	  System.out.print("Salary before taxes: " + work * salary + "\n");
	  System.out.print("Amount of tax: " + work * salary * tax / 100 + "\n");
	  System.out.print("Salary after taxes: " + ((work * salary) - (work * salary * tax / 100)) + "\n");
  }
}