package edu.exercises.loops;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int factorial = scan.nextInt();

        int multiplication = 1;

        System.out.print(factorial + "! = ");
        for (int i = factorial; i >= 1; i--) {
            multiplication = multiplication * i;
        }

        scan.close();
        System.out.println(multiplication);

    }

}
