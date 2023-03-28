package edu.breno.exercises.loops;

// Faça um programa que peça uma nota, entre zero e dez.
// Mostre uma mensagem caso o valor seja inválido.
// Continue pedindo até que o usuário informe um valor válido.
import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int note;

        System.out.println("Informe sua nota: ");
        note = scan.nextInt();

        while (note < 0 | note > 10) {
            System.out.println("Nota inválida, digite novamente:");
            note = scan.nextInt();
        }
        scan.close();

        System.out.println("Sua nota é " + note + "!");
    };
};
