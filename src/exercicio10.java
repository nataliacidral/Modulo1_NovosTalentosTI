import java.util.Scanner;

/*3) Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas. 
Faça um programa que receba o salário fixo do funcionário e o valor de suas vendas, 
calcule e mostre a comissão e seus salário final.*/

public class exercicio10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double salarioFixo, valorVendas, comissao, salarioFinal;

        System.out.println("Informe seu salário fixo");
        salarioFixo = Double.parseDouble(leitor.nextLine());
        System.out.println("Informe o valor de suas vendas");
        valorVendas = Double.parseDouble(leitor.nextLine());
        
        comissao = 0.04 * valorVendas;
        salarioFinal = salarioFixo + comissao;

        System.out.println(String.format("Após R$ %4.2f em vendas, seu salario final ficou em R$ %4.2f", valorVendas, salarioFinal));

        leitor.close();
    }
}
