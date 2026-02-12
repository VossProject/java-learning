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
        // score var
        int score = 90;

        // print grade
        if (score >= 90) {
            System.out.println("A");
        }
        else if (score >= 80) {
            System.out.println("B");
        }
        else if (score >= 70) {
            System.out.println("C");
        }
        else if (score >= 60) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }

        // dayNumber var
        int dayNumber = 1;

        switch(dayNumber) {
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
    }

}
