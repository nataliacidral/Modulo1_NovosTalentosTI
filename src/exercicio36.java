import java.util.Scanner;

/*36)Pedro comprou um saco de ração com peso em quilos. Pedro possui dois 
gatos para os quais fornece a quantidade de ração em gramas. Faça um programa 
que receba o peso do saco de ração e a quantidade de ração fornecida para cada 
gato. Calcule e mostre quanto restará de ração no saco após cinco dias.*/

public class exercicio36 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float pesoKg, pesog, porcaoGato, porcaoDia, saldo;

        System.out.println("Informe o peso do saco de ração em Kg");
        pesoKg = Float.parseFloat(leitor.nextLine());

        pesog = pesoKg * 1000;

        System.out.println("Informe a porção para cada gato em gramas");
        porcaoGato = Float.parseFloat(leitor.nextLine());

        porcaoDia = porcaoGato * 2;

        saldo = pesog - (porcaoDia * 5);

        System.out.println(String.format("Após 5 dias restarão %.2f gramas de ração", saldo));
        leitor.close();
    }
}
