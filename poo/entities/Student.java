package entities;

public class Student {

    public double grade1;
    public double grade2;
    public double grade3;

    public String toString(){
        
        if((grade1 + grade2 + grade3) >= 60.0) {
            return "FINAL GRADE: "+ (grade1 + grade2 + grade3)
            +"\nPASS";
        }
        else{
            return "FINAL GRADE: "+ (grade1 + grade2 + grade3)
            +"\nFAILED\nMISSING "+ (60.0 - (grade1 + grade2 + grade3))
            +" POINTS";
        }
    }
}
