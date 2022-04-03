import java.util.Scanner;

/*Faça um programa onde serão informados as quatro notas do aluno. O programa irá então 
apresentar a média, se foi aprovado (nota ≥ 7) ou se ficou em exame. Caso o aluno ficou 
em exame, o programa irá então perguntar qual foi a nota do exame e então irá calcular a 
nova média (média anteior com a nota do exame) e informar se ele foi aprovado (nova média ≥ 5)
ou se foi reprovado.*/

public class exercicioDec7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float n1, n2, n3, n4, media, notaExame, novaMedia;

        System.out.println("Informe a Nota1");
        n1 = Float.parseFloat(leitor.nextLine());

        System.out.println("Informe a Nota2");
        n2 = Float.parseFloat(leitor.nextLine());
        
        System.out.println("Informe a Nota3");
        n3 = Float.parseFloat(leitor.nextLine());
        
        System.out.println("Informe a Nota4");
        n4 = Float.parseFloat(leitor.nextLine());
        
        media = (n1 + n2 + n3 + n4)/4;

        if(media>=7){
            //System.out.println("Média = " + media);
            System.out.println("Aprovado");
        } else {
            //System.out.println("Média = " + media);
            System.out.println("Exame");
            System.out.println("Qual sua nota do exame?");
            notaExame = Float.parseFloat(leitor.nextLine());
            novaMedia = (notaExame + media)/2;
            if(novaMedia>=5){
                //System.out.println("Nova média = " + novaMedia);
                System.out.println("Aprovado");
            } else {
                //System.out.println("Nova média = " + novaMedia);
                System.out.println("Reprovado");
            }
        }

        leitor.close();
    }
}
