public class Java_78_Errors_and_Exceptions_in_Java {
    public static void main(String[] args) {
        //syntax errors
        // int a=5  java: ';' expected
        //system.out.println(a);

       // int a=5;
      //  System.out.println(a+b); cannot find symbol
        //  symbol:   variable b
        /*
 Syntax Errors:
These occur when the code violates the rules of the Java language, such as missing semicolons,
 incorrect casing, or mismatched brackets. They are usually detected during compilation.


Runtime Errors:
Also known as exceptions, these errors happen during program execution. Examples
 include ArrayIndexOutOfBoundsException (accessing an invalid array index),
 NullPointerException (trying to use a null object reference),
 and ArithmeticException (division by zero).

Logical Errors:
These occur when the code compiles and runs without crashing but produces unexpected results
due to flaws in the program's logic.


Runtime Errors:
Also known as exceptions, these errors happen during program execution. Examples
 include ArrayIndexOutOfBoundsException (accessing an invalid array index),
 NullPointerException (trying to use a null object reference),
 and ArithmeticException (division by zero).
Run Time errors occur or we can say, are detected during the execution of the program. Sometimes these are discovered when the user enters an invalid data or data which is not relevant. Runtime errors occur when a program does not contain any syntax errors but asks the computer to do something that the computer is unable to reliably do. During compilation, the compiler has no technique to detect these kinds of errors. It is the JVM (Java Virtual Machine) that detects it while the program is running. To handle the error during the run time we can put our error code inside the try block and catch the error inside the catch block.
For example: if the user inputs a data of string format when the computer is expecting an integer, there will be a runtime error.
Example 1: Runtime Error caused by dividing by zero




1
// Java program to demonstrate Runtime Error
2
​
3
class DivByZero {
 public static void main(String args[])
{
int var1 = 15;
int var2 = 5;
int var3 = 0;
int ans1 = var1 / var2;
// This statement causes a runtime error,
// as 15 is getting divided by 0 here
int ans2 = var1 / var3;
System.out.println("Division of va1"+ " by var2 is: "+ ans1);
System.out.println("Division of va1"+ " by var3 is: "+ ans2);

    }
}


         */



    }
}
