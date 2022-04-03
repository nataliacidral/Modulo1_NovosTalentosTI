import java.util.Scanner;

/*Faça um programa que leia os valores de COMPRIMENTO, LARGURA e ALTURA e apresente 
o valor do volume de uma caixa retangular. Utilize para o cálculo a fórmula VOLUME = 
COMPRIMENTO × LARGURA × ALTURA.*/

public class exercicioSeq10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float comprimento, largura, altura, volume;
        System.out.println("Informe o comprimento");
        comprimento = Float.parseFloat(leitor.nextLine());
        
        System.out.println("Informe a largura");
        largura = Float.parseFloat(leitor.nextLine());
        
        System.out.println("Informe a altura");
        altura = Float.parseFloat(leitor.nextLine());

        volume = comprimento * largura * altura;

        System.out.println("O volume da forma é: " + volume + " cm^3");

        leitor.close();
    }
}
