import java.util.Scanner;

/*35)O custo ao consumidor de um carro novo é a soma do preço da fábrica com o percentual de 
lucro do distribuidor e dos impostos aplicados ao preço de fábrica. Faça um programa que receba 
o preço de fábrica de um veículo, o percentual de lucro do distribuidor e o percentual de impostos. 
Calcule e mostre:
a.    O valor correspondente ao lucro do distribuidor
b.    O valor correspondente aos impostos
c.    O preço final do veículo.*/

public class exercicio35 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double precoFabrica, lucro, imposto, precoFinal;

        System.out.println("Informe o preço de fábrica");
        precoFabrica = Float.parseFloat(leitor.nextLine());

        System.out.println("Informe o percentual de lucro");
        lucro = Float.parseFloat(leitor.nextLine());

        System.out.println("Informe o percentual de impostos");
        imposto = Float.parseFloat(leitor.nextLine());

        precoFinal = precoFabrica + (imposto / 100 * precoFabrica) + (lucro / 100 * precoFabrica);

        System.out.println(
                String.format("O preco final de um veículo cujo preço de fábrica é de R$ %4.2f fica em R$ %4.2f ",
                        precoFabrica, precoFinal));
        leitor.close();
    }
}
