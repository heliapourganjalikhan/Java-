public class Two{
    public static void main(String[] args) {
        int f1 = 0;
        int f2 = 1;
        fibonacci(f1 ,f2);

}
    static void fibonacci(int f1, int f2) {
        int f3 = f1 + f2;
        if(f3 < 1000){
            f1 = f2;
            f2 = f3;
            System.out.println(f3);
            fibonacci(f1 ,f2); 
        }


    }
}    