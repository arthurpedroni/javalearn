package entities;

public class Student {

    public double grade1;
    public double grade2;
    public double grade3;

    public String toString(){
        
        double sum = grade1 + grade2 + grade3;
        if(sum >= 60.0) {
            return "FINAL GRADE: "+ sum
            +"\nPASS";
        }
        else{
            return "FINAL GRADE: "+ sum
            +"\nFAILED\nMISSING "+ (60.0 - sum)
            +" POINTS";
        }
    }
}
