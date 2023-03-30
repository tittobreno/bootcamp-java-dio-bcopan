package edu.exercises.arrays;

public class Ex01 {

    public static void main(String[] args) {

        int[] vetor = { 5, 78, 6, 8, 5, 23 };

        System.out.println("Vetor original:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\nVetor invertido:");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

    }

}
