import java.util.Scanner; 
public class For { 
public static void main(String[] args) { 
    
    Scanner sc = new Scanner(System.in); 
    int N, i, x, soma; 
    System.out.print("Quantos numeros serao digitados? "); 
    N = sc.nextInt(); 
    soma = 0;

    for (i = 1; i <= N; i++) { 
        System.out.print("Digite um numero: "); 
        x = sc.nextInt(); 
        soma = soma + x; 
 } 
    System.out.println("SOMA = " + soma); 
    sc.close(); 
 } 
} 
