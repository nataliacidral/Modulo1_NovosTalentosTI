import java.util.Scanner;

public class parOuimpar1 {
    public static void main(String[] args) {
        int numero, resto;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um número");
        numero = Integer.parseInt(leitor.nextLine());

        resto = numero % 2;

        System.out.println(resto==0?"PAR":"IMPAR");
        
        leitor.close();
    }
}
