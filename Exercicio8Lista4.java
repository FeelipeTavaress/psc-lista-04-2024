/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio8lista4;

import java.util.Scanner;


public class Exercicio8Lista4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    double num1;
    double num2;
    double num3;
    double num4;
    double num5;
    
    double media;
    double soma;
    
    System.out.print("escreva um número:");
    num1 = sc.nextDouble();
    
    System.out.print("escreva mais um número:");
    num2 = sc.nextDouble();
    
    System.out.print("escreva mais um número:");
    num3 = sc.nextDouble();
    
    System.out.print("escreva mais um número:"); 
    num4 = sc.nextDouble();
    
    System.out.print("escreva mais um número:");
    num5 = sc.nextDouble();
    
    soma = (num1 + num2 + num3 + num4 + num5);
    
    media = (num1 + num2 + num3 + num4 + num5) /5;
    
    
    System.out.print("A soma é: " + soma);
    System.out.print("\n A média é: " + media);
    }
    
    
    
}
