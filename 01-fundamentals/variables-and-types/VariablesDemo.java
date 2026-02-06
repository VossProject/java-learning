/**
 * Variables and Data Types in Java
 *
 * Topics covered:
 * - Primitive types (int, double, boolean, char, etc.)
 * - String basics
 * - Variable declaration and initialization
 * - Type casting
 */
public class VariablesDemo {
    public static void main(String[] args) {
        // --- Integer types ---
        int age = 25;
        long worldPopulation = 8_000_000_000L;

        System.out.println("Age: " + age);
        System.out.println("World population: " + worldPopulation);

        // --- Floating point ---
        double pi = 3.14159;
        System.out.println("Pi: " + pi);

        // --- Boolean ---
        boolean isLearning = true;
        System.out.println("Currently learning Java: " + isLearning);

        // --- Char and String ---
        char grade = 'A';
        String name = "Mikey";
        System.out.println(name + " got a grade of " + grade);
    }
}
