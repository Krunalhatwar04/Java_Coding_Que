package Collection_que;

import java.util.LinkedList;

public class Que12 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Pine_Apple");
        list.add("Grapes");

        String eleString="Banana";
        boolean exist=list.contains(eleString);
        if(exist){
            System.out.println("Element exists in list");
        }
        else{
            System.out.println("Element does not exists in list");
        }
    }
}
