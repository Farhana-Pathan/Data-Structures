package Arrays;
import java.util.Scanner;

public class Basic {
    
    public static void main(String[] args) {

        //Creating an Array
        int marks[] = new int[50];//size is 50

        // int numbers[] = {1, 2, 3};//size is 3
        // int moreNumbers[] = {4, 5, 6};//size is 3
        // String fruits[] = {"Apple", "Banana", "Cherry"}; //size is 3

        //Giving or Tanking Input to an Array
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();//Maths
        marks[1] = sc.nextInt();//Physics
        marks[2] = sc.nextInt();//Chemistry

        System.out.println("Marks in Maths: " + marks[0]);
        System.out.println("Marks in Physics: " + marks[1]);
        System.out.println("Marks in Chemistry: " + marks[2]);

        sc.close();

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage: " + percentage + "%");

        //update
        marks[2] = 95 ;//Chemistry marks updated to 97
        System.out.println("Updated Marks in Chemistry: " + marks[2]);

        marks[0] = marks[0] + 10;//Maths marks updated to 85 
        System.out.println("Updated Marks in Maths: " + marks[0]);
    }


}