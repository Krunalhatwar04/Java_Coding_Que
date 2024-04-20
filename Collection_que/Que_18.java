package Collection_que;

import java.util.HashSet;
import java.util.Set;

public class Que_18 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Add elements to the first set
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Add elements to the second set
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set1.retainAll(set2);// Retain elements which are common to both sets
        System.out.println("Elements common to both sets:");
        for (Integer element : set1) {
            System.out.println(element);
    }
}
}