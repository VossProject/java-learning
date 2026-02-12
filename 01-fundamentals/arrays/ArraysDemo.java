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

        // Array Stats
        // Create array of double called temperatures - 7 values
        double[] temperatures = {4, 16, 98, 4, 26, 98};
        // For each loop to sum all temps
        double sum = 0;
        for (double value : temperatures) {
            sum = sum + value;
        }
        // For loop to find highest and lowest temps
        double highest = temperatures[0];
        double lowest = temperatures[0];
        for (int i = 0; i < temperatures.length; i++) {
            // check if value is larger than highest, then assign value to highest var
            if (temperatures[i] > highest) {
                highest = temperatures[i];
            }
            // check if value is larger than highest, then assign value to highest var
            if (temperatures[i] < lowest) {
                lowest = temperatures[i];
            }
        }
        // Print average, highest, lowest
        double avg = sum / temperatures.length;
        System.out.println("Average Temperature: " + avg);
        System.out.println("Highest Temperature: " + highest);
        System.out.println("Lowest Temperature: " + lowest);
    }
}
