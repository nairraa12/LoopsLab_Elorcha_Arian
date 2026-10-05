package loopslab;

import java.util.Scanner;

public class LoopsLab {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //PROBLEM 1: MULTIPLICATION TABLE GENERATOR (FOR LOOP)
        System.out.println("\n=== MULTIPLICATION TABLE GENERATOR ===");

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));

        }

        //PROBLEM 2: SUM OF NATURAL NUMBERS (WHILE LOOP)
        System.out.println("\n=== SUM OF NATURAL NUMBERS ===");

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int i = 1;
        int sum = 0;

        while (i <= n) {
            sum = sum + i;
            i++;
        }

        System.out.println("Sum = " + sum);

        //PROBLEM 3: FACTORIAL CALCULATOR (DO-WHILE LOOP)
        System.err.println("\n=== FACTORIAL CALCULATOR ===");

        System.out.print("Enter a number: ");

        int no = input.nextInt();

        int factorial = 1;
        int j = 1;

        do {
            factorial = factorial * j;
            j++;
        } while (j <= no);

        System.out.println("Factorial = " + factorial);

        //PROBLEM 4: EVEN AND ODD NUMBERS (FOR LOOP)
        System.out.println("\n=== EVEN AND ODD NUMBERS ===");

        System.out.print("Enter a number: ");

        int numb = input.nextInt();

        System.out.print("Even numbers: ");

        for (int k = 1; k <= numb; k++) {

            if (k % 2 == 0) {
                System.out.print(k + " ");
            }
        }

        System.out.println();

        System.out.print("Odd numbers: ");

        for (int k = 1; k <= numb; k++) {

            if (k % 2 != 0) {
                System.out.print(k + " ");
            }
        }

        System.out.println();

        //PROBLEM 5: REVERSE DIGITS OF A NUMBER (WHILE LOOP)
        System.out.println("\n=== REVERSE DIGITS OF A NUMBER ===");

        System.out.print("Enter a number: ");
        int number1 = input.nextInt();

        int reversed = 0;

        while (number1 != 0) {

            int digit = number1 % 10;

            reversed = reversed * 10 + digit;

            number1 = number1 / 10;
        }

        System.out.println("Reversed: " + reversed);

        input.close();
    }

}
