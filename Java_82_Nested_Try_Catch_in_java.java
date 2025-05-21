import java.util.Scanner;

public class Java_82_Nested_Try_Catch_in_java {
    public static void main(String[] args) {
        int[] marks=new int[3];
        marks[0]=50;
        marks[1]=80;
        marks[2]=100;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of index");
        int index=sc.nextInt();
        try
        {
            System.out.println("Nested try and catch");
            try
            {
                System.out.println(marks[index]);
            }
            catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println(e);
                    System.out.println("Exception at level 2");
                }



        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println("Exception at level 1");
        }

    }
}
