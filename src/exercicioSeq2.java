/*Sequencial 2 (Github)
Faça um programa que peça as 4 notas bimestrais e mostre a média.*/

import java.util.Scanner;

public class exercicioSeq2 {
    public static void main(String[] args) {
    //entradas
    float nota1, nota2, nota3, nota4, media;

    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite a N1");
    nota1 = Float.parseFloat(leitor.nextLine());
    
    System.out.println("Digite a N2");
    nota2 = Float.parseFloat(leitor.nextLine());

    System.out.println("Digite a N3");
    nota3 = Float.parseFloat(leitor.nextLine());

    System.out.println("Digite a N4");
    nota4 = Float.parseFloat(leitor.nextLine());

    //processamento
    media = (nota1 + nota2 + nota3 + nota4) / 4;

    //saída
    System.out.println(String.format("A média do aluno é %.1f", media));

    leitor.close();
    }
}
