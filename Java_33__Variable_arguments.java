public class Java_33__Variable_arguments {
//    static int add(int ... arr)
//    { int total=0;
//        for (int ele:arr)
//        {
//            total+=ele;
//        }
//        return total;
//    }
    //atleast one argument
      static int add(int a,int ... arr)
       { int total=a;
      for (int ele:arr)
       {
           total+=ele;
        }
       return total;
   }
    public static void main(String[] args) {
       //System.out.println("sum of nothing is:"+add());
       System.out.println("sum of 1 and 2 is:"+add(1,2));
        System.out.println("sum of 1,2 and 3 is:"+add(1,2,3));
       System.out.println("sum of 1,2,3 and 4 is:"+add(1,2,3,4));
       System.out.println("sum of 1,2,3,4 and 5 is:"+add(1,2,3,4,5));


    }
}
