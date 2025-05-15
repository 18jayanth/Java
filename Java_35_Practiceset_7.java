public class Java_35_Practiceset_7 {
    static int sumofnaturalnumbers(int num)
    { if (num==1)
    {
        return 1;
    }
        return num+sumofnaturalnumbers(num-1);
    }
    static int fibonacci(int n) {
        if (n ==1 ||n==2) {
            return n-1 ;
        }
        return fibonacci(n - 1)+fibonacci(n-2);
    }
    static float avg(int marks[])
    {
        int sum=0;
        int count=0;
        for (int mark:marks)
        {
           sum+=mark;

        }
        float avg=sum/ (marks.length*1.0f);
        return avg;

    }
    static float celcius_to_fahrenheit(float celcius)
    {
        float fahrenheit=(9*celcius)/5+32;
        return fahrenheit;
    }
    static void pattern1(int n)
    {
        if(n>=1)
        {   pattern1(n-1);
            for(int i=1;i<=n;i++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        else return;
    }
    static void pattern2(int n)
    {
        if(n>=1)
        {
            for(int i=1;i<=n;i++)
            {
                System.out.print("* ");
            }
            System.out.println();
            pattern2(n-1);
            
        }
        else return;
    }
    public static void main(String[] args) {
        //practice-1
        //multiplication table of a given number
//        int num=5;
//        for(int i=1;i<=10;i++)
//        {
//            System.out.println(num+"x"+i+"="+num*i);
//        }

        //practice-2
//        *
//        * *
//        * * *
//        * * * *

//        for(int i=1;i<=4;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //Practice-3
        //write a recursive function to calculate sum of 1st N natural numbers
//        int num=10;
//        int d=sumofnaturalnumbers(num);
//        System.out.println(d);

        //Practice-4
        //* * * *
//        * * *
//        * *
//        *

//        for(int i=4;i>=1;i--)
//        {
//            for (int j=i;j>=1;j--)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //Practice-5
        //nth term of fibonacci using recursion
//        fibonacci(5);
//        fibonacci(10);

        //Practice-6
        //avg of set of numbers passed as arguments
//        int marks[]={99,98,97,96};
//        float avgmarks=avg(marks);
//        System.out.println(avgmarks);

        //Practice-7
        //*
//        * *
//        * * *
//        * * * *
//        pattern1(5);
//
        //Practice-8
        //* * * *
//        * * *
//        * *
//        *
        pattern2(5);




        //Practice-9
        //function to convert celcius to fahrenheit temperature
//        System.out.println(celcius_to_fahrenheit(53));

        //Practice-10
        //write a recursive function to calculate sum of 1st N natural numbers using looops
//        int num=10;
//        int sum=0;
//        for(int i=1;i<=num;i++)
//        {
//             sum+=i;
//        }
//        System.out.println(sum);




    }
}
