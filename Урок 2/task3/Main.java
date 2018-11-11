public class Main {
    public static void main(String[] args) {

    //Объявляю

        String colorCircle;
        double radiusCircle;
        double areaCircle;
       double areaCircleTwo;
       double volCylindr;

     //Инициализация переменных
     //Создать экземпляр класса Circle c1 .
        Circle c1  = new Circle();
        Circle c2 = new Circle(1.30);
        Cylinde vol = new Cylinde();

        radiusCircle = c1.getRadius();
        colorCircle = c1.getColor();
        areaCircle = c1.getArea();
        areaCircleTwo = c2.getArea();
        volCylindr = vol.getVolume();



        //Результаты Первый конструктор

        System.out.println("Экзамеляр класса Circle с именем c1 и радиусом= " + radiusCircle);
        System.out.println("Экзамеляр класса Circle с именем c1 и цветом= " + colorCircle);
        System.out.println("Экзамеляр класса Circle с именем c1 и площадью= " + areaCircle);

        //Результаты Второй конструктор с заданным радиусом, но цвет по умолчанию

        System.out.println("Экзамеляр класса Circle с именем c2 и цветом= " + colorCircle );
        System.out.println("Экзамеляр класса Circle с именем c2 и площадью= " +areaCircleTwo );


        //Нахождение цилиндра
        System.out.println("Экзамеляр класса Cylinde с именем vol и объём цилиндра= " +volCylindr );

        //Попробуйте вызвать метод toString()


        System.out.println(c1.toString());
        System.out.println(c1);


/**
 * Почему работают оба? System.out.println(obj) выведет возвращаемую строку из obj.toString(),
 * если вы не переопределите ее, она вызовет метод base.toString(),
 * который по умолчанию метод toString для класса Object возвращает строку состоящий из имени класса,
 * объектом которого является экземпляр, символа at-sign `@'и шестизначного
 * шестнадцатеричного представления хеш-кода объекта.
 */


    }
}