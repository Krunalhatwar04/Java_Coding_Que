package Collection_que;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Que6 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Pine-apple");
        System.out.println("ArrayList before swapping: " + fruits);

        Collections.swap(fruits, 1, 2);
        System.out.println("ArrayList after swapping: " + fruits);

    }
}
