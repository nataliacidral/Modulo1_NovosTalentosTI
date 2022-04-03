import java.util.Scanner;

/*37)Faça um programa que receba o código correspondente ao cargo de um funcionário 
e seu salário atual e mostre o cargo, o valor do aumento e seu novo salário. Os cargos
estão na seguinte tabela:

Código         Cargo          Percentual
1              Escriturário    50%
2              Secretário      35%
3              Caixa           20%
4              Gerente         10%
5              Diretor         Não tem aumento*/

public class exercicio37 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int codCargo;
        double salarioAtual, aumento = 0, novoSalario;

        System.out.println(
                "Informe o código de seu cargo: (1)Escrituário, (2)Secretário, (3)Caixa, (4)Gerente, (5)Diretor.");
        codCargo = Integer.parseInt(leitor.nextLine());

        System.out.println("Informe seu salário atual");
        salarioAtual = Double.parseDouble(leitor.nextLine());

        if (codCargo == 1) {
            aumento = 0.5 * salarioAtual;
            System.out.println("Você teve um aumento de R$" + aumento);
        } else if (codCargo == 2) {
            aumento = 0.35 * salarioAtual;
            System.out.println("Você teve um aumento de R$" + aumento);
        } else if (codCargo == 3) {
            aumento = 0.20 * salarioAtual;
            System.out.println("Você teve um aumento de R$" + aumento);
        } else if (codCargo == 4) {
            aumento = 0.10 * salarioAtual;
            System.out.println("Você teve um aumento de R$" + aumento);
        } else {
            aumento = 0;
            System.out.println("Não recebe aumento.");
        }
        novoSalario = salarioAtual + aumento;
        System.out.println("Seu salário atualizado é de R$" + novoSalario);
        leitor.close();
    }
}
