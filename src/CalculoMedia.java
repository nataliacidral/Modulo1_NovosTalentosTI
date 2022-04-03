import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
    
    //Escrever um programa que solicite 4 notas e calcule a média
  
    //Entradas: Nota1, Nota2, Nota3, Nota4
    //double nota1=0, nota2=0, nota3=0, nota4=0;
    //como identificar variáveis: possuem tipo, nome e podem conter valor. Ex.: final double (tipo) nota1 (nome).
    final double nota1, nota2, nota3, nota4;
    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite a Nota 1");
    // necessário converter objeto para tipo primitivo:
    nota1= Double.parseDouble(leitor.nextLine());
    System.out.println("Digite a Nota 2");
    nota2 = Double.parseDouble(leitor.nextLine());
    System.out.println("Digite a Nota 3");
    nota3 = Double.parseDouble(leitor.nextLine());
    System.out.println("Digite a Nota 4");
    nota4 = Double.parseDouble(leitor.nextLine());
    System.out.println(leitor);

    //Processamento: (N1 + N2 + N3 + N4)/4
    // final (modificador)= constante >> modificadores sempre vão na frente do elemento.
    //final Double media = (nota1 + nota2 + nota3 + nota4) / 4;

    // "var" permite que o JAVA crie variável com o tipo de valor que foi Atribuído no código
    // não é aplicável para variáveis no escopo global, apenas no escopo local.
    final var media = (nota1 + nota2 + nota3 + nota4) / 4;

    //Saída: Média
    System.out.println("A media do aluno é " + media); 

    leitor.close();
    }
}
