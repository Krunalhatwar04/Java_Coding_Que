package Collection_que;

import java.util.TreeSet;

public class Que_20 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet=new TreeSet<>();
        treeSet.add(5);
        treeSet.add(7);
        treeSet.add(3);
        treeSet.add(10);
        treeSet.add(2);
        for (Integer a : treeSet) {
            if(a<7){
                System.out.println(a);
            }
        }
    }
}
