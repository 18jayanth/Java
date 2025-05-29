import java.util.ArrayDeque;

public class Java_93_Array_dequeues {
    public static void main(String[] args) {
        //array de queue
        //de queue => double ended queue
        //we can insert ,delete from anyone of the sides
        /*
 Constructor Details

ArrayDeque
public ArrayDeque()
Constructs an empty array deque with an initial capacity sufficient to hold 16 elements.

ArrayDeque
public ArrayDeque(int numElements)
Constructs an empty array deque with an initial capacity sufficient to hold the specified number of elements.
Parameters:
numElements - lower bound on initial capacity of the deque
         */

        ArrayDeque<Integer>ad1=new ArrayDeque<>();
        ad1.add(5);
        ad1.add(65);
        ad1.addFirst(3);
        ad1.offerFirst(2);//same as addFirst but dont throw exception(safe)
        ad1.addLast(10);
        ad1.offerLast(11);//same as addLast  but dont throw exception(safe)
        ad1.removeFirst();
        ad1.pollFirst();//same as removeFirst but don't throw exception(safe)
        ad1.removeLast();
        ad1.pollLast();//same as removeLast but don't throw exception(safe)
        System.out.println(ad1);
        System.out.println(ad1.getFirst());//5
        System.out.println(ad1.peekFirst());//5 same as getfirst but dont throw exception(safe)
        System.out.println(ad1.getLast());//65
        System.out.println(ad1.peekLast());//65 same as getLast but dont throw exception(safe)
    }
}
