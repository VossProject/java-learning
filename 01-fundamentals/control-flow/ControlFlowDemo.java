/**
 * Control Flow in Java
 *
 * Topics covered:
 * - if / else if / else
 * - switch statements
 * - for loops
 * - while and do-while loops
 * - break and continue
 */
public class ControlFlowDemo {
    public static void main(String[] args) {

        // Grade calculator
        // score var
        int score = 90;

        // print grade
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        // Day of the week switch
        // dayNumber var
        int dayNumber = 1;

        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

        // Multiplication table
        // number var
        int number = 9;

        //print multiplication table 1-10
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }

        // Countdown
        int counter = 10;
        while (counter != 0) {
            System.out.println(counter);
            counter--;
        }

        System.out.println("Liftoff!");

        /*FizzBuzz
        for loop 1-20
        print "FizzBuzz" if number divisible by 3 and 5
        Prints "Fizz" if divisible by 3 only
        Prints "Buzz" if divisible by 5 only
        Prints the number otherwise*/

        int num = 20;
        for (int i = 1; i <= num; i++) {
            // If i = 13, skip iteration
            if (i == 13) {
                continue;
            }
            // print "FizzBuzz" if number divisible by 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // Prints "Fizz" if divisible by 3 only
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // Prints "Buzz" if divisible by 5 only
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // Prints the number otherwise*
            else {
                System.out.println(i);
            }
        }
    }
}
