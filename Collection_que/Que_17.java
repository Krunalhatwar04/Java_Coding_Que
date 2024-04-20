package Collection_que;

import java.util.HashSet;

public class Que_17 {
   public static void main(String[] args) {
    HashSet<Integer> hashSet=new HashSet<>();
    hashSet.add(10);
    hashSet.add(20);
    hashSet.add(30);
    hashSet.add(40);

    Integer[] array = new Integer[hashSet.size()];
    hashSet.toArray(array);
    System.out.println("Array elements:");
    for (int element : array) {
        System.out.println(element);
   } 
}
}
