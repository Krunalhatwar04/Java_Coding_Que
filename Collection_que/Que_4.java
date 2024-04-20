package Collection_que;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Que_4 {
    public static void main(String[] args) {
        ArrayList<String> color=new ArrayList<>();
        color.add("White");
        color.add("Red");
        color.add("Green");
        color.add("Yellow");
        color.add("Orange");
        System.out.println("ArrayList before sorting: " + color);
        Collections.sort(color);
         System.out.println("ArrayList after sorting: " + color);
    
        
    }
}
