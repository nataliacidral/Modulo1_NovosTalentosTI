//import java.util.function.Function;

public class NumPrimitivos {
    public static void main(String[] args) {
        /*System.out.println("Easy\npeasy"); //teste de recurso de quebra de linha
        System.out.println("Peasy"); // teste de quebra de linha por repetição de código*/
        
        /*int = variável do tipo número inteiro
        no java é necessário tipificar a variável.
        CONCEITO: Atribuição de valor = definição de valor para cada variável.*/
        //ENTRADA SOMA
        int primeironumeros = 2, segundonumeros = 3; 
       //PROCESSAMENTO
       int resultadosoma = primeironumeros + segundonumeros;
        //SAÍDA
        //System.out.println("A soma de a + b é " + resultadosoma);   
        //interpolação de string: %d é para números inteiros!!! %f é para números decimais
        System.out.println(String.format("A soma de a com b é: %d", resultadosoma));
        
        int primeironumerosub = 20, segundonumerosub = 10;
        int resultadosub = primeironumerosub - segundonumerosub;
        //System.out.println("A diferença entre a e b é " + resultadosub);    
        System.out.println(String.format("A diferença entre a e b é: %d", resultadosub));
        
        int primeironumerod = 9, segundonumerod = 2;
        float resultadodiv = (float)primeironumerod / (float)segundonumerod;
        //System.out.println("A razão entre a e b é " + resultadodiv);
        //ao usar a máscara %f para números decimais é possível configurar o número de casas que se quer apresentar, no exemplo abaixo, duas casas "%.2f"
        System.out.println(String.format("A razão entre a e b é: %.2f", resultadodiv));

        double primeironumerom = 2.5, segundonumerom = 3;
        float resultadomult = (float)primeironumerom * (float)segundonumerom;
        //System.out.println("A multiplicação entre a e b é " + resultadomult);   
        System.out.println(String.format("A multiplicação de a com b é: %.3f", resultadomult));
    }
}