package Arrays;

public class ReversedArray{

    public static int[] reverseArray(int arr[]){

        int Reversed[] = new int[arr.length];

        for(int i = arr.length -1; i >=0; i--){
            Reversed[arr.length-1-i] = arr[i];
            
        }
        return Reversed;
    } 
    
    public static void main(String[] args) {
        
        int numbers[] = {10, 20, 30, 40, 50};
        int reversed[] = reverseArray(numbers);
        for(int num : reversed){
            System.out.print(num + " ");
        }

    }
}