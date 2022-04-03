/*4) Construa um programa que retorne o valor total da revelação de um filme de 24 poses, 
solicite o número de fotos reveladas. E considere que o valor unitário da revelação por 
foto é de R$ 0,90. */

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
    
    //entradas
    Integer fotos;
    final double valorUnitario = 0.9;
    double valorFinal;

    Scanner leitor = new Scanner(System.in);

    System.out.println("Informe o número de fotos a revelar");
    fotos = Integer.parseInt(leitor.nextLine());
    
    //processamento
    valorFinal = fotos * valorUnitario;

    //saída
    //System.out.println("O valor final da revelação será de " + valorFinal + " reais"); 
    System.out.println(String.format("O valor final da revelação será de %4.2f reais", valorFinal)); 

    leitor.close();
    }
}
