public class Java_15_Practiceset_3 {
    public static void main(String[] args) {
        //Practice -1
//        //wap to convert into lower case
//         String s="Jayanth";
//        s=s.toLowerCase();
//        System.out.println(s);//jayanth

//        //wap to replace spaces with under scores
//        s="Jayanth is a Good Boy";
//        System.out.println(s.replace(" ","_"));//Jayanth_is_a_Good_Boy
//
//        //wap letter ="Dear <|name|> thanks a lot" replace <|name|> with some string
//        String  letter ="Dear <|name|> thanks a lot";
//        letter=letter.replace("<|name|>","Jayanth");
//        System.out.println(letter);//Dear Jayanth thanks a lot
//
        //to detect double spaces and triple spaces in string
        String s="There are  double spaces and   triple spaces in the string";
        System.out.println(s.indexOf("  "));//9
        System.out.println(s.indexOf("   "));//28
        System.out.println(s.indexOf(" "));//5

        //format the letter
        String letter="Dear Jayanth,THis Java Course is nice.Thanks";
        letter="Dear Jayanth,\n This Java Course is nice.\n Thanks";
        System.out.println(letter);
//        Dear Jayanth,
//        This Java Course is nice.
//                Thanks


    }
}
