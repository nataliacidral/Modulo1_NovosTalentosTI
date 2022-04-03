/*7) Faça um programa que calcule o valor da multa por atraso de pagamento de um boleto bancário. 
Solicite o valor do boleto e o percentual de multa. */

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
    
    //entradas
    double valorBoleto, percentualMulta, valorMulta, valorFinalBoleto;
    
    Scanner leitor = new Scanner(System.in);

    System.out.println("Informe o valor do boleto");
    valorBoleto = Integer.parseInt(leitor.nextLine());
    
    System.out.println("Informe o % de multa");
    percentualMulta = Integer.parseInt(leitor.nextLine());

    //processamento
    valorMulta = valorBoleto * (percentualMulta/100);
    valorFinalBoleto = valorBoleto + valorMulta;

    //saída
    //System.out.println("O valor da multa é " + valorMulta + " reais"); 
    System.out.println(String.format("O valor da multa é %4.2f reais", valorMulta)); 
    //System.out.println("O valor final do boleto com a multa é de " + valorFinalBoleto + " reais"); 
    System.out.println(String.format("O valor final do boleto com a multa é de %4.2f reais", valorFinalBoleto));

    leitor.close();
    }
}
