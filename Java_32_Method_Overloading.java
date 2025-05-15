public class Java_32_Method_Overloading {
    static void foo()
    {
        System.out.println("Good Morning!!");
    }
    static void foo(int a)
    {
        System.out.println("Good Morning!!"+a);
    }
    static void foo(int a,int b)
    {
        System.out.println("Good Morning!!"+a+b);
    }
    static void  changeint(int a )
    {
        a=45;

    }
    static void  changearray(int [] a )
    {
        a[0]=45;

    }
    static void response()
    {
        System.out.println("some response");
    }
    public static void main(String[] args) {
        response();
        int x=12;
        System.out.println("x value before change function "+x);
        changeint(x);
        System.out.println("x value after  change function "+x);

        int [] marks={99,98,97,96,95};
        System.out.println("marks[0] value before change function "+marks[0]);
        changearray(marks);
        System.out.println("marks[0] value after  change function "+marks[0]);

        //method overloading
        foo();//Good Morning!!
        foo(1);//Good Morning!!1
        foo(1,2);//Good Morning!!12


    }
}
