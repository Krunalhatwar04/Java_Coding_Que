package Collection_que;

import java.util.LinkedList;

public class Que_11 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Pine_Apple");
        list.add("Grapes");

        for(int i=0;i<list.size();i++){
            System.out.println("Position " + i + ": " + list.get(i));
        }
    }
}
