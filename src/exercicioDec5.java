import java.util.Scanner;

/*Faça um programa para aprovar empréstimos bancários. O código deve pedir três 
informações: valor do empréstimo, número de parcelas e salário do solicitante. 
Aprovar empréstimo caso o valor das parcelas representem no máximo 30% do salário 
do solicitante.*/

public class exercicioDec5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numParcelas;
        double valorEmprestimo, salario, valorParcela;

        System.out.println("Informe o salário do solicitante");
        salario = Integer.parseInt(leitor.nextLine());

        System.out.println("Informe o valor do empréstimo solicitado");
        valorEmprestimo = Integer.parseInt(leitor.nextLine());

        System.out.println("Informe em quantas parcelas o solicitante irá pagar");
        numParcelas = Integer.parseInt(leitor.nextLine());

        valorParcela = valorEmprestimo / numParcelas;

        if(valorParcela<= 0.3*salario){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        leitor.close();
    }
}
