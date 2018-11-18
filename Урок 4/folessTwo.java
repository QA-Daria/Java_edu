import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class folessTwo {

    public static void main(String[] args) {
        Integer[] oldEl = new Integer[]{1, 3, 5, 2};
        List<Integer> newEl = Arrays.asList(oldEl);
        sortirovka(newEl);
        System.out.println(newEl);
    }

    public static void sortirovka(List<Integer> a) {
        Collections.sort(a);
        Collections.reverse(a);

    }
}
