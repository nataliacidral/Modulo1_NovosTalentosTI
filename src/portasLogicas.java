import java.util.Scanner;

public class portasLogicas {
    public static void main(String[] args) {
    final double nota1, nota2, nota3, nota4;
    double presenca = 0;
    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite a Nota 1");
    nota1= Double.parseDouble(leitor.nextLine());
    System.out.println("Digite a Nota 2");
    nota2 = Double.parseDouble(leitor.nextLine());
    System.out.println("Digite a Nota 3");
    nota3 = Double.parseDouble(leitor.nextLine());
    System.out.println("Digite a Nota 4");
    nota4 = Double.parseDouble(leitor.nextLine());
    System.out.println(leitor);
    System.out.println("Digite o % de presença do Aluno");
    presenca = Double.parseDouble(leitor.nextLine());
    System.out.println(leitor);

    final var media = (nota1 + nota2 + nota3 + nota4) / 4;

    System.out.println("A media do aluno é " + media); 

    boolean situacao = media >= 7 && presenca >= 75;

    /*if(situacao) {
        System.out.println("O aluno foi aprovado");
    } 
    else {
        System.out.println("O aluno foi reprovado");
    }*/

    //operador ternário (abaixo): utilizado quando se quer informar o resultado do boolean em meio a texto.        
    System.out.println("Situação: " + (situacao?"Aprovado":"Reprovado"));

    leitor.close();
    }
}
