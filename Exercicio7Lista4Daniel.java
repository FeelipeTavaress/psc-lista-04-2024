
package exercicio7lista4daniel;

import java.util.Scanner;

public class Exercicio7Lista4Daniel {
         

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i = 1;
        System.out.print("escreva um número " + ": ");
        int numero = sc.nextInt();
        int maior = numero;
        for (i = 2; i <= 5; i++) {
            System.out.print("escreva um número" + ": ");
            numero = sc.nextInt();
            if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println("O maior numero é o: " + maior);
  }
    }

