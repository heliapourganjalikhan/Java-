import java.util.Scanner;

public class Five {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] name = new String[5];

        System.out.println("Please enter five names: ");
        for(int i = 0; i < name.length; i++){
            name[i] = scanner.next();           // the next() method reads the next complete token
            System.out.print( ' ' + name[i]);
            
        }
            System.out.println();
            System.out.println(seyyed(name));
    }

    static int seyyed (String[] n){              
        int num = 0;
        for(int i = 0; i < n.length; i++){
            if(n[i].contains("seyyed"))          //The contains() method checks whether a string contains a sequence of characters. it returns boolean
                num++;
        }
        return num;
    }
    
}