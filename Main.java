// Every Java program requires at least one class
public class Main {

    // The main method is where the program starts execution
    public static void main(String[] args) {
        
        // 1. Variables and Data Types
        String name = "Alice";
        int age = 25;
        double gpa = 3.8;
        boolean isStudent = true;

        // Printing to the console
        System.out.println("Hello, " + name + "!");
        System.out.println("Age: " + age);

        // 2. Conditional Statements (if-else)
        if (isStudent && age < 30) {
            System.out.println(name + " is a young student.");
        } else {
            System.out.println(name + " is not a student.");
        }

        // 3. Loops (for loop)
        System.out.println("\nCounting from 1 to 3:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Count: " + i);
        }

        // 4. Calling a Method
        int sum = addNumbers(5, 10);
        System.out.println("\nSum of 5 and 10 is: " + sum);
    }

    // A custom method that takes two integers and returns their sum
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}