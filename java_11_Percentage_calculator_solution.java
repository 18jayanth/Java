import java.util.Scanner;

public class java_11_Percentage_calculator_solution {

        public static void main(String[] args) {
            System.out.println("This Program is used to calculate total percentage of student in 5 subjects");
            Scanner s=new Scanner(System.in);
            System.out.println("Enter Total Marks for Each  Subject:");
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
          float percentage=(sum*100)/(total*5.0f);
            System.out.println("Percentage of student is "+percentage+"%");

//this solution gives float percentage
        }
    }


