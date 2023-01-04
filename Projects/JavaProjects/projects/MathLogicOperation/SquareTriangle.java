package MathLogicOperation;

import java.util.Scanner;
public class SquareTriangle {
public static void main(String[]args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Informe a base");
    double a = sc.nextDouble();
    System.out.println("informe a altura");
    double b = sc.nextDouble();
    System.out.println("informe a outra altura");
    double c = sc.nextDouble();
    sc.close();

    double quadrado = (a*a);
    double triangulo = ((b*a)/2);
    double trapezio = (((a+b)*c)/2);

    System.out.println("Quad "+quadrado);
    System.out.println("Tri "+triangulo);
    System.out.println("Tra "+trapezio);

}
}

