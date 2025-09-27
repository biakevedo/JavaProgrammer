package aula03;

//Importa a classe Scanner, que permite ler dados digitados pelo usuário
import java.util.Scanner;

public class NumeroPrimo {
 public static void main(String[] args) {
     // Cria um objeto Scanner para ler a entrada do usuário
     Scanner sc = new Scanner(System.in);

     // Solicita ao usuário que digite um número
     System.out.print("Digite um número: ");
     int num = sc.nextInt();  // Lê o número digitado e armazena na variável 'num'

     // Assume inicialmente que o número é primo se for maior que 1
     boolean primo = num > 1;

     // Laço para verificar se algum número entre 2 e a raiz quadrada de 'num' divide ele
     for (int i = 2; i <= Math.sqrt(num); i++) {
         if (num % i == 0) { // Se 'num' for divisível por 'i', não é primo
             primo = false;
             break; // Encerra o laço assim que encontra um divisor
         }
     }

     // Exibe o resultado na tela
     System.out.println(num + (primo ? " é primo." : " não é primo."));

     // Fecha o Scanner para liberar recursos
     sc.close();
 }
}
