import java.util.Scanner;

public class Calculator
 {

    public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);
        int operator;
        double num1, num2, result;

        do {
            System.out.println("Calculator:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice between 1 to 5: ");

            operator = sc.nextInt();

            if (operator == 5)
	    {
                System.out.println("Exiting the calculator program.");
                break;
            }

            if (operator < 1 || operator > 4) {
                System.out.println("Invalid choice!!! Please try again.");
                continue;
            }

            System.out.print("Enter first number: ");
            num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            num2 = sc.nextDouble();

            switch (operator) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 == 0)
			 {
                        System.out.println("Error,Cannot divide by zero!");
                        continue;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("its an Invalid operator!");
                    continue;
            }

            System.out.println("Result: " + result);

        } while (true);

        sc.close();
    }
}

