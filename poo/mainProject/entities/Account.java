package mainProject.entities;
public class Account {

    private int number;
    private String name;
    private double value;

    public Account(int number, String name, double value) {
        this.number = number;
        this.name = name;
        deposit(value);
    }

    public Account(int number, String name) {
        this.number = number;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public int getNumber() {
        return number;
    }
    
    public void deposit(double value) {
        this.value += value;
    }

    public void withdraw(double value) {
        this.value -= value + 5.0;
    }

    public String toString() {
        return "Account data: \nAccount "+
        number + ", Owner: " + name + ", Balance: $" +
        value + "\n";  
    }

}
