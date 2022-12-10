# Introduction-to-Java-SE
A course I did that teaches the fundamentals of Java programming.

## ex_3_1
First copy the example source code below to the text box further down. Example includes syntax errors. Press “answer” button. Carmatic checking and feedback system tells you where and what kind of error the code contains. You can also see what the Java-compiler says about the error. Find the errors in the given code and fix them so that the source code does not contain syntax errors and the program works according to the example print.

Program is written to a class called Introduction.

```
public class first

  public static void main (String [] args) {
    System.out.println("First contact with programming.")
  }
}
```

## ex_3_2
Create a Java-program that prints “Hi all!” on screen.

Program is written to a class called Greeting.

## ex_4_1
Copy the source code below to the text box. Locate the errors in code and fix them.

Hint: Example print shows what values need to be used for variable initialization.

Program is written to a class called InvalidVariables

```
public class InvalidVariables {
    public static void main (String [] args) {
        int number = 2.5;
        boolean truth = TRUE;
        char character = "A";
        String string = 'This is a character string';
 
        System.out.println("Integer: " + number);
        System.out.println("Truth: " + truth);
        System.out.println("Character: " + character);
        System.out.println("Character string: " + string);
    }
}
```

## ex_4_2
Your task is to define the required variables and initialize them with values that will match the print with the shown example.

You only need to write the variable definitions and initializations in the text box.

Hint: Check the example print for correct values for variables.

Program to complete:

```
public class Variables {
    public static void main (String[] args) {
        // Your own code here
        String end = "and here is the end";
        String fullText = start + end;        
        
        System.out.println("Value of the integer variable is: " + integer);
        System.out.println("Value of the character variable is: " + character);
        System.out.println("Value of the character string variable is: " + string);
        System.out.println("Value of the concatenated character string is: " + fullText);
        System.out.println("Value of the truth variable is: " + truth);
    }
}
```

## ex_4_3
Your task is to complete the program below by defining five variables (first, second, third, fourth and fifth). Find out which variables are int type and which are String type from the example print. You need to find out the values used to initialize the variables in the example print.

Write only the missing statements in the text box.

Program to complete:

```
public class Concatenation {
    public static void main(String[] args) {
        
        // Place your code here
        
        System.out.println(first + fourth + (second + third) + fifth
             + ":Finland was the world champion in ice hockey.");
                        
        System.out.println(first + "" + (first + third) + (first - 1) + fourth
             + ": Finland went under Russian rule.");   
                       
        System.out.println(first + fifth + fifth + (first - 1)
             + ": Helsinki was founded.");
    }
}
```

## ex_5_1
Make a program that asks two integers from the user, counts their sum and prints the result on screen. Use methods from Scanner class to read the data.

Program is written to a class called Calculation.

## ex_5_2
Write a program that asks for the first name of the user and then prints the text shown in the example print. The print should be modified to be identical with the example print. Tabulator has been used to create the empty spaces in the beginning of each line.

Program is written to a class called ModifiedPrinting.

```
Type in your first name: Lisa


Hi, "Lisa"
	The name of this exercise is 'Modifying printing'.
	Tabulator, line change and quotations have already been used in this exercise.
	Forward slash (\) is also usable in printing.


		*** End of exercise ***
```

## ex_5_3
Create a Java-program that prints the salary of an employee before taxes, after taxes and the amount of tax. 

Program first asks for three floating point numbers (work hours, salary per hour and tax percent) and based on these values, calculates amount of taxes and salary before and after taxes.

Hint: Amount of taxes can be calculated with the formula: hours*salary per hour*tax percent/100

Program is written to a class called SalaryCalculation.

## ex_5_4
Create a Java-program that asks the user’s first name, last name and age. The program must combine the first and last name to a single variable so that the value of the variable is both names divided with a space. After this the program prints the name and age of the user.

Hint:The + operator can be used to combine the names.

Program is written to a class called AskName.

## ex_5_5
Create a Java-program that asks for two double type floating point numbers and then performs multiplication and division with the given numbers. First number acts as the divided number in division and the second one is the divisor. The program prints the results of both calculations in the end.

Program is written to a class called DecimalCalculations.

## ex_5_6
Create a Java-program that asks for a double type floating point number and then prints the absolute value of the number as shown in the example print. Program is to be implemented with the use of conditional operator “?”, using if statement is forbidden.

Program is written to a class called AbsoluteValue.