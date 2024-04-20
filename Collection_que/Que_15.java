package Collection_que;

import java.util.HashSet;
import java.util.Iterator;

public class Que_15 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);
        Iterator<Integer> itr=hashSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
