package Collection_que;

import java.util.ArrayList;

public class Que_3 {
    public static void main(String[] args) {
        ArrayList<String> color=new ArrayList<>();
        color.add("White");
        color.add("Red");
        color.add("Green");
        color.add("Yellow");
        
        int index=2;
        System.out.println("specified index  "+color.get(index));
        for(String x:color){
            System.out.println(x);
        }

    }
}
