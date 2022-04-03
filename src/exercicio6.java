/*6) Construa um programa que calcule a quantidade total de ração consumida por um cachorro por mês. 
Solicite a quantidade consumida por refeição e o numero de refeições por dia. */

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
    
    //entradas
    double qntRefeicao, qntTotalRacao;
    int diasMes, refeicoesDia;

    Scanner leitor = new Scanner(System.in);

    System.out.println("Informe quantos gramas de ração seu cachorro consome por refeição");
    qntRefeicao = Integer.parseInt(leitor.nextLine());
    
    System.out.println("Informe quantas refeições seu cachorro faz por dia");
    refeicoesDia = Integer.parseInt(leitor.nextLine());

    System.out.println("Quantos dias esse mês teve?");
    diasMes = Integer.parseInt(leitor.nextLine());

    //processamento
    qntTotalRacao = qntRefeicao * refeicoesDia * diasMes;

    //saída
    //System.out.println("Nesse mês seu cachorro consumiu " + qntTotalRacao + " gramas de ração"); 
    System.out.println(String.format("Nesse mês seu cachorro consumiu %4.2f gramas de ração", qntTotalRacao)); 

    leitor.close();
    }
}
