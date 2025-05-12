import java.util.Scanner;
public class Java_8_operators_types_Expressions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Arthemtic Operators
//        int a=10;
//        int b=8;
//        int add=a+b;
//        int sub=a-b;
//        int mul=a*b;
//        int div=a/b;
//        int mod=a%b;
//        System.out.println(add+" "+sub+" "+mul+" "+div+" "+mod);

        //Arithmetic Operators
//        int a=10;
//        int b=20;
//        int c=a;
//        int d=30;
//         d+=b;
//        System.out.println(c+" "+d);

        //Comparision Operator
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        if(a<b)
//        {
//            System.out.println("a is smaller");
//        }
//        else if(a>b)
//        {
//            System.out.println("b is smaller");
//        }
//        else if(a==b)
//        {
//            System.out.println("both are equal");
//        }

        //logical operators
//        int a=15;
//        int b=4;
//        if (a>=5 && b>=5)
//        {
//            System.out.println("both greater than 5");
//        }
//        else {
//            System.out.println("both not greater than 5");
//        }
//        if (a>=5 || b>=5)
//        {
//            System.out.println("atleast one  greater than 5");
//        }
//if(!(a<=5))
//{
//    System.out.println("a is greater than 5");
//}

        //bitwise operators
        int a=5;
        int b=6;
        int c=a & b;
        int d=a | b;
        System.out.println(c+" "+d);
    }
}
