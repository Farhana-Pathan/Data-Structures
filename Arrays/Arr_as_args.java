package Arrays;

public class Arr_as_args {
    
    public static void updateMarks(int marks[]) {
        
        for(int i = 0; i< marks.length; i++){
            marks[i] = marks[i] + 5;
        }
    }

    public static void main(String[] args) {
        int marks[] = {85, 90, 95};
        updateMarks(marks);
        
        for(int i = 0; i< marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}

//Note Arrays are passed by reference in Java, which means that when we pass an array to a method, we are passing a reference to the original array. Therefore, any changes made to the array within the method will affect the original array outside the method. In this example, when we call updateMarks(marks), we are passing a reference to the marks array. The updateMarks method modifies the elements of the marks array by adding 5 to each element. As a result, when we print the marks array in the main method after calling updateMarks, we see that all the marks have been updated with an additional 5.
