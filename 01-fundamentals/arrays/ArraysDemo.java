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

        // Multi-dimensional arrays
        // create multi-dimensional array of int called grades (3 students - 4 test scores ea)
        int[][] grades = {
                {85, 90, 78, 92},
                {70, 65, 88, 72},
                {95, 100, 92, 98}
        };
        // nested loops to print table of scores for each student
        for (int row = 0; row < grades.length; row++) {
            System.out.print("Student " + (row + 1) + ": ");
            for (int col = 0; col < grades[row].length; col++) {
                System.out.print( grades[row][col]+ " ");
            }
            System.out.println();
        }
        // calculate average for each student and print
        for (int row = 0; row < grades.length; row++) {
            System.out.print("Student " + (row + 1) + " Average: ");
            double scoreAverage = 0;
            for (int col = 0; col < grades[row].length; col++) {
                scoreAverage = scoreAverage + grades[row][col];
            }
            scoreAverage = scoreAverage / grades[row].length;
            System.out.print(scoreAverage);
            System.out.println();
        }
    }
}
