package br.com.zup;

import java.util.Scanner;

public class Exercicio5 {
    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Por favor digite o valor farenheint para ser convertido em Celsius ");
        double calculo = leitor.nextDouble();

        //convertendo farenheint em celsius
        double converteFemC = calculo - 32 * 5/9;

        //exibindo
        System.out.println(converteFemC + "°");
    }
}
