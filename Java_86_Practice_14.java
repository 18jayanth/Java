import java.util.Scanner;
class maxtriesexception extends Exception {

    @Override
    public String toString() {
        return super.toString() + " Index out of Range";
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " Index out of Range";
    }
}


public class Java_86_Practice_14 {
    public static void  maxtries(int i) throws maxtriesexception
    {
        if(i>=5)
            throw new maxtriesexception();


    }
    public static void greet(String name)
    {
        if (name == null || name.trim().isEmpty() || name.matches("-?\\d+")) {
            throw new IllegalArgumentException("Invalid name: Name must be a non-empty string, not a number.");
        }
        System.out.println("Hello "+name);
    }
    public static void main(String[] args) {
        //practice-1
        //write a java program to demonstrate logical,runtime,syntax errors
        //syntax errors
        int a=5;
       // int b=3 missing semicolons

        //logical errors
        //to print even numbers from 1 to 10
        //mistake in logic , instead of i%2==0 we wrote i%2!=0
        for(int i=0;i<10;i++ )
        {
            if(i%2!=0)
                System.out.println(i);
        }

        //runtime errors
//        int b=5;
//        Scanner sc=new Scanner(System.in);
//        int c=sc.nextInt();
//        int d=b/c;
//        System.out.println(d);//if c is 0 it will throw an error

        //Practice-2
        //write a java program that prints "haha" during arithmetic exception
        //"hehe" during illegal argument exception

        try {
            greet("-5");
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("hehe");
        }
        catch(ArithmeticException e)
        {
            System.out.println("haha");
        }


        //Practice-3
        //write a program that allows to keep accessing an array
        //until a valid index is given
        //if max retries exceed 5 print error
        boolean flag=true;
        int[] arr=new int[3];
        arr[0]=50;
        arr[1]=60;
        arr[2]=70;
        int index;
        int i=0;
        while(flag && i<5)
        {
            try {
                System.out.print("Please enter index:");
                Scanner sc = new Scanner(System.in);
                index = sc.nextInt();
                System.out.println("Value of arr[index] is " + arr[index]);
                break;
            }
            catch(Exception e)
            {
                System.out.println("Its not valid index");
                i++;
            }
        }
        //Practice-4 modify program in question 3 to throw a custom exception
        //if max tries are reached
        //Pratice-5 Wrap the program in question 3 inside a method which throws u custom exception
        try {
            maxtries( 5);

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println(e);
        }



    }
}
