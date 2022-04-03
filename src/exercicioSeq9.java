import java.util.Scanner;

/*Faça um programa para determinar o consumo médio de um automóvel 
sendo fornecida a distância total percorrida pelo automóvel e o total 
de combustível gasto.*/

public class exercicioSeq9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float distancia, volumeCombustivel, consumoMedio;
        System.out.println("Informe a distância percorrida");
        distancia = Float.parseFloat(leitor.nextLine());
        
        System.out.println("Informe o volume de combustível consumido");
        volumeCombustivel = Float.parseFloat(leitor.nextLine());
        
        consumoMedio = distancia/volumeCombustivel;

        System.out.println("O consumo médio de seu veículo é de " + consumoMedio + "km/L");

        leitor.close();
    }
}
