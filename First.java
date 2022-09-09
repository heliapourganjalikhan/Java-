//Fibonacci sequence

public class First{
    public static void main (String[] args){
        int f1 = 0;
        int f2 = 1;
        int f3 = 0;
        while(f3<100){
            f3 = f1 +f2;
          if (f3<100){
            System.out.println(f3);
            f1 = f2;
            f2 = f3;
          }
        }
        
    }
}