import java.util.Scanner;

public class Java_79_syntax_logical_runtime_errors_in_Java {
    public static void main(String[] args) {

        //syntax errors
        //int a=5 Error:semicolon is missing
        //b=6;Error:b is not declared


        //logical error
        //write a program to print prime numbers from 1 to 10
        int i=2;
        System.out.println(i);
        for( i=1;i<5;i++)
        {
            System.out.println(2*i+1);
        }
        //its printing 9 but its not prime so logical error

        //Run time Errors
        /*
        int k;
        Scanner sc=new Scanner(System.in);
        k= sc.nextInt();
        System.out.println("thousand divided by k is "+1000/k);

       Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Java_79_syntax_logical_runtime_errors_in_Java.main
	(Java_79_syntax_logical_runtime_errors_in_Java.java:25)

         */

    }
}
