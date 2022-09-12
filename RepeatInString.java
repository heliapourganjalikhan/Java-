import java.util.Scanner;

public class RepeatInString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please inter a string:");
        String one = scanner.next();
        System.out.println("Please inter a substring:"); 
        String two = scanner.next();

        int count = 0;
        int index = 0;

        System.out.println(StringInString(one, two, count, index) + " time " + two + " is repeated in " + one);

    }

	public static int StringInString(String one, String two, int count, int index) {
		if (one.indexOf(two ,index) == -1) 
            return count;
		else{
            count++;    
            index += two.length();
             return StringInString(one, two, count, index);
        }
	}
}