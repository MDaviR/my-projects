import java.util.Scanner;
public class WhatTimeIsit { 
public static void main(String[] args) {

   Scanner sc = new Scanner(System.in); 
   int hora; 
   System.out.print("Informe as horas e minutos: "); 
   hora = sc.nextInt(); 
   sc.close();

   if (hora >= 600 && hora <= 1259 && hora !=0000) {

      System.out.println("Bom dia!");

 } else if (hora >= 1300 && hora <= 1759 && hora != 0000) {

      System.out.println("Boa tarde!");

 } else {

      System.out.println("Boa noite");
      
 } 
 
 } 
} 
