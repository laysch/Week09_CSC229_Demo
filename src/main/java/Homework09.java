/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LailaChoudhry
 */

public class Homework09 {

    public static void main(String[] args){
        // Find the first triangle number with over 100 divisors
        int triangleNumber = findTriangleNumberWithDivisors(100);
        
        // Print the result
        System.out.println("The first triangle number with over 100 divisors is: " + triangleNumber);
    }


    // Method to find the first triangle number with over a specified number of divisors
    public static int findTriangleNumberWithDivisors(int targetDivisors){
        int n = 1; // Initialize counter for natural numbers
        while(true){
            // Calculate the triangle number for the current natural number
            int triangle = n * (n + 1) / 2;
            
            // Check if the number of divisors for the triangle number is greater than the target
            if(countDivisors(triangle) > targetDivisors){
                return triangle; // Return the triangle number
            }
            n++; // Increment the counter to check the next natural number
        }
    }

    // Method to count # of divisors for a given #
    public static int countDivisors(int number) {
        int divisors = 0; // Initialize counter for divisors
        // Loop through potential divisors from 1 to the square root of the number
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                if (number / i == i) {
                    divisors++;
                } else {
                    divisors += 2;
                }
            }
        }
        return divisors; 
    }
}
// The first triangular number with over one hundred divisors is: 73920


    // ToDo 01:  Write an algorithm to solve the following problem
    /*
    The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

Let us list the factors of the first seven triangle numbers:

 1: 1
 3: 1,3
 6: 1,2,3,6
10: 1,2,5,10
15: 1,3,5,15
21: 1,3,7,21
28: 1,2,4,7,14,28
We can see that 28 is the first triangle number to have over five divisors.

What is the value of the first triangle number to have over one hundred divisors? The first triangular number with over one hundred divisors is: 73920
    
    */
    
    
}
