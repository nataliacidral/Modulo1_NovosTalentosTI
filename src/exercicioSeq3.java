/*Sequencial 3 (Github)
Faça um programa para calcular a área de uma circunferência, considerando a
fórmula AREA = π × RAIO2. Utilize as variáveis AREA e RAIO, a constante π (pi = 3,14159) 
e os operadores aritméticos de multiplicação. */

import java.util.Scanner;

public class exercicioSeq3 {
    public static void main(String[] args) {
    //entradas
    double area, raio;
    final double pi = 3.14159;

    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite o raio da circunferência");
    raio = Float.parseFloat(leitor.nextLine());
    
    //processamento
    area = pi * (Math.pow(raio, 2));

    //saída
    System.out.println(String.format("A área da circunferência é %.1f", area));

    leitor.close();
    }
}
