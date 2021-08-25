package br.com.zup;

import java.util.Scanner;

public class Exercicio3 {
    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Por favor digite os metros para converter em centimetros ");
        float metros = leitor.nextFloat();

        //convertendo metros em centimetros
        float conversao = metros * 100;
        float resultado = conversao;
        System.out.println("Sua Conversão de metros para centimetro é " + resultado);
    }
}
