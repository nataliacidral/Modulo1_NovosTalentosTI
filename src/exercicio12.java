import java.util.Scanner;

/*5) Faça um programa que receba o peso de uma pessoa em quilos, calcule e mostre esse peso em gramas.*/

public class exercicio12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double pesoKg, pesog;

        System.out.println("Informe seu peso em Kg");
        pesoKg = Double.parseDouble(leitor.nextLine());
                
        pesog = pesoKg * 1000;

        System.out.println(String.format("Seu peso em gramas é igual a %4.2f", pesog));

        leitor.close();
    }
}
