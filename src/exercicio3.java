/*3) Faça um programa que calcule o valor de reembolso de despesas de combustível de um 
funcionário. Considere que o carro tem o consumo de 1 litro de gasolina a cada 13km rodado. 
E o preço do litro de gasolina é de R$ 2,20.*/

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
    
    //entradas
    double kmRodados, consumo, valorReembolso;
    final double litroGasolina = 2.2;

    Scanner leitor = new Scanner(System.in);

    System.out.println("Informe quantos Km você rodou");
    kmRodados = Double.parseDouble(leitor.nextLine());
    
    //processamento
    consumo = (kmRodados/13);
    valorReembolso = consumo * litroGasolina;

    //saída
    //System.out.println("Você será reembolsado em " + valorReembolso + " reais");
    System.out.println(String.format("Você será reembolsado em %4.2f reais", valorReembolso));

    leitor.close();
    }
}
