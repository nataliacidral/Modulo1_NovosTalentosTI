import java.util.Scanner;

/*Pedir idade >> Dizer se é jovem, adulta ou idosa
Considerando: 
0-20 = jovem;
21-60 = adulto
>60 = idoso
.*/

public class exercicioExtraDecisao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int idade;

        System.out.println("Informe sua idade");
        idade = Integer.parseInt(leitor.nextLine());

        if(idade <=20){
            System.out.println("Você é jovem");
        } else if(idade>=21 && idade <=60){
            System.out.println("Você é adulto");
        } else {
            System.out.println("Você é idoso");
        }

        /*if(idade<=20){
            System.out.println("Você é jovem");
        } else {
            if(idade<=60){
                System.out.println("Você é adulto");
            } else {
                System.out.println("Você é idoso");
            }
        }*/

        leitor.close();
    }
}
