import java.util.Random;
public class RandomNumber0To10 {
public static void main(String[]args){

  Random random = new Random();

        int numeroInteiroAleatorio_0_a_10 = random.nextInt(10);
        System.out.println("Número inteiro aleatório de 0 até 10: " + numeroInteiroAleatorio_0_a_10);

        double numeroRealAleatorio_0_a_1 = random.nextDouble();
        System.out.println("Número real aleatório de 0 até 1: " + numeroRealAleatorio_0_a_1);

        double numeroRealAleatorio_0_a_10 = random.nextDouble() * 10;
        System.out.println("Número real aleatório de 0 até 10: " + numeroRealAleatorio_0_a_10);

    }

}
