import java.util.Scanner;

/*Faça um programa que leia três números e mostre o maior deles.*/

public class exercicioDec2_1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double num1, num2, num3;

        System.out.println("Informe um número");
        num1 = Integer.parseInt(leitor.nextLine());

        System.out.println("Informe outro número");
        num2 = Integer.parseInt(leitor.nextLine());

        System.out.println("Informe outro número");
        num3 = Integer.parseInt(leitor.nextLine());

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(num1 + " é o maior");
                if (num2 > num3) {
                    System.out.println(num2 + " é o médio");
                    System.out.println(num3 + " é o menor");
                } else {
                    System.out.println(num3 + " é o médio");
                    System.out.println(num2 + " é o menor");
                }
            } else {
                System.out.println(num3 + " é o maior");
                System.out.println(num1 + " é o médio");
                System.out.println(num2 + " é o menor");
            }
        } else if (num2 > num3) {
            System.out.println(num2 + " é o maior");
            if (num1 > num3) {
                System.out.println(num1 + " é o médio");
                System.out.println(num3 + " é o menor");
            } else {
                System.out.println(num3 + " é o médio");
                System.out.println(num1 + " é o menor");
            }
        } else {
            System.out.println(num3 + " é o maior");
            System.out.println(num2 + " é o médio");
            System.out.println(num1 + " é o menor");
        }
        leitor.close();
    }
}