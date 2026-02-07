package conteudos.statics;
import conteudos.statics.entities.Dollar;

public class DollarApp {
    public static void main(String[] args) {
        
        double dollarPrice = 5.2;
        double quantity = 100;

        System.out.println("The amount of reais to be paid: R$"+Dollar.amountReais(dollarPrice, quantity));
    }
}
