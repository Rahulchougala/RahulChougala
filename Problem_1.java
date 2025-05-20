package TEST;

import java.util.Scanner;

class CalculatorTest {
    double a, b;
    String operation;

    
    public CalculatorTest(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation.toLowerCase();
    }

    
    public void calculate() {
        switch (operation) {
            case "add":
            case "+":
                System.out.println("Result: " + (a + b));
                break;
            case "subtract":
            case "-":
                System.out.println("Result: " + (a - b));
                break;
            case "multiply":
            case "*":
                System.out.println("Result: " + (a * b));
                break;
            case "divide":
            case "/":
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operation type.");
        }
    }
}

public class Problem_1  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();

        sc.nextLine(); 

        System.out.print("Enter operation (add, subtract, multiply, divide or +, -, *, /): ");
        String operation = sc.nextLine();

        
        CalculatorTest calc = new CalculatorTest(a, b, operation);

       
        calc.calculate();
    }
}
