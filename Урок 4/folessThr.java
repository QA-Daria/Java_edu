import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class folessThr {

    public static void main(String[] args) {
        Integer[] oldEl = new Integer[]{1, 3, 5, 2};
        List<Integer> newEl = Arrays.asList(oldEl);
        sortirovkasl(newEl);
        System.out.println(newEl);
    }

    public static void sortirovkasl(List<Integer> a) {
        Collections.shuffle(a);

    }
}
