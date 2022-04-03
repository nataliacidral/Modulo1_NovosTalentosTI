import java.util.Scanner;

/*Faça um programa que leia a idade de uma pessoa expressa em anos, meses e 
dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano 
com 365 dias e mês com 30 dias. Calcular quantos dias a pessoa já viveu até hoje.*/

public class exercicioSeq11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Integer anos, meses, dias;
        System.out.println("Informe sua idade em anos");
        anos = Integer.parseInt(leitor.nextLine());
        
        meses = anos * 12;
        dias = anos * 365;

        System.out.println("Sua idade em dias é: " + dias);
        System.out.println("Sua idade em meses é: " + meses);

        leitor.close();
    }
}
