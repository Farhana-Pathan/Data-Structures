package Arrays;

public class ReversedArrayOptimal {
    
    public static int[] reverseArray(int arr[]){
        int first = 0;
        int last = arr.length - 1;

        for(int i = first; i<= last/2; i++){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        return arr;
    }

public static void main(String[] args) {
    
    int numbers[] = {10, 20, 30, 40, 50};
    int reversed[] = reverseArray(numbers);
    for(int num : reversed){
        System.out.print(num + " ");
    }

}
}