public class Java_31_Methods_in_Java {
    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x - 1;
        } else {
            z = y - 1;
        }
        return z;

    }

    public static void main(String[] args) {

        int c = logic(5, 6);

        int d = logic(12, 15);
        //there is another method to call method which is by creating objects
        //the method can be static or non static
        //but to just call without object creaton the method should be static
        //Java_31_Methods_in_Java obj1=new Java_31_Methods_in_Java();
        //int e=obj1.logic(8,9);
        System.out.println(c + " " + d+" ");

    }
}
