public class Author {

    //выделяю приватные переменные;
    private String name;
    private String email;
    private  char gender;

    // Конструктор для инициализация по перед значениям
    public Author(char g, String n, String e){
        this.gender = g;
        this.name = n;
        this.email = e;

    }

    //toString


    //создаю геттеры и сеттеры
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "класс Автор состоит из имени Автора = "+ name + ",Почты автора =  " + email + ",Пол Автора = " + gender + "]";
    }


}

/**
 * -- задание на композицию --
 * Класс Author, предназначен для моделирования автора книги.
 *  Этот класс должен содержать:
 *      - Три приватных переменных: name(String), email(String) и gender(char ('m' или 'f'));
 *          и соответвтсвущие для них геттеры/сеттеры. +
 *      - Один конструктор для инициализации name, email и gender переданными значениями.+-
 *      - Метод toString() который возвращает краткую инфомацию об экземпляре класса, к примеру:
 *          Author[name=Mayakovskiy,email=mayakovskiy@mail.ru,gender=m]+
 * Напишите этот класс а также напишите второй класс который бы выводил значения всех публичных методов у класса Author.
 */