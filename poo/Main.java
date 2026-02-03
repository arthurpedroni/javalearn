import entities.*;

public class Main {
        public static void main(String[] args) {
        Product p = new Product();
        p.name = "Dipirona";
        p.price = 60.0;
        p.quantity = 120;
        int add = 34;
        int remove = 74;

        System.out.println(p);

        p.addProducts(add);
    
        System.out.println(p);
        
        p.removeProducts(remove);

        System.out.println(p);


    }
}
