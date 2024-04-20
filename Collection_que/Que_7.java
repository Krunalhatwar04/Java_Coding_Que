package Collection_que;

import java.util.ArrayList;

public class Que_7 {
    public static void main(String[] args) {
    
    
    ArrayList<String> fruits = new ArrayList<>();
    fruits.add("Banana");
    fruits.add("Orange");
    fruits.add("Mango");
    fruits.add("Apple");
    fruits.add("Pine-apple");

    for(int i=0;i<fruits.size();i++){
        System.out.println("Element at position " +(i+1)+" = "+fruits.get(i));
    }

}
}