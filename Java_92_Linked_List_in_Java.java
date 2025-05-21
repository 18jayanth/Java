import java.util.*;

public class Java_92_Linked_List_in_Java {
    public static void main(String[] args) {
        //linked list has lower insertion and deletion costs compared to arraylists
        //but searching will take more cost
        //allmethods which are in arraylist applicable to linked list
        LinkedList<Integer> l = new LinkedList<>();
       LinkedList<Integer> l1 = new LinkedList<>();
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



        //methods exclusive to linked list
        // l []
        l.addFirst(5);
        l.addFirst(6);
        l.addFirst(7);
        l.addLast(8);
        l.addLast(9);
        System.out.println(l);//[7,6,5,8,9]

        //toArray()  as the name says it converts a linked list to a sequential array

        Object[] obj = l.toArray(); //

        //   obj is the array containing the same value as of the linkedList
        for(Object item : obj) {
            System.out.print(item+" ");//7 6 5 8 9
        }
    }
}
