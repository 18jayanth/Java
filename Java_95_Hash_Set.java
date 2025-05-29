import java.util.HashSet;

public class Java_95_Hash_Set {
    public static void main(String[] args) {
        /*
  Constructor                         Description

HashSet()                             Constructs a new, empty set; the backing HashMap
                                       instance has default initial capacity (16) and
                                        load factor (0.75).
HashSet(int initialCapacity)                Constructs a new, empty set; the backing HashMap
                                             instance has the specified initial capacity and
                                              default load factor (0.75).
HashSet(int initialCapacity, float loadFactor)Constructs a new, empty set; the backing HashMap
                                             instance has the specified initial capacity and
                                             the specified load factor.
HashSet(Collection<? extends E> c)
Constructs a new set containing the elements in the specified collection.






Modifier and Type      Method       Description

boolean                add(E e)        Adds the specified element to this set if it is not
                                        already present.
void                   clear()         Removes all of the elements from this set.
Object                 clone()         Returns a shallow copy of this HashSet instance:
                                         the elements themselves are not cloned.
boolean           contains(Object o)    Returns true if this set contains the specified element.
boolean               isEmpty()         Returns true if this set contains no elements.
Iterator<E>           iterator()         Returns an iterator over the elements in this set.
static         <T> HashSet<T>newHashSet(int numElements) Creates a new, empty HashSet suitable for the expected number of elements.
boolean          remove(Object o)          Removes the specified element from this set if it is present.
int                 size()                 Returns the number of elements in this set (its cardinality).
Spliterator<E>       spliterator()         Creates a late-binding and fail-fast Spliterator over the elements in this set.
Object[]               toArray()             Returns an array containing all of the elements in this collection.
<T> T[]              toArray(T[] a)           Returns an array containing all of the elements in this collection; the runtime type of the returned array is that of the specified array.

         */
        HashSet<Integer>m=new HashSet<>(5,0.5f);
        m.add(5);
        m.add(5);
        m.add(6);
        m.add(7);
        System.out.println(m);

    }
}
