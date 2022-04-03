import java.util.Scanner;

/*Faça um programa que calcule a quantidade de litros de combustível gasta 
em uma viagem, utilizando um automóvel que faz 12Km por litro. Para obter o 
cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média 
durante ela. Desta forma, será possível obter a distância percorrida com a 
fórmula DISTANCIA = TEMPO × VELOCIDADE. Tendo o valor da distância, basta 
calcular a quantidade de litros de combustível utilizada na viagem com a fórmula: 
LITROS_USADOS = DISTANCIA ÷ 12. O programa deve apresentar os valores da velocidade 
média, tempo gasto na viagem, a distância percorrida e a quantidade de litros 
utilizada na viagem.*/
public class exercicioSeq8 {
    public static void main(String[] args) {
        
        Double tempoViagem, velocidadeMedia, distância, qntCombustivel, custoViagem;
        final Integer performance = 10;
        final Double precoCombustivel = 7.1;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Quanto tempo levou a viagem em horas?");
        tempoViagem = Double.parseDouble(leitor.nextLine());
    
        System.out.println("Qual foi a velocidade média do automóvel?");
        velocidadeMedia = Double.parseDouble(leitor.nextLine());

        distância = velocidadeMedia*tempoViagem;
        qntCombustivel = distância/performance;
        custoViagem = qntCombustivel * precoCombustivel;

        System.out.println("Sua viagem de " + distância + " km levou " + tempoViagem + " horas e teve velocidade média de " + velocidadeMedia + ". Foram gastos " + qntCombustivel + "L de combustível." );
        System.out.println(String.format("O custo de sua viagem foi de %.2f reais", custoViagem));
        leitor.close();
    }
}