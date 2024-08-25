package Collection;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> m = new HashMap<>();
        m.put(1,"asd");
        m.put(2,"zxc");
        m.replace(2,"qwe");
        System.out.println(m);
    }
}
