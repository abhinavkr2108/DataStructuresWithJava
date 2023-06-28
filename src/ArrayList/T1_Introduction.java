package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Arraylist are simply arrays with variable size
 * They have many in-built methods
 */
public class T1_Introduction {
    public static void main(String[] args) {
        var list = new ArrayList<Integer>();
        // 1. Adding elements to arraylist
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //2. Size of ArrayList
        System.out.println(list.size());

        // 3. Get element at a particular index
        var num = list.get(2);
        System.out.println(num);

        // 4. Add element to a particular index
        list.add(2,25);

        // 5. Printing the list
        System.out.println(list);

        // Removing an element
        list.remove(Integer.valueOf(25));
        System.out.println(list);

        // element exsits in a list or not
        var result = list.contains(2);
        System.out.println(result);


    }
}
