import java.util.Scanner;

/*31)    Faça um programa que mostre o menu de opções a seguir, receba a opção do 
usuário e os dados necessários para executar cada operação.
Menu de opções:
1.    Somar dois números
2.    Raiz quadrada de um número
Solicite ao usuário digitar a opção desejada.*/

public class exercicio31 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double num1, num2, soma, raizquadrada;
        int operacao;

        System.out.println("Digite um número");
        num1 = Double.parseDouble(leitor.nextLine());

        System.out.println("Digite a operação desejada (Raiz quadrada = 1, Soma = 2)");
        operacao = Integer.parseInt(leitor.nextLine());

        if(operacao == 1){
            raizquadrada = Math.sqrt(num1);
            System.out.println(String.format("A raiz quadrada de %4.2f é %4.2f", num1, raizquadrada));
        } else {
            System.out.println("Digite outro número");
            num2 = Double.parseDouble(leitor.nextLine());
            soma = num1 + num2;
            System.out.println(String.format("A soma de %4.2f com %4.2f é igual a %4.2f", num1, num2, soma));
        }

        leitor.close();
    }
}
