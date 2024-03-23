
package exercicio3lista4;

import java.util.Scanner;


public class Exercicio3Lista4 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadocivil;
     
     while(true) {
        System.out.println("Insira com seu nome: ");
         nome = sc.nextLine();
         
         
         if (nome.length()< 3) {
              System.out.print( "Insira no mínimo 3 caracteres! \n");
         } else {
             break;
         }
     }
      while(true){
          System.out.print( "Insira sua idade: ");
          idade = sc.nextInt();
          
          if (idade >= 0 && idade <= 150) {
      break;
    } else {
      System.out.println("Insira valores entre 0 e 150! \n");
    }
  }
          
          while (true) {
    System.out.println("Insira seu salario: ");
    salario = sc.nextDouble();
    
    if (salario > 0) {
      break;
    } else {
      System.out.println("Insira valores acima de 0! \n");
    }
  }
  
    
    while (true) {
    System.out.println("Insira seu sexo: ");
    sexo = sc.next();
    sexo.toLowerCase();
    
    if (sexo.equals("f") || sexo.equals("m")) {
      break;
    } else {
      System.out.println("Insira valores validos como f ou m! \n");
    }
    }
     
     while (true) {
    System.out.println("Insira seu Estado Civil:  ");
    estadocivil = sc.next();
    estadocivil.toLowerCase();

    if (estadocivil.equals("s") || estadocivil.equals("c") || estadocivil.equals("v") || estadocivil.equals("d")) {
     break;
     
    } else {
      System.out.println("Entre com valores validos como s, c, v, d! \n");
       System.out.println("Insira seu Estado Civil: ");
        estadocivil = sc.next();
     
    }
     sc.close();
     }
    }
    }
  
      
    
