public class Java_14_String_Methods {
    public static void main(String[] args) {
        String name="Jayanth";
       System.out.println(name.length());//7
        System.out.println(name.toLowerCase());//jayanth
       System.out.println(name.toUpperCase());//JAYANTH

       String name1=" Jayanth ";
       System.out.println(name1.trim());//Jayanth

        System.out.println(name.substring(1));//ayanth
        System.out.println(name.substring(1,4));//aya

        System.out.println(name.replace('y','i'));//Jaianth
        System.out.println(name.replace("Jay","Pai"));//Paianth

        System.out.println(name.startsWith("Jay"));//true
        System.out.println(name.endsWith("nth"));//true

        System.out.println(name.charAt(3));//'a'

        System.out.println(name.indexOf("jay"));//-1
        System.out.println(name.indexOf("Jay"));//0
        System.out.println(name.indexOf("Jay",2));//-1
        System.out.println(name.indexOf("a"));//1
        System.out.println(name.indexOf("a",2));//3

        System.out.println(name.lastIndexOf("jay"));//-1
        System.out.println(name.lastIndexOf("Jay"));//0
        System.out.println(name.lastIndexOf("Jay",2));//0
        System.out.println(name.lastIndexOf("a"));//3
        System.out.println(name.lastIndexOf("a",2));//1

        System.out.println(name.equals("jayanth"));//false
        System.out.println(name.equals("Jayanth"));//true
        System.out.println(name.equalsIgnoreCase("jayanth"));//true
        System.out.println(name.equalsIgnoreCase("Jayanth"));//true


        //Escape sequence
        System.out.println("These are Double Quotes \"   ");//These are Double Quotes "
        System.out.println("These are slash \\   ");//These are slash \
        System.out.println("These are backspace \b   ");//These are backspace
        System.out.println("These are to give a tab space \t space before it   ");
        //These are to give a tab space 	 space before it
        System.out.println("These are next line ecape sequence \n it will be in next line  ");
//        These are next line ecape sequence
//        it will be in next line





    }
}
