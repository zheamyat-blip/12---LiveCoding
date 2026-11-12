/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adolfo_problem3;
import java.util.Scanner;
/**
 *
 * @author ADOLFO_CPE113
 */
public class Adolfo_Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String line = input.nextLine();

        // Remove the braces and unnecessary spaces from the input
        line = line.replace("{", "").replace("}", "").replace(" ", "");

        // Divide the input values based on the commas
        String[] numbers = line.split(",");

        // Create an integer array to hold the converted values
        int[] values = new int[numbers.length];

        // Convert every input number from String to integer
        for (int i = 0; i < numbers.length; i++) {
            values[i] = Integer.parseInt(numbers[i]);
        }

        // Print the calculated results on the screen
        System.out.println();
        System.out.println(arraySum(values, 0) + ", "
                + findMaximum(values, 0) + ", "
                + countEven(values, 0));

        input.close();
    }

    // Computes the total of all elements in the array
    public static int arraySum(int[] values, int index) {

        // End the recursive process once every element is covered
        if (index == values.length) {
            return 0;
        }

        // Add the current value to the sum of the next elements
        return values[index] + arraySum(values, index + 1);
    }

    // Determines the highest number stored in the array
    public static int findMaximum(int[] values, int index) {

        // Return the final element when it is the only one left
        if (index == values.length - 1) {
            return values[index];
        }

        // Get the greatest value from the remaining elements
        int maximum = findMaximum(values, index + 1);

        // Identify which is greater between the current and maximum values
        if (values[index] > maximum) {
            return values[index];
        } else {
            return maximum;
        }
    }

    // Calculates how many even numbers are present in the array
    public static int countEven(int[] values, int index) {

        // Finish the process after reaching the end of the array
        if (index == values.length) {
            return 0;
        }

        // Determine whether the current number is divisible by two
        if (values[index] % 2 == 0) {
            return 1 + countEven(values, index + 1);
        } else {
            // Move to the next element without adding to the count
            return countEven(values, index + 1);
        }
    }
}
