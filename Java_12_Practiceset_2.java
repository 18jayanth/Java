import java.util.Scanner;

public class Java_12_Practiceset_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //practice-1
        //result of following expression  float a=7/4*9/2
//        float a=  7 /4*9/2;
//        System.out.println(a);//4.0
//         //first 7/4 =1
//        //second 1 *9=9
//        //third 9/2 =4

        //practice-2
        //encrypt a grade by adding 8 to it and decrypt it
        char a = 'A';
        //encryption
        char b = (char) (a + 8);
        System.out.println(b);//I
        //decryption
        a = (char) (b - 8);
        System.out.println(a);//A

        //Practice-3
        // use comparision  operator to find whether given number is greater than user defined no
//        int a=12;
//        System.out.println("Enter the Integer:");
//        int b=sc.nextInt();
//        if(a>b)
//        {
//            System.out.println("a is greater");
//        }
//        else if(b>a)
//        {
//            System.out.println("b is greater");
//        }
//        else {
//            System.out.println("both are equal");
//        }

        //Practice-4
        //write following expression in java (v2-u2)/2aS
//        int u=5;
//        int v=10;
//        int s=50;
//        int a=2;
//        double  value=(Math.pow(v,2)-Math.pow(u,2))/(2*a*s);
//        System.out.println(value);

        //Practice-5
        //value of following expression
//        int x=7;
//        int a=7*49/7+35/7;
//        //a=7*49
//        //a=7*49/7=49
//        //a=49+35/7
//        //a=49+5
//        //a=54
//        System.out.println(a);//54


    }
}
