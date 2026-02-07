package conteudos.introdutorio.entities;

public class Employee {
    
    public String name;
    public double salary;
    public double tax;

    public double netSalary() {
        return salary - tax;
    }

    public double increaseSalary(double per) {
        return salary * (1 + per/100.0) - tax;
    }

}
