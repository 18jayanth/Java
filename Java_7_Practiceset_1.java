import java.util.Scanner;
public class Java_7_Practiceset_1 {

    public static void main(String[] args) {

        System.out.println("This consists of 5 problems");
        Scanner sc=new Scanner(System.in);
        //Problem -1
        // to sum three numbers in java
//        System.out.print("Enter First Number:");
//        int a= sc.nextInt();
//        System.out.print("Enter Second Number:");
//        int b= sc.nextInt();
//        System.out.print("Enter Third  Number:");
//        int c= sc.nextInt();
//        int sum=a+b+c;
//        System.out.println(sum);

        //Problem-2
        //to calculate cgpa in three subjects
        System.out.print("Enter Total Marks in 3 subjects:");
        float total= sc.nextFloat();
        System.out.print("Enter First Subject Marks:");
        float sub1= sc.nextFloat();
        System.out.print("Enter Second Subject Marks:");
        float sub2= sc.nextFloat();
        System.out.print("Enter Third Subject Marks:");
        float sub3= sc.nextFloat();
        float sum=sub1+sub2+sub3;
        float cgpa=(sum*10)/total;
        System.out.println(cgpa);

        //Problem-3
        //taking name from user and printing 'hi name have a nice day'
//        System.out.println("Enter a name");
//        String s=sc.nextLine();
//        System.out.println("Hii "+s+" have a nice day!!!");

        //Problem-4
        //kilometers to miles
//        System.out.print("Enter distance in KMS: ");
//        float km=sc.nextFloat();
//        float miles=km/1.6F;
//        System.out.println("Distance in miles: "+miles+" miles");

        //Problem-5
        //entered number is int or not
//        System.out.print("Enter a Integer:");
//        boolean b=sc.hasNextInt();
//        System.out.println(b);


    }
}
