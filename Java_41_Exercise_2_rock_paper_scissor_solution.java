import java.util.Random;
import java.util.Scanner;

public class Java_41_Exercise_2_rock_paper_scissor_solution {


    public static void main(String[] args) {
        //1 rock 2 paper 3 scissor
        System.out.println("1.Rock 2.Paper 3.Scissors");
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int num = 5;
        int dup = 5;
        int compoints = 0;
        int userpoints = 0;
        while (num > 0) {
            int comchoice = 1 + random.nextInt(3);
            // System.out.println(comchoice);
            int userchoice = sc.nextInt();
            // System.out.println(userchoice);
            if (comchoice == userchoice) {
                System.out.println("you have drawn");
            } else if ((comchoice == 1 && userchoice == 2) || (comchoice == 3 && userchoice == 1) || (comchoice == 2 && userchoice == 3)) {
                System.out.println("you have won");
                userpoints += 1;
            } else {
                System.out.println("You have lost");
                compoints += 1;
            }

            num -= 1;
        }
        System.out.println("After " + dup + " games " + "computer got " + compoints + " marks and you " +
                " have got " + userpoints + " marks");
    }
}
