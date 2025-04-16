package Lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

    public static void main(String[] args) {

        /*
        * 1. Uses double linked list to store elements internally
        * 2. Contains Duplicate elements
        * 3. Maintains insertion order
        * 4. Manipulation is faster than array list as no shifting is required.
        * 5. In the linked list random access is not possible.
        *  1 -> 2 -> 3 -> 4 */

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(13);
        numbers.add(16);
        numbers.add(23);



        System.out.println(numbers);

        numbers.add(0,100);
        numbers.add(1,200);

        System.out.println(numbers);

        ArrayList<Integer> specialNumbers = new ArrayList<>();
        specialNumbers.add(11);
        specialNumbers.add(22);
        specialNumbers.add(33);
        numbers.addAll(specialNumbers);

        System.out.println(numbers);

        numbers.addFirst(189);
        numbers.addLast(213);

        System.out.println(numbers);

        System.out.println(numbers.contains(213));

        /**
         * [12,13,14,1,5,16] -> linkedList => numbers
         * iterarot() - > to iterate over elements ( to print element wise or perform any operation element wise )
         * numbers.descendingIterator() , numbers.iterator();
         * Iterator<Integer> objectName = numbers.iterator();
         * hasNext() -> true
         * */

        Iterator<Integer> integerIterator = numbers.descendingIterator();
        while(integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }

        System.out.println(numbers.element());
        System.out.println(numbers.get(2));
        System.out.println(numbers.getFirst());


        System.out.println(numbers.getLast());

        System.out.println(numbers.indexOf(100));
        System.out.println(numbers.lastIndexOf(100));


        /**
         * iterator() , listIterator()
         * descendingIterartor()*/

        ListIterator<Integer> integerListIterator = numbers.listIterator();
        while(integerListIterator.hasNext()){
            System.out.println(integerListIterator.next());
        }

        numbers.offer(123445);
        System.out.println(numbers);

        numbers.offerFirst(4312);
        numbers.offerLast(190);
        System.out.println(numbers);

        System.out.println("##################");
        System.out.println(numbers);

        System.out.println(numbers.peek());
        System.out.println(numbers.peekFirst());
        System.out.println(numbers.peekLast());


        System.out.println(numbers.poll());
        System.out.println(numbers.pollFirst());
        System.out.println(numbers.pollLast());
        System.out.println(numbers);

        System.out.println(numbers.pop());

        numbers.push(100);
        System.out.println(numbers);

        numbers.remove(1);
        numbers.removeFirst();
        numbers.removeFirstOccurrence(23);
        numbers.removeLast();
        numbers.removeLastOccurrence(213);
        System.out.println(numbers);


        numbers.set(0,1000);
        System.out.println(numbers);


        System.out.println(numbers.size());

        numbers.clear();
        System.out.println(numbers);


    }
}
