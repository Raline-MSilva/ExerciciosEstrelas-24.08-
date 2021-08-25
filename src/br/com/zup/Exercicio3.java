package br.com.zup;

import java.util.Scanner;

public class Exercicio3 {
    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Por favor digite os metros ");
        float metros = leitor.nextFloat();
        System.out.println("Por favor digite os centimetros");
        float centimetros = leitor.nextFloat();

        //calculando
        float conversao = metros * 100;
        float resultado = conversao;
        System.out.println("Sua conversão deu " + resultado);
    }
}
