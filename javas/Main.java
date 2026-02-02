public class Main {
      public static int max(int x,int y,int z){
        int greater;
        if(x > y && x > z){
            greater = x;
        }
        else if(y > z){
            greater = y;
        }
        else{
            greater = z;
        }
        return greater;
      }
    public static void main(String[] args) { 
        int x = 378;
        int y = 11960;
        int t = 522;
        int greater = max(x,y,t);
        System.out.println("O maior é: "+greater);
    }
}
