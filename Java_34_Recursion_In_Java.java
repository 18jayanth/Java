public class Java_34_Recursion_In_Java {
    static int  factorial(int n)
    {
        if (n==0 || n==1)
    {
        return 1;
    }
        return n*factorial(n-1);
    }
    static void fibonacci(int n,int a,int b)
    {
        if(n<=0)
        return ;
        System.out.println(a);
        int c=a;
        a=b;
        b=c+b;
        fibonacci(n-1,a,b);


    }
    public static void main(String[] args) {
        System.out.println("Factorial of the number is "+factorial(5));
        System.out.println("Factorial of the number is "+factorial(10));

        fibonacci(5,0,1);
        System.out.println();
        fibonacci(10,0,1);

    }
}
