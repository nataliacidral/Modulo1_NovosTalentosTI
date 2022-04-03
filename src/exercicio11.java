import java.util.Scanner;

/*4) Faça um programa que receba o peso de uma pessoa, calcule e mostre:
   - o novo peso, se a pessoa engordar 15% sobre o peso digitado;
   - o novo peso, se a pessoa emagrecer 20% sobre o peso digitado.*/

public class exercicio11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double pesoInicial, pesoFinalmais, pesoFinalmenos;

        System.out.println("Informe seu peso");
        pesoInicial = Double.parseDouble(leitor.nextLine());
                
        pesoFinalmais = pesoInicial + (0.15 * pesoInicial); // pesoFinalmais = pesoInicial * 1.15 (100% + 15%)
        pesoFinalmenos = pesoInicial - (0.2 * pesoInicial); // pesFinalmenos = pesoInicial * 0.8 (100% - 20%)

        System.out.println(String.format("Se você engordar 15%% de seu peso, ficará com %4.2f Kg. Se emagrecer 20%% do seu peso, ficará com %4.2f Kg.", pesoFinalmais, pesoFinalmenos));

        leitor.close();
    }
}
