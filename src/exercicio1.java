/*1) Faça um programa que solicite o número de horas que um trabalhador realiza 
por dia, solicite o número de dias trabalhados em um mês e apresente o número 
total de horas trabalhadas no mês.*/

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
    
    //entradas
    Double horasDia, diasMes, horasMes, salarioHora, salarioMes;

    Scanner leitor = new Scanner(System.in);

    System.out.println("Informe quantas horas trabalha por dia");
    horasDia= Double.parseDouble(leitor.nextLine());

    System.out.println("Informe quantos dias trabalha por mês");
    diasMes = Double.parseDouble(leitor.nextLine());

    System.out.println("Informe seu salario/h");
    salarioHora = Double.parseDouble(leitor.nextLine());
    
    //processamento
    horasMes = horasDia * diasMes;
    salarioMes = horasMes * salarioHora;

    //saída
    //System.out.println("Você trabalha " + horasMes + " horas por mês"); 
    System.out.println(String.format("Você trabalha %4.2f horas por mês", horasMes)); 
    //System.out.println("Você recebe " + salarioMes + " por mês"); 
    System.out.println(String.format("Você recebe %4.2f por mês", salarioMes)); 

    leitor.close();
    }
}
