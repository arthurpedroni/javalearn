import entities.*;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Product p = new Product();
            p.name = "Dipirona";
            p.price = 100.0;
            p.quantity = 120;

            System.out.println(p);
            
            System.out.print("\nEnter the quantity to be added: ");
            int add = sc.nextInt();
            p.addProducts(add);
        
            System.out.println("\n"+p);
            
            System.out.print("\nEnter the quantity to be removed: ");
            int remove = sc.nextInt();
            p.removeProducts(remove);

            System.out.println("\n"+p);
            sc.close();

    }
}
