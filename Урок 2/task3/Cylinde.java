public class Cylinde extends Circle {

    private double height;

    public Cylinde() {
        super();
        height = 1.0;
    }

    public Cylinde(double height) {
        this.height = height;
    }

    public Cylinde(double r, double height) {
        super(r);
        this.height = height;
    }

    public Cylinde(double r, String color, double height) {
        super(r, color);
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
