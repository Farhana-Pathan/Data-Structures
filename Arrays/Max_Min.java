package Arrays;

public class Max_Min {
    
    public static void main(String[] args) {
        int[] values = {5, 1, 2};
        int smallest = values[0];
        int largest  = values[0];
        for (int n = 1; n < values.length; ++n) {
            int value = values[n];
            if (value < smallest) {
                smallest = value;
                
            } else if (value > largest) {
                largest = value;
                
            }
        }
        System.out.println("Final Smallest: " + smallest);
        System.out.println("Final Largest: " + largest);
    }
}
