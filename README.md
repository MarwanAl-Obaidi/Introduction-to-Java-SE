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