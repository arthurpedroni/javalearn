package conteudos.introdutorio;
import conteudos.introdutorio.entities.Student;

public class StudentApp {
    public static void main(String[] args) {
        
        Student s = new Student();
        s.grade1 = 12.0;
        s.grade2 = 24.0;
        s.grade3 = 24.0;
        
        System.out.println(s);
    }
}
