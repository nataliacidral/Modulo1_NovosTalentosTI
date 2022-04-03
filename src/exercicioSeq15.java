import java.util.Scanner;

/*Considere a seguinte situação: Descontam-se inicialmente 10% do salário bruto do 
trabalhador como contribuição à previdência social. Após esse desconto, há um outro 
desconto de 5% sobre o valor restante do salário bruto, a título de imposto de renda. 
Faça um programa que leia o salário bruto de um cidadão e imprima o seu salário líquido.*/

public class exercicioSeq15 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double salarioBruto, salarioParcial, salarioLiquido;

        System.out.println("Informe seu salario");
        salarioBruto = Double.parseDouble(leitor.nextLine());
        
        salarioParcial = salarioBruto - (0.1 * salarioBruto);     
        salarioLiquido = salarioParcial - (0.05 * salarioParcial);

        System.out.println(String.format("Seu salário bruto é de " + salarioBruto + " reais e seu salário líquido é de " + salarioLiquido + " reais"));

        leitor.close();
    }
}
