import java.util.Scanner;

/*34)Faça um programa que receba o salário-base de um funcionário, calcule 
e mostre o salário a receber, sabendo-se que esse funcionário tem gratificação 
de 5% sobre o salário base e paga imposto de 7% sobre o salário-base.*/

public class exercicio34 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double salarioBase, salarioReceber, gratificacao, imposto;

        System.out.println("Informe seu salário base");
        salarioBase = Float.parseFloat(leitor.nextLine());

        gratificacao = salarioBase * 0.05;
        imposto = salarioBase * 0.07;
        salarioReceber = salarioBase - imposto + gratificacao;

        System.out.println(String.format("Seu salário a receber é de R$ %4.2f", salarioReceber));
        leitor.close();
    }
}
