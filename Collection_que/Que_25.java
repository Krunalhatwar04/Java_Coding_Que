package Collection_que;

import java.util.HashMap;
import java.util.Map;

public class Que_25 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();w

        map.put("apple", 10);
        map.put("banana", 20);
        map.put("orange", 30);
        String key="banana";
        if(map.containsKey(key)){
            int value =map.get(key);
            System.out.println("Value of key : "+value);
        }
        else{
            System.out.println("Key '" + key + "' not found in the map.");  
        }

    }
}
