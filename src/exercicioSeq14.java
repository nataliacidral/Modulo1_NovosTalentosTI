import java.util.Scanner;

/*Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros 
quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para 
cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. 
Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.*/

public class exercicioSeq14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double area, qntLatas, valorFinal;
        final double valorLata = 80, coberturaLata = 54; // coberturaLata, cada lata possui 18 litros e cada litro cobre 3m, coberturaLata = 18*3

        System.out.println("Informe a área do cômodo");
        area = Double.parseDouble(leitor.nextLine());
        
        qntLatas = Math.ceil(area/coberturaLata);     
        valorFinal = qntLatas * valorLata;

        System.out.println(String.format("Você precisará de " + qntLatas + " latas e custará " + valorFinal + " reais"));

        leitor.close();
    }
}
