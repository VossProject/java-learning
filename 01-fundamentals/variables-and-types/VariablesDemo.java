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

        // --- Type casting ---
        // Widening (safe): smaller type -> larger type, no data loss
        int score = 95;
        double scoreAsDouble = score;
        System.out.println("Int to double: " + score + " -> " + scoreAsDouble);

        // Narrowing (risky): larger type -> smaller type, may lose data
        double price = 9.99;
        int priceAsInt = (int) price;
        System.out.println("Double to int: " + price + " -> " + priceAsInt);
    }
}
