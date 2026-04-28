package Arrays;


public class BinarySearch {
 
    public static int binarySearch(int arr[], int target){
        int low = 0;
        int high = arr.length - 1;

        for(int i = low; i<= high; i++){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                return mid;
            } else if(arr[mid] < target){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int num[] = {10, 20, 30, 40, 5, 75, 80, 90};
        int target = 75;
        int index = binarySearch(num, target);
        System.out.println("Index of " + target + " is: " + index);
    }
}
