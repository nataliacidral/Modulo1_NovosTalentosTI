/*2) Faça um programa para calcular a quantidade de carne necessária para um churrasco 
de acordo com o número de pessoas convidadas. Considere que todas são adultas e que um 
adulto consome 250 gramas de carne por refeição.*/

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
    
    //entradas
    Integer convidados;
    double qntCarne;
    final double consumoAdulto = 250;

    Scanner leitor = new Scanner(System.in);

    System.out.println("Informe quantas pessoas serão convidadas para o churrasco");
    convidados= Integer.parseInt(leitor.nextLine());
    
    //processamento
    qntCarne = convidados * consumoAdulto;

    //saída
    //System.out.println("Você precisa de " + qntCarne + " gramas de carne"); 
    System.out.println(String.format("Você precisa de %4.2f gramas de carne", qntCarne)); 

    leitor.close();
    }
}
