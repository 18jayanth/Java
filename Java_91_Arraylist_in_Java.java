import java.util.*;
public class Java_91_Arraylist_in_Java {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>(5);
        l1.add(11);
        l1.add(22);
        l1.add(33);
        l.add(5);
        l.add(1);
        l.add(8);
        l.add(2);
        l.add(0);
        l.add(0, 2);
        l.add(1, 9);
        l.addAll(0, l1);
        System.out.println(l);
        for (int i : l) {
            System.out.println(i);
        }
//or
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
        System.out.println(l.contains(7));//false
        System.out.println(l.contains(1));//true
        System.out.println(l.indexOf(1));//6

        System.out.println(l.indexOf(2));//3
        //first from last
        System.out.println(l.lastIndexOf(2));//8
        l1.clear();
        System.out.println(l1);//[]
        System.out.println(l);
        l.remove(1);
        System.out.println(l);
        //set method , at what index what u want to insert
        l.set(1, 555);
        System.out.println(l);

        l.removeAll(l1); //~ used to remove all objects of l2 from l1
        l.removeIf(n -> (n % 5 == 0));//~ removes all elements from l1 if that element is divisible by 5
        System.out.println(l);

        l.subList(1, 3); // --> This   method is used  to get elements from index 1 to 3
        // (excluding 3)

        l.retainAll(l1);  //--> This method removes all elements from l1
        // that are not present in l2. Hence, only common elements are retained.
        System.out.println(l);//[] because common between l and l1 is []
        System.out.println(l.isEmpty()); //true
        //method -> returns true if the array is empty (has no elements)
    }
}
