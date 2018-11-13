public class Main {

    public static void main (String[] args) {

        System.out.println(reverseWord("переверни строку"));

    }

    public static StringBuffer reverseWord(String a){
        StringBuffer slovo = new StringBuffer(a);
        slovo.reverse();

        return slovo;
    }


}

/**
 * Напишите метод который принимает String и возвращает данную строку в обратном порядке символов.
 * Пример:
 * 	reverseWord("переверни строку"); //вернёт "укотрс инревереп"
 */
