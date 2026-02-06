/**
 * Operators and Expressions in Java
 *
 * Topics covered:
 * - Arithmetic operators (+, -, *, /, %)
 * - Comparison operators (==, !=, <, >, <=, >=)
 * - Logical operators (&&, ||, !)
 * - Assignment operators (+=, -=, etc.)
 */
public class OperatorsDemo {
    public static void main(String[] args) {
        // --- Arithmetic operators ---
        int a = 10;
        int b = 3;
        System.out.println("a + b = " + (a + b));    // 13
        System.out.println("a - b = " + (a - b));    // 7
        System.out.println("a * b = " + (a * b));    // 30
        System.out.println("a / b = " + (a / b));    // 3 (integer division!)
        System.out.println("a % b = " + (a % b));    // 1 (remainder)

        // --- Comparison operators ---
        System.out.println("a == b: " + (a == b));   // false
        System.out.println("a != b: " + (a != b));   // true
        System.out.println("a > b: " + (a > b));     // true

        // --- Logical operators ---
        boolean isJavaFun = true;
        boolean isLearning = true;
        System.out.println("Both true: " + (isJavaFun && isLearning));  // AND
        System.out.println("Either true: " + (isJavaFun || !isLearning)); // OR
        System.out.println("Not fun: " + (!isJavaFun));                   // NOT

        // --- Assignment operators (shortcuts) ---
        int count = 10;
        count += 5;   // same as: count = count + 5
        System.out.println("After += 5: " + count);   // 15
        count -= 3;   // same as: count = count - 3
        System.out.println("After -= 3: " + count);   // 12
        count *= 2;   // same as: count = count * 2
        System.out.println("After *= 2: " + count);   // 24
    }
}
