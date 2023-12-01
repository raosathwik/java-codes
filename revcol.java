import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class revcol{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Before reversing"+ list);
        Collections.reverse(list);
        System.out.println("After reversing"+list);
    }   
    
}