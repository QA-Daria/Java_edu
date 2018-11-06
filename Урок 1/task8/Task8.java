public class Task8 {

    public static void main (String[]args){
        System.out.println(Task8(0));
    }

    public static int Task8(int n) {
        int factorial = 1;

    if (n>0) {

            for (int i = 2; i <= n; i++) {factorial *= i;}

            return factorial;}

      if (n<0) {
          return 0;
        }
        if (n==0)
          for (int i = 2; i <= n; i++) {factorial *= i;}

        return 0;

        }






}



/**
 * Напишите метод который бы принимал аргумент типа int и возвращал его факториал.
 * Пример:
 * 	factorial(3); //вернёт 6
 * 	factorial(-3); //вернёт 0
 * 	factorial(0); //вернёт 0
 *
 *
 */
