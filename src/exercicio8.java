import java.util.Scanner;

/*1) Faça um programa que receba um número real, encontre e mostre:
     - a parte inteira desse número;
     - a parte fracionária desse número;
     - o arredondamento desse número;*/

public class exercicio8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float numReal, numFrac, numArred;

        System.out.println("Informe um valor real");
        numReal = Float.parseFloat(leitor.nextLine());
                
        int numInt = (int) numReal;

        numFrac = (numReal - numInt); // numFrac = %1numreal >> traz o resto da divisão do numreal.
        numArred = Math.round(numReal);

        System.out.println("O número inteiro de " +numReal+" é " + numInt + ". A parte fracionaria é " +numFrac+ ". O número arredondado fica " +numArred);

        leitor.close();
    }
}
