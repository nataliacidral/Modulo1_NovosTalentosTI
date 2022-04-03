import java.util.Scanner;

/*As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 
se forem compradas pelo menos 12 unidades. Escreva um programa que leia o número 
de maçãs compradas, calcule e escreva o custo total da compra. */

public class exercicioDec4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numMacas;
        double valorFinal;

        System.out.println("Informe o numero de maçãs a ser comprada");
        numMacas = Integer.parseInt(leitor.nextLine());

        if(numMacas <12){
            valorFinal = numMacas * 1.3;
        } else {
            valorFinal = numMacas * 1;
        }    

        System.out.println(String.format("O valor a ser pago é igual a R$%4.2f", valorFinal));

        leitor.close();
    }
}
