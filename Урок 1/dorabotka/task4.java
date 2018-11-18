import java.util.Arrays;

public class task4 {

    public static void main(String[] args) {
        int[] massive = {1, 2, 3, 3, 4, 4, 5, 1, 2};
        int[] sorted_massive;

        System.out.print("First  mass = ");
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + " ");
        }
        System.out.println();
        Arrays.sort(massive);
        sorted_massive = delDuplicates(massive);

        System.out.print("Sorted mass = ");
        for (int i = 0; i < sorted_massive.length; i++) {
            System.out.print(sorted_massive[i] + " ");
        }

    }

    public static int[] delDuplicates(int[] mas) {
        if (mas.length == 0) {
            return new int[0];
        }
        else if (mas.length == 1) {
            return mas;
        } else {

            int num_of_unique = 1;
            
            for (int i = 1; i < mas.length; i++) {
                if (mas[i] != mas[i - 1]) {
                    num_of_unique++;
                }
            }

            int[] sorted_mass = new int[num_of_unique];
            sorted_mass[0] = mas[0];
            int n = 1;

            for (int i = 1; i < mas.length; i++) {
                if(mas[i] != mas[i-1]) {
                    sorted_mass[n] = mas[i];
                    n++;
                }
            }

            return sorted_mass;
        }

    }
}
