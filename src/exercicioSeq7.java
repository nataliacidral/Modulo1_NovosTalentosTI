import java.util.Scanner;

/* Faça um programa que leia uma temperatura em graus Celsius 
e apresente-a convertida em graus Fahrenheit. A fórmula de conversão 
é: ℉ = (9 × ℃ + 160) ÷ 5, na qual ℉ é a temperatura em Fahrenheit e 
℃ é a temperatura em Celsius. */

public class exercicioSeq7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float celcius, fahrenheit;
        
        System.out.println("Digite a temperatura em graus Celcius");
        celcius = Float.parseFloat(leitor.nextLine());

        fahrenheit = ((9 * celcius) + 160) / 5;

        System.out.println(celcius + " graus Celcius corresponde a " + fahrenheit + " graus Fahrenheit.");

        leitor.close();
    }
}
