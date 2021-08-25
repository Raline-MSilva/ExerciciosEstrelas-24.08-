package br.com.zup;

public class Exercicio6 {
    public static void main (String[] args) {

        //definindo as horas
        int recebePorHora = 35;
        int horasTrabalhadas = 40;

        //calculo das horas
        int salario = recebePorHora * horasTrabalhadas;

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
