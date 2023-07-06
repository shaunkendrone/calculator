import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        String choice;
        double num1, num2;
        char option;
        double result = 0.0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Shaun's Calculator");
            System.out.println("1. Subtraction");
            System.out.println("2. Division");
            System.out.print("Enter your choice: ");
            choice = sc.nextLine();

            if (choice.matches("\\d+")) {
                int mychoice = Integer.parseInt(choice);

                switch (mychoice) {
                    case 1:
                        System.out.println("Enter first number: ");
                        if (sc.hasNextDouble()) {
                            num1 = sc.nextDouble();
                            System.out.println("Enter second number: ");
                            if (sc.hasNextDouble()) {
                                num2 = sc.nextDouble();
                                result = num1 - num2;
                                System.out.printf("Result: %.3f\n", result);
                            } else {
                                System.out.println("Invalid input");
                                sc.next(); 
                            }
                        } else {
                            System.out.println("Invalid input");
                            sc.next(); 
                        }
                        break;

                    case 2:
                        System.out.println("Enter first number: ");
                        if (sc.hasNextDouble()) {
                            num1 = sc.nextDouble();
                            System.out.println("Enter second number: ");
                            if (sc.hasNextDouble()) {
                                num2 = sc.nextDouble();
                                result = num1 / num2;
                                System.out.printf("Result: %.3f\n", result);
                            } else {
                                System.out.println("Invalid input");
                                sc.next(); 
                            }
                        } else {
                            System.out.println("Invalid input");
                            sc.next(); 
                        }
                        break;

                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            } else {
                System.out.println("Invalid input");
            }

            System.out.println("Do you want to continue? (y/n)");
            option = sc.next().charAt(0);
            sc.nextLine(); 
        } while (option == 'y' || option == 'Y');

        System.out.println("Thank you for using Shaun's calculator");
        sc.close();
    }
}
