package conteudos.statics;
import conteudos.statics.entities.*;

public class CircleApp {
    public static void main(String[] args) {
        double r = 3.0;

        System.out.printf("Circumference: %.2f", Circle.circumference(r));
        System.out.printf("\nVolume: %.2f",Circle.volume(r));
    }
}
