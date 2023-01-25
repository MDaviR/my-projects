package MathLogicOperation;
import java.util.Scanner;
public class Math {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        
        double n1, n2, soma, sub, mult, div;

        System.out.println("Informe o primeiro numero: ");
        n1 = sc.nextDouble();

        System.out.println("Informe outro numero: ");
        n2 = sc.nextDouble();

        sc.close();

        soma = n1 + n2;
        sub = n1 = n2;
        mult = n1 * n2;
        div = n1 / n2;

        System.out.println("Soma : "+soma);
        System.out.println("sub : "+sub);
        System.out.println("mult : "+mult);
        System.out.println("divisao : "+div);

    }

}