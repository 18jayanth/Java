import java.util.Random;
import java.util.Scanner;



class guess_the_number {
    Scanner sc = new Scanner(System.in);
    int no_of_guesses = 0;
    int userchoice;
    int comchoice;

    public guess_the_number(int comchoice) {
        this.comchoice = comchoice;
    }

    public int  takeuserinput() {
        System.out.print("Please Enter Your Guessed Number:");
        userchoice = sc.nextInt();
        return userchoice;
    }

    public void iscorrectnumber() {
        while (true) {
            userchoice=this.takeuserinput();
            if (userchoice == comchoice) {
                System.out.println("You have guessed number in " + no_of_guesses + " attempts");
                break;
            } else if (userchoice > comchoice) {
                System.out.println("You guessed number too higher please lower it");
                no_of_guesses += 1;
            } else {
                System.out.println("You guessed number too lower please increase it");
                no_of_guesses += 1;

            }
        }

    }

}

public class Java_43_Exercise_3_guess_the_number {
    public static void main(String[] args) {
        /*
        Create a class Game,which allows a user to play "Guess the number"game once
        game should have following methods
        1)constructor to generate random number
        2)takeuserinput() to take user input of the number
        3)iscorrectnumber() to check whether guessed number is correct or not
        4)getter and setter for noofguesses
        use properties such as noofguesses, to get the task done
         */
        Random random = new Random();
        int comchoice = 1 + random.nextInt(100);


        guess_the_number g = new guess_the_number(comchoice);
        //g.takeuserinput();
        g.iscorrectnumber();
    }
}
