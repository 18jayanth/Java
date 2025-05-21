import java.io.IOException;
import java.util.Scanner;

public class Java_81_handling_specific_exceptions_in_java {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0]=50;
        numbers[1]=80;
        numbers[2]=100;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the index number:  ");
        int index=sc.nextInt();
        System.out.println("Please enter the number u want to divide with:  ");
        int number=sc.nextInt();
        try
        {
            System.out.println("value at given index is :"+numbers[index]);
            System.out.println("value after dividing :"+numbers[index]/number);

        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array out of bound Exception");
            System.out.println(e);
        } catch(Exception e)
        {
            System.out.println("some other exception");
            System.out.println(e);
        }

    }
}
