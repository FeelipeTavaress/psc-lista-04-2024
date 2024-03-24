
package exercicio10lista4daniel;

import java.util.Scanner;


public class Exercicio10Lista4Daniel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        
        
        System.out.println(" Escreva um número:");
        num1 = sc.nextInt();
        System.out.println(" Escreva mais um número:");
        num2 = sc.nextInt();
        
        int menorNumero = 0;


    if (num1 < num2){

  menorNumero = num1;

    }else {

  menorNumero = num2;

    }
 int diferenca = Math.abs(num1 - num2);


 for (int i = 1; i < diferenca; i++)

  System.out.print(menorNumero + i + " ");
		
         
    }
    }

