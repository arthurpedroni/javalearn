package mainProject;
import mainProject.entities.*;;

public class AccountApp {
    public static void main(String[] args) {

        Account a;

        String name = "Alex Green";
        int number = 8532;
        char option = 'y';

        if(option == 'y') {
            double value = 500;
            a = new Account(number, name,value);
        }
        else {
            a = new Account(number, name);  
        }
    
        System.out.println(a);

        a.deposit(200);
        System.out.println(a);

        a.setName("Jonas Pires");
        a.withdraw(300);
        System.out.println(a);
    }
}
