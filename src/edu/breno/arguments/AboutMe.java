package edu.breno.arguments;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String name = reader.next();

        System.out.println("Digite seu sobrenome:");
        String lastName = reader.next();

        System.out.println("Dgigite sua idade:");
        int age = reader.nextInt();

        System.out.println("Digite sua altura:");
        double height = reader.nextDouble();

        reader.close();

        System.out.println("-------");

        System.out.println("Ola, me chamo " + name + " " + lastName);
        System.out.println("Tenho " + age + " anos");
        System.out.println("Minha altura e " + height + "cm");
    }
}