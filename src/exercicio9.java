import java.util.Scanner;

/*2) Faça um programa que receba o preço de um produto, 
calcule e mostre o novo preço, sabendo-se que esse sofreu 
um desconto de 10%*/

public class exercicio9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double precoInicial, percDesconto, desconto, precoFinal;
        percDesconto = 0.1;

        System.out.println("Informe o valor do produto");
        precoInicial = Double.parseDouble(leitor.nextLine());
        
        desconto = precoInicial * percDesconto;
        precoFinal = precoInicial - desconto;
                
        System.out.println(String.format("O produto de valor R$ %4.2f, com desconto de %4.2f fica R$ %4.2f .", precoInicial, desconto, precoFinal));

        leitor.close();
    }
}
