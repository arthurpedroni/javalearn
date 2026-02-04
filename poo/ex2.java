import entities.Employee;
public class ex2 {
    
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Arthur";
        e.salary = 7000.0;
        e.tax = 1000.0; 
        double per = 10.0;
        
        System.out.println("Employee: "+e.name+", $"+String.format("%.2f",e.netSalary()));
        System.out.println("Updated data: "+e.name+", $"+String.format("%.2f",e.increaseSalary(per)));

    }
}
