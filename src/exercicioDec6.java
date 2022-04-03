import java.util.Scanner;

/*A empresa paga ao corretor uma comissão calculada de acordo com o valor de suas vendas.
Se o valor da venda de um corretor for maior que R$ 50.000,00 a comissão será de 12% do 
valor vendido. Se o valor da venda do corretor estiver entre R$ 30.000,00 e R$ 50.000,00 
(incluindo extremos) a comissão será de 9,5%. Em qualquer outro caso, a comissão será de 7%. 
Escreva um programa onde será informado nome do corretor e o valor da venda, após isto o programa
irá calcular o valor da comissão.*/

public class exercicioDec6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nomeCorretor;
        double valorVenda, comissao;

        System.out.println("Informe o nome do corretor");
        nomeCorretor = leitor.nextLine();
        
        System.out.println("Informe o valor da venda");
        valorVenda = Double.parseDouble(leitor.nextLine());

        if(valorVenda > 50000){
            comissao = valorVenda * 0.12;
        } else if (valorVenda >= 30000 && valorVenda <= 50000){
            comissao = valorVenda * 0.095;
        } else {
            comissao = valorVenda * 0.07;
        }

        System.out.println("Corretor " + nomeCorretor + " sua comissão será de R$ " + comissao + ".");

        leitor.close();
    }
}
