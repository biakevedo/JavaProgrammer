package aula02;

public class ParOuImpar {
    public static void main(String[] args) {
        int valor = 2;
        
        String resultado = (valor % 2 == 0) ? "Par" : "Impar";
        
        System.out.println("O número " + valor + " é " + resultado);
    }
}