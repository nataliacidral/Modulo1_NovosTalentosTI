import java.util.Scanner;

/*Faça um programa que leia quatro números e apresente os resultados de adição e 
multiplicação dos valores entre si, baseando-se na utilização da propriedade distributiva, 
ou seja, se forem lidas as variáveis A, B, C e D, devem ser somadas e multiplicadas A com
B, A com C e A com D; B com C, B com D e por último C com D.*/

public class exercicioSeq16 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double A, B, C, D, resultado;

        System.out.println("Informe um valor para A");
        A = Double.parseDouble(leitor.nextLine());
        System.out.println("Informe um valor para B");
        B = Double.parseDouble(leitor.nextLine());
        System.out.println("Informe um valor para C");
        C = Double.parseDouble(leitor.nextLine());
        System.out.println("Informe um valor para D");
        D = Double.parseDouble(leitor.nextLine());
        
        resultado = A*(B+C+D);

        System.out.println("O resultado é " + resultado);

        leitor.close();
    }
}
