package Sreda1;

public class Square extends Shape {
    private double a;

    /*Constructor*/
    public Square(String name, double a) {
        super(name);
        this.a = a;
    }
    /*Methods*/
    //TODO

    @Override
    public double circumference() {
        return 4 * a;
    }

    @Override
    public double area() {
        return a * a;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
