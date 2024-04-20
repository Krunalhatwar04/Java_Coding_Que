package Collection_que;

import java.util.ArrayList;

public class Que_2 {
    public static void main(String[] args) {
        ArrayList<String> color=new ArrayList<>();
        color.add("White");
        color.add("Red");
        color.add("Green");
        color.add("Yellow");
        
        color.add(0,"Grey");

        for(String x:color){
            System.out.println(x);
        }
    }
}
