package br.com.zup;

import java.util.Scanner;

public class Exercicio4 {
    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Por favor digite o seu ganho por hora ");
        double ganhoHora = leitor.nextDouble();

        System.out.println("Por favor digite as horas trabalhadas ");
        double horasTrabalhadas = leitor.nextDouble();

        // calculo do salario
        double calculo = ganhoHora * horasTrabalhadas;
        double salario = calculo;

        // exibindo
        System.out.println("Seu salário é R$" + salario);
    }
}
