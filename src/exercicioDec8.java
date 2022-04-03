import java.util.Scanner;

/*8) A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar 
mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 
50%. Escreva um programa que leia o número de horas trabalhadas em um mês, o salário por hora e 
escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido 
trabalhadas (considere que o mês possua 4 semanas exatas).*/

public class exercicioDec8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double horasTrabalhadas, salarioHora, salarioTotal, horasExtras, salarioHoraExtra = 0, horasRegulares = 0;

        System.out.println("Informe quantas horas trabalhou no mês");
        horasTrabalhadas = Double.parseDouble(leitor.nextLine());

        System.out.println("Informe seu salário por hora");
        salarioHora = Double.parseDouble(leitor.nextLine());

        if (horasTrabalhadas > 40) {
            horasExtras = horasTrabalhadas - 40;
            salarioHoraExtra = (0.5 * salarioHora) + salarioHora;
        } else {
            horasExtras = 0;
        }
        horasRegulares = horasTrabalhadas - horasExtras;
        salarioTotal = (salarioHora * horasRegulares) + (salarioHoraExtra * horasExtras);
        System.out.println(String.format("Seu salário final nesse mês será de R$ %4.2f", salarioTotal));

        leitor.close();
    }
}
