// compare two array
import java .util.Scanner;

public class Four{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        System.out.println("Please enter ten numbers;");
        for (int i = 0; i < 10; i++) {
            arr1[i]= scanner.nextInt();
            System.out.print(" " + arr1[i]);
        }

        System.out.println("Please enter ten numbers;");
        for (int i = 0; i < 10; i++) {
            arr2[i]= scanner.nextInt();
            System.out.print(" " + arr2[i]);;
        }
        /* int[] arr1 = {5,6,7,8};
         int[] arr2 = {5,6,7,8};*/


        System.out.println("Are two arrays equal?");
       /* if (compare(arr1, arr2))
            System.out.println("true");
        else                                                  // we can show the resault in two different main ways.
            System.out.println("false");*/

        System.out.println(compare(arr1, arr2));

    }

      static boolean compare(int[] arr1, int[] arr2) {

       // in case we are not sure about the size of arrays 
       /* if (arr1.length != arr2.length) 
            return false;*/

        for(int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) 
                return false;
        }
        return true;
    }  
}