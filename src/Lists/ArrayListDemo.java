package Lists;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        /*
        * 1. Uses Dynamic array
        * 2. Contains duplicates
        * 3. Maintains Insertion order
        * 4. Random access is possible - Based on index we can get the value at that index
        * 5. Slower than linked list as it requires a lot of shifting .
        * 6. Collections are defined only on wrappers classes. (Integer , String )
        * int => dataType , Integer is Wrapper Class of Int
        * float => Float
        * double => Double
        * */

        /**
         * int[] numbers = new int[5];
         * numbers = { 1 ,2 , 3 , 4 ,5 }
         * [ 1,2,3,4,5]
         * arr[0] => 1
         * arr[1]  => 2*/

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(16);
        numbers.add(23);

        /** [13,16,23]
         * numbers.add(1,100)
         *  [13  100 16 23  ]
         *  remove(100)
         *  13 16 23 => Shifting */



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


        System.out.println(numbers.get(0));

        System.out.println(numbers.isEmpty());


        numbers.add(11);
        System.out.println(numbers);
        System.out.println(numbers.lastIndexOf(11));  //[11,11,11,11]  => 3

        System.out.println(numbers.contains(11));

        numbers.remove(5);
        System.out.println(numbers);

        System.out.println(numbers.size());

        numbers.clear();

        System.out.println(numbers);


    }
}
