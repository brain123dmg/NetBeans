
import java.util.Scanner; // Import the Scanner class for input handling

/**
 * ConsoleCalculator - A Java program that implements a console-based calculator.
 * This calculator offers options for various mathematical functions, including basic arithmetic,
 * trigonometric functions, and checks for certain properties like Palindrome and Prime numbers.
 */
public class ConsoleCalculator {

    /**
     * Main method - Entry point for the program.
     * Initializes the program, displays a menu, and processes user input for various calculator options.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Initialize scanner for user input
        boolean exit = false; // Flag to control the program's termination

        // Loop to display menu and handle user input until 'exit' is selected
        while (!exit) {
            try {
                // Displaying the menu with available options
                System.out.println("\nChoose an option:");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Power");
                System.out.println("6. Square");
                System.out.println("7. Cube");
                System.out.println("8. Square root");
                System.out.println("9. Round");
                System.out.println("10. Ceiling");
                System.out.println("11. Floor");
                System.out.println("12. Min Value");
                System.out.println("13. Max Value");
                System.out.println("14. sin");
                System.out.println("15. cos");
                System.out.println("16. asin");
                System.out.println("17. acos");
                System.out.println("18. atan");
                System.out.println("19. Exponential");
                System.out.println("20. Palindrome");
                System.out.println("21. Armstrong number");
                System.out.println("22. Prime number");
                System.out.println("23. Average");
                System.out.println("24. GCD");
                System.out.println("25. LCM");
                System.out.println("26. Exit");

                // Prompt user to choose an option from the menu
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                System.out.println("Choice entered: " + choice);  // Display chosen option

                // Switch statement to execute the function based on user choice
                switch (choice) {
                    case 1: // Addition
                        System.out.print("Enter the first number: ");
                        double add1 = scanner.nextDouble();
                        System.out.print("Enter the second number: ");
                        double add2 = scanner.nextDouble();
                        System.out.println("Result: " + (add1 + add2)); // Display result of addition
                        break;
                    case 2: // Subtraction
                        System.out.print("Enter the first number: ");
                        double sub1 = scanner.nextDouble();
                        System.out.print("Enter the second number: ");
                        double sub2 = scanner.nextDouble();
                        System.out.println("Result: " + (sub1 - sub2)); // Display result of subtraction
                        break;
                    case 3: // Multiplication
                        System.out.print("Enter the first number: ");
                        double mul1 = scanner.nextDouble();
                        System.out.print("Enter the second number: ");
                        double mul2 = scanner.nextDouble();
                        System.out.println("Result: " + (mul1 * mul2));
                        break;

                    case 4: // Division
                        System.out.print("Enter the dividend: ");
                        double div1 = scanner.nextDouble();
                        System.out.print("Enter the divisor: ");
                        double div2 = scanner.nextDouble();
                        // Check to avoid division by zero
                        if (div2 != 0) {
                            System.out.println("Result: " + (div1 / div2));
                        } else {
                            System.out.println("Cannot divide by zero!");
                        }
                        break;

                    case 5: // Power
                        System.out.print("Enter base: ");
                        double base = scanner.nextDouble();
                        System.out.print("Enter exponent: ");
                        double exponent = scanner.nextDouble();
                        System.out.println("Result: " + Math.pow(base, exponent));
                        break;

                    case 6: // Square
                        System.out.print("Enter a number: ");
                        double numSquare = scanner.nextDouble();
                        System.out.println("Square: " + (numSquare * numSquare));
                        break;

                    case 7: // Cube
                        System.out.print("Enter a number: ");
                        double numCube = scanner.nextDouble();
                        System.out.println("Cube: " + (numCube * numCube * numCube));
                        break;

                    case 8: // Square root
                        System.out.print("Enter a number: ");
                        double numSqrt = scanner.nextDouble();
                        System.out.println("Square root: " + Math.sqrt(numSqrt));
                        break;

                    case 9: // Round
                        System.out.print("Enter a number: ");
                        double numRound = scanner.nextDouble();
                        System.out.println("Rounded: " + Math.round(numRound));
                        break;

                    case 10: // Ceiling
                        System.out.print("Enter a number: ");
                        double numCeil = scanner.nextDouble();
                        System.out.println("Ceiling: " + Math.ceil(numCeil));
                        break;

                    case 11: // Floor
                        System.out.print("Enter a number: ");
                        double numFloor = scanner.nextDouble();
                        System.out.println("Floor: " + Math.floor(numFloor));
                        break;

                    case 12: // Min Value
                        System.out.print("Enter two numbers: ");
                        double min1 = scanner.nextDouble();
                        double min2 = scanner.nextDouble();
                        System.out.println("Minimum: " + Math.min(min1, min2));
                        break;

                    case 13: // Max Value
                        System.out.print("Enter two numbers: ");
                        double max1 = scanner.nextDouble();
                        double max2 = scanner.nextDouble();
                        System.out.println("Maximum: " + Math.max(max1, max2));
                        break;

                    case 14: // Sine
                        System.out.print("Enter angle in radians: ");
                        double angleSin = scanner.nextDouble();
                        System.out.println("sin: " + Math.sin(angleSin));
                        break;

                    case 15: // Cosine
                        System.out.print("Enter angle in radians: ");
                        double angleCos = scanner.nextDouble();
                        System.out.println("cos: " + Math.cos(angleCos));
                        break;

                    case 16: // Arc Sine
                        System.out.print("Enter a value (-1 to 1): ");
                        double valueAsin = scanner.nextDouble();
                        System.out.println("asin: " + Math.asin(valueAsin));
                        break;

                    case 17: // Arc Cosine
                        System.out.print("Enter a value (-1 to 1): ");
                        double valueAcos = scanner.nextDouble();
                        System.out.println("acos: " + Math.acos(valueAcos));
                        break;

                    case 18: // Arc Tangent
                        System.out.print("Enter a value: ");
                        double valueAtan = scanner.nextDouble();
                        System.out.println("atan: " + Math.atan(valueAtan));
                        break;

                    case 19: // Exponential
                        System.out.print("Enter a number: ");
                        double expNum = scanner.nextDouble();
                        System.out.println("Exponential: " + Math.exp(expNum));
                        break;

                    case 20: // Palindrome Check
                        System.out.print("Enter a number: ");
                        int palNum = scanner.nextInt();
                        System.out.println(isPalindrome(palNum) ? "Palindrome" : "Not a palindrome");
                        break;

                    case 21: // Armstrong Number Check
                        System.out.print("Enter a number: ");
                        int armNum = scanner.nextInt();
                        System.out.println(isArmstrong(armNum) ? "Armstrong number" : "Not an Armstrong number");
                        break;

                    case 22: // Prime Number Check
                        System.out.print("Enter a number: ");
                        int primeNum = scanner.nextInt();
                        System.out.println(isPrime(primeNum) ? "Prime number" : "Not a prime number");
                        break;

                    case 23: // Average Calculation
                        System.out.print("Enter the number of entries: ");
                        int n = scanner.nextInt();
                        double sum = 0;
                        for (int i = 0; i < n; i++) {
                            System.out.print("Enter number " + (i + 1) + ": ");
                            sum += scanner.nextDouble();
                        }
                        System.out.println("Average: " + (sum / n));
                        break;

                    case 24: // GCD Calculation
                        System.out.print("Enter two numbers: ");
                        int numGCD1 = scanner.nextInt();
                        int numGCD2 = scanner.nextInt();
                        System.out.println("GCD: " + gcd(numGCD1, numGCD2));
                        break;

                    case 25: // LCM Calculation
                        System.out.print("Enter two numbers: ");
                        int numLCM1 = scanner.nextInt();
                        int numLCM2 = scanner.nextInt();
                        System.out.println("LCM: " + lcm(numLCM1, numLCM2));
                        break;
                    case 26: // Exit case to end the program
                        exit = true; // Set flag to terminate the loop
                        System.out.println("Exiting program...");
                        break;
                    default: // If user input does not match any menu option
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } catch (Exception e) { // Handle non-numeric inputs gracefully
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Clear the invalid input
            }
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }

    // Additional helper methods for complex calculations such as isPalindrome, isArmstrong, etc.
    public static boolean isPalindrome(int num) {
        int original = num, reverse = 0;
        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        return original == reverse;
    }

    public static boolean isArmstrong(int num) {
        int original = num, sum = 0;
        int digits = String.valueOf(num).length();
        while (num != 0) {
            int remainder = num % 10;
            sum += Math.pow(remainder, digits);
            num /= 10;
        }
        return original == sum;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
