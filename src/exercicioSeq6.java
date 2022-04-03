/*Sequencial 6 (Github)
Faça um programa que:

Leia um número inteiro;
Leia um segundo número inteiro;
Efetue a adição dos dois valores;
Apresente o valor calculado.*/

import java.util.Scanner;

public class exercicioSeq6 {
    public static void main(String[] args) {
        //entradas
        Integer num1, num2, resultado;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        num1 = Integer.parseInt(leitor.nextLine());
    
        System.out.println("Digite outro número inteiro");
        num2 = Integer.parseInt(leitor.nextLine());

        //processamento
        resultado = num1 + num2;

        //saída
        System.out.println("O resultado é " + resultado);
        leitor.close();
    }
}
