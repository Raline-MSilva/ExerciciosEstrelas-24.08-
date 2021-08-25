package br.com.zup;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        // Instanciando o Scanner
        Scanner leitor = new Scanner(System.in);

        System.out.println("Por favor digite a nota 1: ");
        double nota1 = leitor.nextDouble();
        System.out.println("Por favor digite a nota 2: ");
        double nota2 = leitor.nextDouble();
        System.out.println("Por favor digite a nota 3: ");
        double nota3 = leitor.nextDouble();
        System.out.println("Por favor digite a nota 4: ");
        double nota4 = leitor.nextDouble();


        // somando as notas
        double somaDasNotas = nota1 + nota2 + nota3 + nota4;
        double mediaDasNotas = somaDasNotas / 4;

        System.out.println("Sua média é " + mediaDasNotas);

    }
}
