import java.util.Scanner;

/*32)    Faça um programa que receba três notas de um aluno, calcule e mostre a média 
aritmética e a mensagem constante na tabela a seguir. Aos alunos que ficaram para exame,  
calcule e mostre a nota que deverão tirar para serem aprovados, considerando que a média 
exigida é 7.0
Média Aritmética      Mensagem
0,0    ●-------O     3,0      Reprovado
3,0    ●-------O     7,0   Exame
7,0    ●-------● 10,00 Aprovado*/

public class exercicio32 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double nota1, nota2, nota3, media;

        System.out.println("Informe a N1");
        nota1 = Double.parseDouble(leitor.nextLine());

        System.out.println("Informe a N2");
        nota2 = Double.parseDouble(leitor.nextLine());
        
        System.out.println("Informe a N3");
        nota3 = Double.parseDouble(leitor.nextLine());

        media = (nota1 + nota2 + nota3)/3;

        if(media <3){
            System.out.println("Reprovado");
        } else if (media >=3 && media <7) {
            System.out.println("Exame");
        } else if (media >=7){
            System.out.println("Aprovado");
        }
        leitor.close();
    }
}
