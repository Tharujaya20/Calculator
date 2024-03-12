//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                Calculator calculator = new Calculator();

                System.out.println("Simple Calculator");

                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();

                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();

                System.out.println("Choose an operation:");
                System.out.println("1. Add");
                System.out.println("2. Subtract");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");

                System.out.print("Enter your choice (1-4): ");
                int choice = scanner.nextInt();

                double result;

                switch (choice) {
                    case 1:
                        result = calculator.add(num1, num2);
                        System.out.println("Result: " + result);
                        break;
                    case 2:
                        result = calculator.subtract(num1, num2);
                        System.out.println("Result: " + result);
                        break;
                    case 3:
                        result = calculator.multiply(num1, num2);
                        System.out.println("Result: " + result);
                        break;
                    case 4:
                        result = calculator.divide(num1, num2);
                        System.out.println("Result: " + result);
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose a number between 1 and 4.");
                }

                scanner.close();
        }
    }
