public class Java_80_try_catch_block_in_Java {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try
        {
            int c=a/b;
            System.out.println("The value of c/b is "+c);
        }
        catch(Exception e){
            System.out.println("we could not able to divide it because of ");
            System.out.println(e);
        }
        System.out.println("End of Program");
    }
}
