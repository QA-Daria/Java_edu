public class Main {
    public static void main (String[] args) {
    sayHello("");
    sayHello("Олег");
    sayHello("Денис");
    }
    public static String sayHello(String a){
        System.out.println("Привет " + a +"!");
        return a;
    }
}

/**
 * Напишите метод который бы приветствовал человека по его имени, метод должен принимать один аргутмент String
 * и выводить на консоль приветствие.
 * Пример:
 * 	sayHello("олег"); //вернёт "Привет Олег!"
 * 	sayHello("ДЕНИС"); //вернёт "Привет Денис!"
 * 	sayHello(""); //вернёт "Привет !"
 */
