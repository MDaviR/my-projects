import java.util.Scanner;
public class Contador {
public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Me informe o tempo em segundos: ");
        int duração = sc.nextInt();
        sc.close();

        int horas = duração/3600;
        int resto = duração%3600;
        int minutos = resto/60;
        int segundos = resto%60;

        System.out.println("*-------------------------------------*");
        System.out.println("| "+"Horas: "+horas+":"+" minutos: "+minutos+":"+" segundos: "+segundos+" |");
        System.out.println("*-------------------------------------*");

    }
}
