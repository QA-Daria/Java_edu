public class Circle {
    // переменные, недоступные извне этого класса
    private double radius;
    private String color;

    // Конструктор по умолчанию без аргумента.
    // Он устанавливает радиус и цвет в значение по умолчанию.
    public Circle() {
        radius = 1.0D;
        color = "red";
    }

    // Второй конструктор с заданным радиусом, но цвет по умолчанию
    public Circle(double r) {
        radius = r;
        color = "red";
    }

    // Второй конструктор с заданным радиусом, но цвет по умолчанию
    public Circle(double r, String color) {
        radius = r;
        this.color = color;
    }
    // метод для получения радиуса
    public double getRadius() {
        return radius;
    }

    // метод для задания color
    public String setColor() {
        return color;
    }

    // метод для задания radius
    public double setRadius() {
        return radius;
    }

    // метод для получения цвета
    public String  getColor() {
        return color;
    }

    // метод вычисления площади круга
    public double getArea() {
        return radius * radius * Math.PI;
    }


}