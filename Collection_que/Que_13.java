package Collection_que;

import java.util.LinkedList;

public class Que_13 {
    public static void main(String[] args) {
        
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        boolean check=list1.equals(list2);
        if(check){
            System.out.println("The two linked lists are equal.");
        }
        else{
            System.out.println("The two linked lists are not equal.");
        }

}
}
