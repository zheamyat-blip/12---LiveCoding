/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int result = sumOfDigits(number);
        // Validate the input   
        if (number < 0) {
            System.out.println("Invalid input.");
        } else {
            System.out.println(result);
        }
    }

    // Recursive method to calculate the sum of digits 
    public static int sumOfDigits(int number) {

        // Base case: if number is 0, return 0
        if (number == 0) {
            return 0;
        }

        // Recursive case:
        // Get the last digit and add the remaining digits  
        return (number % 10) + sumOfDigits(number / 10);
    }
}
