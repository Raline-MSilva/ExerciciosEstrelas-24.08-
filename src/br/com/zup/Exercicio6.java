package br.com.zup;

import java.util.Scanner;

public class Exercicio6 {
    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Por favor digite os ganhos por hora ");
        int recebe = leitor.nextInt();
        System.out.println("Por favor digite as horas trabalhadas ");
        int trabalhada = leitor.nextInt();

        //calculo das horas
        int salario = recebe * trabalhada;

        //calculando os descontos
        float descontoIR = 0.11F * salario;
        float descontoINSS = 0.08F * salario;
        float descontoSindicato = 0.05F * salario;
        float salarioLiquido = salario - descontoIR - descontoINSS - descontoSindicato;

        //exibindo
        System.out.println("Seu salário por mês é R$ " + salario);
        System.out.println("Seu Desconto do Imposto de Renda é R$ " + descontoIR);
        System.out.println("Seu Desconto do INSS é R$ " + descontoINSS);
        System.out.println("Seu Desconto do Sindicato é R$ " + descontoSindicato);
        System.out.println("Seu Salário Liquido será R$ " + salarioLiquido);
    }
}
