import java.util.Scanner;

/*Faça um programa que peça dois números e imprima o maior deles.*/

public class exercicioDec1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double num1, num2;

        System.out.println("Informe um número");
        num1 = Integer.parseInt(leitor.nextLine());

        System.out.println("Informe outro número");
        num2 = Integer.parseInt(leitor.nextLine());
        
        if(num1 < num2){
            System.out.println(num2 + " é maior");
        } else if (num1 > num2){
            System.out.println(num1 + " é maior");
        } else {
            System.out.println("Os números são iguais");
        }

        leitor.close();
    }
}
