/**
 * Arrays in Java
 *
 * Topics covered:
 * - Declaring and initializing arrays
 * - Accessing and modifying elements
 * - Iterating with for and for-each loops
 * - Common array operations
 * - Multi-dimensional arrays
 */
public class ArraysDemo {
    public static void main(String[] args) {
        // Array Basics
        // Create array of int called scores: 85, 92, 78, 95, 88
        int[] scores = {85, 92, 78, 95, 88};
        // Print first and last elements
        System.out.println("First element: " + scores[0]);
        System.out.println("Last element: " + scores[scores.length-1]);
        // Change third element to 100
        scores[2] = 100;
        // Use for loop print every element: ie; Score 1: 85
        for (int i = 1; i <= scores.length; i++) {
            System.out.println("Score " + i + ": " + scores[i-1]);
        }
    }
}
