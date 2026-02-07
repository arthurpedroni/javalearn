package conteudos.statics.entities;

public class Dollar {
    
        public static final double IOF = 1.06;

        public static double amountReais(double dollarPrice, double quantity) {
            return dollarPrice * quantity * IOF;

        }
}
