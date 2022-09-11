import java.util.Scanner;

public class Six {
    public static void main(String[] args){
        System.out.println("Please enter a word:");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.println("Is it palindrome?");
        System.out.println(isPalindrome(word));

        
    }

    static boolean isPalindrome(String w ){
        int k = (w.length()-1);
        for(int i=0; i<(k/2); i++){
            if(w.charAt(i) != w.charAt(k-i))
                return false;
            /* System.out.println(w.charAt(i));
             System.out.println(w.charAt(k-i));*/
           
        }
        return true;
    }
}    