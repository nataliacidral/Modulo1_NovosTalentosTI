/*Sequencial 4 (Github)
Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro 
número elevado ao segundo número. Utilize a função de potência da linguagem.*/

import java.util.Scanner;

public class exercicioSeq4 {
    public static void main(String[] args) {
    //entradas
    double num1, num2, resultado;

    Scanner leitor = new Scanner(System.in);
    System.out.println("O primeiro número");
    num1 = Double.parseDouble(leitor.nextLine());
    
    System.out.println("O segundo número");
    num2 = Double.parseDouble(leitor.nextLine());
    
    //processamento
    resultado = Math.pow(num1, num2);

    //saída
    System.out.println(String.format(num1 + " elevado a " + num2 + " é igual a " + resultado));

    leitor.close();
    }
}
