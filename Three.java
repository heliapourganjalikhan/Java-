// Sorting an array with for loops
import java.util.Scanner;

public class Three{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10]; // creating an array by using "new" operator   
        for(int i = 0; i <10; i++)
            array[i] = scanner.nextInt();
          
        arrange(array);
        

    }

   static void arrange(int[] array){
      int t = 0;  
    // loop through the array by "for " loop
        for(int i = 0; i < 9; i++){
           for(int j = i+1; j < 10; j++){
                
                if (array[i] > array[j]){
                    t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
           }

        }

    // loop through the array by "for-each" loop 
            for (int s : array){
            System.out.println(s);
        }
    
   } 
}