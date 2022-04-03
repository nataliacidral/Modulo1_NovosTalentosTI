/*5) Construa um programa que mostre o percentual que uma despesa mensal representa do seu salário total. */

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
    
    //entradas
    float salario, despesa, percentualDespesa;

    Scanner leitor = new Scanner(System.in);

    System.out.println("Informe seu salário");
    salario = Float.parseFloat(leitor.nextLine());
    
    System.out.println("Informe sua despesa");
    despesa = Float.parseFloat(leitor.nextLine());

    //processamento
    percentualDespesa = (despesa/salario) * 100;

    //saída
    //System.out.println("Sua despesa representa " + percentualDespesa + " % de seu salario"); 
    System.out.println(String.format("Sua despesa representa %4.0f %% do seu salário", percentualDespesa)); 

    leitor.close();
    }
}
