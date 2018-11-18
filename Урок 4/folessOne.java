import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class folessOne {

    public static void main(String[] args) {
        Integer[] oldEl = new Integer[]{1, 2, 3, 4, 5};
        List<Integer> newEl = Arrays.asList(oldEl);
        reverse(newEl);
        System.out.println(newEl);
    }

    public static void reverse(List<Integer> a) {
        Collections.reverse(a);
    }
}
