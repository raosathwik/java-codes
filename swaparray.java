import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class swaparray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Elements before swapping="+list);
        Collections.swap(list,1,2);
         System.out.println("after swapping="+list);
        }
}
