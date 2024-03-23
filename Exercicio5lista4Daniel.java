
package exercicio5lista4daniel;

import java.util.Scanner;


public class Exercicio5lista4Daniel {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         double habitantesA;
          double habitantesB;
          int anos = 0;
          
          System.out.println("insira os habitantes de um dos paises:  ");
 habitantesA = sc.nextDouble();
 
 System.out.println("insira os habitantes do outro pais:  ");
  habitantesB = sc.nextDouble();
                 
         do { 
             
habitantesA = habitantesA + habitantesA *0.03;    
habitantesB = habitantesB + habitantesB *0.015;
anos= anos + 1; 

}while ( habitantesA<=habitantesB );

System.out.println( "Anos: " + anos);
    }
    
}
