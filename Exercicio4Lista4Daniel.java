
package exercicio4lista4daniel;



public class Exercicio4Lista4Daniel {

   
    public static void main(String[] args) {
          double habitantesA = 80000;
          double habitantesB = 200000;
          int anos = 0;
                 
         do { 

habitantesA = habitantesA + habitantesA *0.03;    
habitantesB = habitantesB + habitantesB *0.015;
anos= anos + 1; 

}while ( habitantesA<=habitantesB );

System.out.println( "Anos: " + anos);
         }
         }
    
