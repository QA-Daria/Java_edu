public class MainAuthor {

    public static void main(String[] args) {

        //Инициализация переменных
        //Создаю экземляр класса Автор

        Author a1 = new Author('f', "Ахматова", "ahmatova@yandex.ru" );



        Book bo1 = new Book("a znaesh", 30, );



        a1.setName("Ахматова");
        a1.setEmail("ahmatova@yandex.ru");
        a1.setGender('f');

        Author a2 = new Author('m', "Маяковский", "mayakovskiy_mur@yandex.ru" );

        a2.setName("Mаяковский");
        a2.setEmail("mayakovskiy_mur@yandex.ru");
        a2.setGender('m');

        //Результаты конструктора
        System.out.println("Результы конструктора а1 = " + a1);
        System.out.println("Результаты конструктора а2 = " + a2);

        Book book = new Book("Стихи", Author, 600);
        System.out.println(book.toString());




    }

}
