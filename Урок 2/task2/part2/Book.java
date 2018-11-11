public class Book {
    private String name;
    private double price;
    private Author avtor;

    // Конструктор для инициализация по перед значениям


    public Book(String name, double price, Author avtor) {
        this.name = name;
        this.price = price;
        this.avtor = avtor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author getAvtor() {
        return avtor;
    }

    public void setAvtor(Author avtor) {
        this.avtor = avtor;
    }



    public String toString() {
        return "класс  Book состоит из Названия = "+ name + ", Цена =  " + price+ "Автор = " + toString();
    }

    public String getAuthorName() {
        return Author.getName();
    }

    public String getAuthorEmail() {
        return Author.getEmail();
    }

    public char getAuthorGender() {
        return Author.getGender();
    }
}

/**
 * -- задание на композицию --
 * Напишите класс Book(который использует класс Author написанный в part1):
 *      - Объявить 3 привытных переменных: name(String), author(Author предполагаются, что в книге только 1 автор),
 *          price(double) а также геттер/сеттеры для них. +
 *      - Один публичный конструктор: (String name, Author author, double price).+
 *      - Написать метод toString() который вернёт краткую информацию о книге. +
 *          Вы должно повторно использовать toString() у экземпляра класса Author.
 *          К примеру вывод будет такой:
 *              Book[name=Полный порядок,Author[name=Эмили Граветт,email=em.gmail.com,gender=f],price=690]+
 *
 *      Попытайтесь:
 *          1.) Создать экземпляр класса Book и вывести в консоль name и email автора книги.
 *          2.) Написать новые методы для класса Book называемые getAuthorName() и getAuthorEmail() и getAuthorGender()
 *              чтобы вернуть name,email и gender автора.
 *          3.) Изменить Book класс для поддержки одного или нескольких авторов.
 *
 */