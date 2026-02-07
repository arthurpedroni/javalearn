package conteudos.introdutorio;
import conteudos.introdutorio.entities.Rectangle;

public class RectangleApp {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.width = 16.0;
        r.height = 12.0;

        System.out.println("AREA: "+r.area());
        System.out.println("Perimeter: "+r.perimeter());
        System.out.println("Diagonal: "+r.diagonal());
    }
    
}
