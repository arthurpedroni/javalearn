package entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int add) {
        quantity += add;
    }

    public void removeProducts(int remove) {
        quantity -= remove;
    }

    public String toString(){
        return "Product data:\nName: "
        + name + ", $"
        + price +", "
        + quantity+" units, Total: $"
        + totalValueInStock();
    }

}
