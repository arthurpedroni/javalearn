import entities.Rectangle;

public class ex1 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.width = 16.0;
        r.height = 12.0;

        System.out.println("AREA: "+r.area());
        System.out.println("Perimeter: "+r.perimeter());
        System.out.println("Diagonal: "+r.diagonal());
    }
    
}
