package br.com.zup;

import java.util.Scanner;

public class Exercicio7 {
    public static void main (String[] args) {
        Scanner peso = new Scanner(System.in);
        System.out.println("Digite o peso do peixe");


        //criando variaveis
        double pesoMaximoPeixe = 50;
        double pesoDoPeixeAdicional = peso.nextDouble();
        double multa = 4;

        //calculo do excedente
        double excedente = pesoDoPeixeAdicional - pesoMaximoPeixe;
        double resultado = excedente * multa;

        System.out.println("Valor da multa a pagar é R$" + resultado);
    }

}
