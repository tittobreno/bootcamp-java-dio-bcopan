package edu.exercises.loops;

import java.util.Scanner;

// Faça um programa que peça N números inteiros,
// calcule e mostre a quantidade de números pares
// e a quantidade de números impares.

public class Ex04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int amountNumbers;
        int currentNumber;
        int pairNumbers = 0;
        int oddNumbers = 0;

        System.out.println("Digite a quantidade de números: ");
        amountNumbers = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Digite um número: ");
            currentNumber = scan.nextInt();

            if (currentNumber % 2 == 0) {
                pairNumbers++;
            } else {
                oddNumbers++;
            }
            count++;

        } while (count < amountNumbers);

        scan.close();
        System.out.println("Quantidade de números pares: " + pairNumbers);
        System.out.println("Quantidade de números ímpares: " + oddNumbers);
    }
}
