public class Java_9_associavity_precedence {
    public static void main(String[] args) {
        //int a=30*5-30/5;
        //int b=30/5-30*5;
       // System.out.println(a+" "+b);
        //*,/ has more precedence than +,-
        //*,/ left associtative
        int a=1;
        int b=2;
        int c=3;

        int k=b*b-(4*a*c)/(2*a);
        System.out.println(k);//-2
        //first 4*a*c =4*1*3=12
        //next 2*a 2*1=2
        //then b*b 2*2=4
        //then 4ac/2a 12/2=6
        //then b*b-4ac/21 =4-6=2
    }
}
