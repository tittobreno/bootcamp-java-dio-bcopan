package edu.breno.exercises.loops;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int[] numbers = new int[5];
        int count = 0;
        int biggerNumber = 0;
        do {
            System.out.println("Digite um numero: ");
            numbers[count] = scan.nextInt();
            count++;
        } while (count < 5);

        scan.close();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > biggerNumber) {
                biggerNumber = numbers[i];
            }
            sum += numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("O maior número é: " + biggerNumber);
        System.out.println("A média é: " + sum / numbers.length);
    }

}
