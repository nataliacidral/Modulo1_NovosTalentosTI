import java.util.Scanner;

/*33)    Faça um programa que receba:
    - o código de um produto comprado, supondo que a digitação do código do produto 
    seja sempre válida, isso é, um número inteiro entre 1 e 10;
    - o peso do produto em quilos;
    - o código do país de origem, supondo que a digitação do código seja sempre válida, 
    isso é, um número inteiro entre 1 e 3.
 
Tabelas:
Código do país de origem    Imposto
1    0%
2    15%
3    25%
 
Código do produto    Preço por grama
1 a 4    R$ 10,00
5 a 7    R$ 25,00
8 a 10    R$ 35,00
 
Calcule e mostre:
- o peso do produto convertido em gramas;
- o preço total do produto comprado;
- o valor do imposto, sabendo que ele é cobrado sobre o preço total do produto 
comprado e depende do país de origem;
- o valor total, preço total do produto mais imposto.*/

public class exercicio33 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int codProd, codPais;
        double pesoKg, pesog, precoTotal = 0, precoFinal, valImposto = 0;

        System.out.println("Informe o código do produto (1 a 10)");
        codProd = Integer.parseInt(leitor.nextLine());

        System.out.println("Informe o peso do produto em Kg");
        pesoKg = Double.parseDouble(leitor.nextLine());
        
        System.out.println("Informe o país de Origem (1 a 3)");
        codPais = Integer.parseInt(leitor.nextLine());

        pesog = pesoKg * 1000;

        if(codProd < 4){
            precoTotal = pesog * 10;
        } else if (codProd >=5 && codProd <=7){
            precoTotal = pesog * 25;
        } else if (codProd >=8){
            precoTotal = pesog * 35;
        }

        
        if(codPais == 1){
            valImposto = 0;
        } else if( codPais == 2){
            valImposto = precoTotal * 0.15;
        } else if(codPais == 3){
            valImposto = precoTotal * 0.25;
        }
        
        precoFinal = precoTotal + valImposto;

        System.out.println(String.format("%4.2f kg corresponde a %4.2f gramas", pesoKg, pesog));
        System.out.println(String.format("O valor total do produto comprado, sem impostos é de R$ %4.2f", precoTotal));
        System.out.println(String.format("O valor do imposto sobre o produto é de R$ %4.2f", valImposto));
        System.out.println(String.format("O valor final do produto comprado, comm impostos é de R$ %4.2f", precoFinal));

        leitor.close();
    }
}
