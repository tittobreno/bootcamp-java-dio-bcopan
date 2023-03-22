package edu.breno.classanatomy;

public class SchoolReport {

    public static void main(String[] args) {
        int finalMedia = 6;

        if (finalMedia < 6)
            System.out.println("REPROVADO");
        else if (finalMedia == 6)
            System.out.println("PROVA DE MINERVA");
        else
            System.out.println("APROVADO");

    }

}
