package Collection_que;

import java.util.LinkedList;

public class Que_14 {
    public static void main(String[] args) {
        LinkedList<Integer> list= new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original linked list: " + list);
        list.set(1, 0); // Replace the element at index 1
        System.out.println("After replacing an element: " + list);


    }
}
