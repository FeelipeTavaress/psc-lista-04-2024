
package exercicio2lista4;

import java.util.Scanner;


public class Exercicio2Lista4 {

   
    public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
         
          String usuario;
          String senha;
          
          
         System.out.print( "Informe o usúario: ");
         usuario = sc.nextLine();
         
         System.out.print( "Informe a senha: ");
         senha = sc.nextLine();
         
         while (usuario.equals(senha)){
               System.out.print( "usuário e senha iguais! Insira dados validos ");
               
                System.out.print( "\n Informe o usúario: ");
         usuario = sc.nextLine();
         
         System.out.print( "Informe a senha: ");
         senha = sc.nextLine();
         
        
         sc.close();
         }
    }
}
