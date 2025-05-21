class radiusnegativeexception extends Exception
{


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

public class Java_84_Throw_vs_Throws_Exception   {

    public static double  area(int r) throws radiusnegativeexception
    {
        if(r<0)
        throw new radiusnegativeexception();
        double result=Math.PI*r*r;
        return result;
    }
    public static int  divide(int a, int b) throws ArithmeticException
    {
        int result=a/b;
        return result;
    }
    //with throw u can throw custom or build in exceptions
    //throws is used to just send a messsage that it might give an error be careful
    public static void main(String[] args) {
        try {
            //int c = divide(5, 0);
            //System.out.println(c);
            double result = area(-1);
            System.out.println(result);
        }
        catch(Exception e)
        {
            System.out.println("Exception");
        }



    }
}
