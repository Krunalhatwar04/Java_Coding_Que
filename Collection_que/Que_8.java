package Collection_que;

import java.util.LinkedList;

public class Que_8 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Pine_Apple");
        list.add("Grapes");

        System.out.println("Original LinkedList: " + list);
        list.addLast("Mango");
        System.out.println("Ater last Add LinkedList: " + list);

    }
}
