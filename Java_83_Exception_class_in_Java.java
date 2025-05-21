import java.util.Scanner;

class myexception extends Exception
{
    public myexception(String msg)
    {
        super(msg);
    }

    @Override
    public String toString()
    {
       return super.toString()+" I am to String";
    }
    @Override
    public String getMessage()
    {
        return super.getMessage()+" I am to get message";
    }
}




public class Java_83_Exception_class_in_Java {
    public static void main(String[] args) {
        System.out.println("Please enter the number:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        try {
            if (a < 9) {
                throw new myexception("Input must be greater than 9");
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());//Input must be greater than 9 I am to get message
            System.out.println(e.toString());//myexception: Input must be greater than 9 I am to get message I am to String
            System.out.println(e);//myexception: Input must be greater than 9 I am to get message I am to String
            e.printStackTrace();
            /*
            myexception: Input must be greater than 9 I am to get message I am to String
	at Java_83_Exception_class_in_Java.main(Java_83_Exception_class_in_Java.java:32)

             */

        }

    }
}
