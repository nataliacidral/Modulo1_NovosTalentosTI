/*Sequencial 5 (Github)
Faça um programa que:

Leia o nome;
Leia o sobrenome;
Concatene o nome com o sobrenome;
Apresente o nome completo.*/

import java.util.Scanner;

public class exercicioSeq5 {
    public static void main(String[] args) {
    //entradas

    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite seu primeiro nome");
    String nome = leitor.nextLine();
    
    System.out.println("Digite seu sobrenome");
    String sobrenome = leitor.nextLine();
    
    //processamento
    String nomeCompleto = nome + " " + sobrenome;
    //saída
    System.out.println("Olá " + nomeCompleto);

    leitor.close();
    }
}
