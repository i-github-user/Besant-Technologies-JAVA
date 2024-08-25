package Collection;

import java.util.LinkedList; // inbuilt class in java

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> lk=new LinkedList<>();
        lk.add(3);lk.add(3);lk.add(30);lk.add(3);
        System.out.println(lk.get(2));
    }
}
