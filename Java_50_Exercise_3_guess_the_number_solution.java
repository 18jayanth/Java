import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

class Game1 {
    int number;
    int noofguesses;
    int inputnumber;

    public int getNoofguesses() {
        return noofguesses;
    }

    public void setNoofguesses(int noofguesses) {
        this.noofguesses = noofguesses;
    }

    public Game1() {
        Random rand = new Random();
        this.number = rand.nextInt(100);

    }

    void takeuserinput() {
        System.out.println("Guess the number:");
        Scanner sc = new Scanner(System.in);
        inputnumber = sc.nextInt();
    }

    boolean iscorrectnumber() {
        noofguesses++;
        if (inputnumber == number) {
            System.out.println("you guessed it correctly in "+noofguesses+" guesses");
            return true;
        }
        else if(inputnumber<number)
            System.out.println("number too low");
        else
            System.out.println("number too high");
        return false;


    }
}

public class Java_50_Exercise_3_guess_the_number_solution {
    public static void main(String[] args) {
        Game1 g = new Game1();
        boolean b=false;
        while(!b) {
            g.takeuserinput();
            b = g.iscorrectnumber();
            System.out.println(b);
        }


    }
}
