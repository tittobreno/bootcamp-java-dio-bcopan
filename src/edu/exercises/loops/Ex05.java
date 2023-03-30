package edu.exercises.loops;

import java.util.Scanner;

// Desenvolva um gerador de tabuada,
// capaz de gerar a tabuada de qualquer número inteiro.
// O usuário deve informar de qual numero ele deseja ver a tabuada.

public class Ex05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabuada;

        System.out.println("Digite a tabuada: ");
        tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);
        for (int i = 0; i < 10; i++) {
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
        }
        scan.close();
    }
}