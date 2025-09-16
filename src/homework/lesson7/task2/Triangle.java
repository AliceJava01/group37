package homework.lesson7.task2;

public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double getArea() {
        double p = getPerimetr() / 2;
        return Math.sqrt(p * (p - a) * (p -b) * (p - c));

    }
    @Override
    public double getPerimetr() {
        return a + b + c;
    }
}
