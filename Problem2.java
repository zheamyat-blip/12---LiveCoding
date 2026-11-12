/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem.pkg2;

import java.util.Scanner;

public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Allow comma-separated 
        input.useDelimiter("[,\\s]+");
        
        int a = input.nextInt();

        int b = input.nextInt();

        // Validate negative inputs
        if (a < 0 || b < 0) {
            System.out.println("Invalid input.");
        } // GCD of two zeros is undefined
        else if (a == 0 && b == 0) {
            System.out.println("Undefined");
        } else {
            int result = gcd(a, b);
            System.out.println(result);
        }
    }
    // Recursive method to calculate the GCD

    public static int gcd(int a, int b) {

        // Base case: when b becomes 0, return a
        if (b == 0) {
            return a;
        }

        // Recursive case: call gcd using b and the remainder
        return gcd(b, a % b);
    }

}
