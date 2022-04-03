import java.util.Scanner;

/*Faça um programa para calcular e imprimir o número de lâmpadas 
necessárias para iluminar um determinado cômodo de uma residência. 
Dados de entrada: a potência da lâmpada utilizada (em watts), as 
dimensões (largura e comprimento, em metros) do cômodo. Considere 
que a potência necessária é de 18 watts por metro quadrado.*/

public class exercicioSeq12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float largura, comprimento, area, qtdLampadas, watts;
        final float potNecessaria = 18;
        System.out.println("Informe a largura do cômodo");
        largura = Float.parseFloat(leitor.nextLine());
        System.out.println("Informe o comprimento do cômodo");
        comprimento = Float.parseFloat(leitor.nextLine());
        System.out.println("Informe a potência da lâmpada");
        watts = Float.parseFloat(leitor.nextLine());
        
        area = largura * comprimento;
        qtdLampadas = (area * potNecessaria)/watts;

        System.out.println(String.format("Você precisará de %.0f lâmpadas", qtdLampadas));

        leitor.close();
    }
}
