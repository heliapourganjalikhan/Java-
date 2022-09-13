public class Test{
    public static void main(String[] args){
        int[] array = new int[10];
        for(int i=0; i<10; i++){
             array[i] = i;
        }
        int key = 20;

        System.out.println("Does " + key + " exist?");
        System.out.println(isIt(array, key));

    
    }

    public static boolean isIt(int[] arr, int key){
        for(int i=0; i<9; i++){
            for(int j=i+1; j<10; j++){
                if(arr[i] +arr[j] == key){
 return true;
                }
                   
                   

            }


        }
            return false;
    }
}
