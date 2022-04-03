//import java.util.function.Function;

public class Comparacoes {
    public static void main(String[] args) {
       //comparação de valores
       int primeironumerod = 1, segundonumerod = 2;
       if(primeironumerod == segundonumerod){
        System.out.println("São iguais");
    } else System.out.println("São diferentes");

     //comparação tipo lógico (booleano)
     boolean resultadocomparacao = primeironumerod == segundonumerod;
    System.out.println(resultadocomparacao); //resultado booleano direto
    System.out.println(resultadocomparacao?"Verdadeiro":"Falso"); // resultado com texto customizável
    }
}
