public class CompleteNumber {
    public static void main(String[] args){
        isCompelete();

    }

    static void isCompelete(){
        for(int i = 1; i < 10000; i++){
            int sum = 0;        //sum of divisors
            for(int j = 1; j < i; j++)
                if(i%j == 0)
                    sum += j;
            if(sum == i)
                System.out.println(i);

        }     
    }
}
