package edu.exercises.arrays;

import java.util.Random;

public class Ex03 {
    public static void main(String[] args) {

        int[] numeros = new int[20];
        int[] sucessores = new int[20];

        Random gerador = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = gerador.nextInt(101);
            sucessores[i] = numeros[i] + 1;
        }

        System.out.println("Números: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nSucessores: ");
        for (int i = 0; i < sucessores.length; i++) {
            System.out.print(sucessores[i] + " ");

        }
    }

}
