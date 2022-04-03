import java.util.Scanner;

/*38) Faça um programa que receba o preço de um produto e o seu código de origem
e mostre a sua procedência. A procedência obedece a tabela a seguir:
Código de origem    Procedência
1                   Sul
2                   Norte
3                   Leste
4                   Oeste
5 ou 6              Nordeste
7 ou 8 ou 9         Sudeste
10 a 20             Centro-Oeste
21 a 30             Nordeste*/

public class exercicio38 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int codProduto;
        String procedencia = "";

        System.out.println("Informe o código do produto");
        codProduto = Integer.parseInt(leitor.nextLine());

        if (codProduto == 1) {
            procedencia = "Sul";
        } else if (codProduto == 2) {
            procedencia = "Norte";
        } else if (codProduto == 3) {
            procedencia = "Leste";
        } else if (codProduto == 4) {
            procedencia = "Oeste";
        } else if (codProduto == 5 || codProduto == 6) {
            procedencia = "Nordeste";
        } else if (codProduto >= 7 && codProduto <= 9) {
            procedencia = "Sudeste";
        } else if (codProduto >= 10 && codProduto <= 20) {
            procedencia = "Centro-Oeste";
        } else {
            procedencia = "Nordeste";
        }
        System.out.println("O produto vem do " + procedencia);
        leitor.close();
    }
}
