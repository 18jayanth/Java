import java.util.Objects;
import java.util.Scanner;

class invalidinputexception extends Exception {

    @Override
    public String toString() {
        return super.toString() + " Invalid input Exception";
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " Invalid input Exception";
    }
}

class cannotdividebyzero extends Exception {

    @Override
    public String toString() {
        return super.toString() + "cannot divide by zero";
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " Cannot divide by Zero";
    }
}

class maxinputException extends Exception {

    @Override
    public String toString() {
        return super.toString() + " max input exception";
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " max input exception";
    }
}

class maxmultiplierException extends Exception {

    @Override
    public String toString() {
        return super.toString() + " max multipler exception";
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " max multiplier exception";
    }
}


public class Java_87_Exercise_6_Custom_Calculator {
    public static boolean isNumeric(String str) {
        // Check if all characters are digits
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        /*
        You have to create a custom calculator with following operations
        1.  + ->Addition
        2.  - ->Subtraction
        3.  * ->Multiplication
        4>  / ->division
        which throws following exceptions
        1)Invalid Input Exception 8&9
        2)Cannot divide by 0 Exception
        3)Max input Exception->if any of the inputs greater than 100000
        4)Max Multipler Reached Exception->Dont allow any multiplication input to be greater
        than 7000

         */

        int res = 0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Please Enter first number: ");
            String inputa = sc.next();
            System.out.print("Please Enter second number: ");
            String inputb = sc.next();
            System.out.print("Please Enter operation (+, -, *, /): ");
            String op = sc.next();

            if (!isNumeric(inputa) || !isNumeric(inputb)) {
                throw new invalidinputexception();
            }
             int a = Integer.parseInt(inputa);
             int b = Integer.parseInt(inputb);
             if(a==8||a==9||b==8||b==9)
                 throw new invalidinputexception();
             if(a>=100000 || b>=100000)
                 throw new maxinputException();


            if (Objects.equals(op, "+")) {
                res = a + b;
                System.out.println(res);
            }
            if (Objects.equals(op, "-")) {
                res = a - b;
                System.out.println(res);
            }
            if (Objects.equals(op, "*")) {
                if (a > 7000 || b > 7000)
                    throw new maxmultiplierException();
                res = a * b;

            }
            if (Objects.equals(op, "/")) {
                if (b == 0)
                    throw new cannotdividebyzero();
                res = a / b;
                System.out.println(res);


            }


        }
        catch (Exception e) {
            System.out.println(e);

        }
    }
}
