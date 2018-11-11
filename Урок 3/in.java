import java.util.Scanner;

public class in {



    public static void main(String[] args) {
        System.out.print("Введи имя: ");
        String e = "exit";
        String q = "quit";
        String c = "close";

        while (true) {
            String newName = name();
            if(newName.equals(e)) {
                return;
            }
            if (newName.equals(q)){
                return;
            }
            if (newName.equals(c)){
                return;
            }
        }
    }

    public static String name () {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }
}

