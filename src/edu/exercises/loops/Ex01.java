package edu.exercises.loops;

import java.util.Scanner;

// Faça um programa que leia conjuntos de dois valores,
// o primeiro representando o nome do aluno e o segundo representando a sua idade.
// (Pare o programa inserindo o valor 0 no campo nome)

public class Ex01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name;
        int age;

        while (true) {
            System.out.println("Digite seu nome: ");
            name = scan.nextLine();
            if (name.equals("0"))
                break;

            System.out.println("Digite sua idade: ");
            age = scan.nextInt();
            scan.nextLine();

            System.out.println("Olá " + name + ", você tem " + age + " anos!");
        }
        scan.close();

    }

}
