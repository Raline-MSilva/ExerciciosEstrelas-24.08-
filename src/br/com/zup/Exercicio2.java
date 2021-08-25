package br.com.zup;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        // Instanciando o Scanner
        Scanner leitor = new Scanner(System.in);

        // criando as variaveis das notas
        double nota1 = 7;
        double nota2 = 5;
        double nota3 = 6;
        double nota4 = 8;
        double somaDasNotas = nota1 + nota2 + nota3 + nota4;
        double mediaDasNotas = somaDasNotas / 4;

        System.out.println("Sua média é " + mediaDasNotas);

    }
}
