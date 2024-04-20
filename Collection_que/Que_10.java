package Collection_que;

import java.util.LinkedList;

public class Que_10 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("Apple");
        list.add("Orange");
        list.add("Pine_Apple");

        list.addFirst("Banana");
        list.addLast("Grapes");
        System.out.println(list);
    }
}
