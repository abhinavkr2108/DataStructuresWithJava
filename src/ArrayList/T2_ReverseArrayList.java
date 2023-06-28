package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class T2_ReverseArrayList {
    public static void main(String[] args) {
        var list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Original List");
        System.out.println(list);
//        System.out.println("Reverse List: ");
//        reverseList(list);
        System.out.println("Reverse using inbuilt method");
        Collections.reverse(list);
        System.out.println(list);
    }
    private static void reverseList(ArrayList<Integer> list){
        int i=0, j= list.size()-1;
        while(i<j) {
            var temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
        System.out.println(list);
    }

}
