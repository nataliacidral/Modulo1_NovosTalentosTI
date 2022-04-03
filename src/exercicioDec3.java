import java.util.Scanner;

/*Faça um programa que leia três números e mostre o maior deles.*/

public class exercicioDec3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double num1, num2, num3;

        System.out.println("Informe um número");
        num1 = Integer.parseInt(leitor.nextLine());

        System.out.println("Informe outro número");
        num2 = Integer.parseInt(leitor.nextLine());

        System.out.println("Informe outro número");
        num3 = Integer.parseInt(leitor.nextLine());
        
        if(num1>num2 && num1>num3 && num2>num3){                
            System.out.println(num1 +" "+ num2 +" "+ num3);    
        } else if(num2>num1 && num1>num3){
            System.out.println(num2 +" "+ num1 +" "+ num3);
        } else if(num1>num3 && num3>num2){
            System.out.println(num1 +" "+ num3 +" "+ num2);
        } else if(num2>num3 && num3>num1){
            System.out.println(num2 +" "+ num3 +" "+ num1);
        } else if(num3>num2 && num2>num1){
            System.out.println(num3 +" "+ num2 +" "+ num1);
        } else {
            System.out.println(num3 +" "+ num1 +" "+ num2);
        }    
        leitor.close();
    }
}
