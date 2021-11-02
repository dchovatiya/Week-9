package calculate;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {
        int num1, num2;
        char symbol;
        Calculator c = new Calculator();
        Scanner s = new Scanner(System.in);

        System.out.print("Enter first number");
        num1 = s.nextInt();

        System.out.print("Enter second number");
        num2 = s.nextInt();

        System.out.println("Please enter one of the symbol +,-,*,/:");
        symbol = s.next().charAt(0);
        c.calculateResult(num1, num2, symbol);

        System.out.println("Would you like to do more calculation, please enter 'Y' or 'N'..");
        char x = s.next().charAt(0);
        while (x != 'n')
        {
            if (x == 'n')
            {
                break;
            }

                System.out.print("Enter first number");
                num1 = s.nextInt();

                System.out.print("Enter second number");
                num2 = s.nextInt();

                System.out.println("Please enter one of the symbol +,-,*,/:");
                symbol = s.next().charAt(0);
                c.calculateResult(num1, num2, symbol);
                break;
        }
        s.close();
    }

}
