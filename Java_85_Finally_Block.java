public class Java_85_Finally_Block {

    public static int  greet()
    {
        try
        {
            int a=50;
            int b=0;
            int c=a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);

    }
        finally{
            System.out.println("This is end of program");
        }
        System.out.println("This block is outside finally executes only if exception");
        return 0;
    }
    public static void main(String[] args) {
        //finally will execute even after we return the funtion
        int k=greet();
        System.out.println(k);

        //we can write try and finally alone but we are not catching the error
        try{
            int a=5/0;
        }
        finally{
            System.out.println("this is finally");
        }
        /*
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Java_85_Finally_Block.main(Java_85_Finally_Block.java:28)
         */

    }
}
