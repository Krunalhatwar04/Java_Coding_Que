package Collection_que;

import java.util.LinkedList;

public class Que_9 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Pine_Apple");
        list.add("Grapes");

        int index=2;
        list.add(2,"Water-Melon");
        for (String string : list) {
            System.out.println(string);
        }
    }
}
