package Collection_que;

import java.util.HashMap;
import java.util.Map;

public class Que_22 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1, "A"); 
        map.put(2, "B"); 
        map.put(3, "C"); 
        map.put(4, "D"); 
        map.put(5, "E"); 
        int size=map.size();
        System.out.println("Count the number of key-value "+size);
    }
}
