package conteudos.statics.entities;

public class Circle {

    public static final double PI = 3.14159;
    public double radius;

    public static double circumference(double r) {
        return 2 * PI * r;
    }

    public static double volume(double r) {
        return 4.0 * PI * r * r / 3.0;
    }
    
}
