import java.util.Scanner;
public class Java_6_Percentage_calculator {

    public static void main(String[] args) {
        System.out.println("This Program is used to calculate total percentage of student in 5 subjects");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Total Marks for Five Subjects");
        int total=s.nextInt();
        System.out.println("Enter First Subject Marks");
        int sub1=s.nextInt();
        System.out.println("Enter Second Subject Marks");
        int sub2=s.nextInt();
        System.out.println("Enter Third Subject Marks");
        int sub3=s.nextInt();
        System.out.println("Enter Fourth Subject Marks");
        int sub4=s.nextInt();
        System.out.println("Enter Fifth Subject Marks");
        int sub5=s.nextInt();
        int sum=sub1+sub2+sub3+sub4+sub5;
        System.out.println("Total Marks is "+sum);
        System.out.println("Percentage of student is "+(sum*100)/total+"%");


    }
}
