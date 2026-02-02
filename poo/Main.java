import entities.*;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        p.name = "Dipirona";
        p.price = 60.0;
        p.quantity = 120;
        int add = 34;
        int remove = 74;

        System.out.printf("Product data:\nName: %s, R$%.2f, %d units, total: R$%.2f\n",p.name,p.price,p.quantity,p.totalValueInStock());

        p.addProducts(add);
    
        System.out.printf("Product data:\nName: %s, R$%.2f, %d units, total: R$%.2f\n",p.name,p.price,p.quantity,p.totalValueInStock());
        
        p.removeProducts(remove);

        System.out.printf("Product data:\nName: %s, R$%.2f, %d units, total: R$%.2f\n",p.name,p.price,p.quantity,p.totalValueInStock());


    }
}
