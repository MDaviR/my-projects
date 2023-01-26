package MateusDavi.faculdadeengexercicios.ordenaçãodedados;
import javax.swing.JOptionPane;

public class RecursãoEmJavaFatorialComCauda {

    static int fat(int n) {
        int f;

        if (n == 0) {
            return 1; // regra 1
        } else {
            // chamada da função recursiva
            f = n * fat(n - 1); //regra 2 e 3
            return f;
        }
    }
    public static void main (String [] args){
        int f, nro;
        
        nro = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor que você queira saber o fatorial: "));
        if (nro < 0) {
            System.out.println("Valor inválido para o cálculo de fatorial, o valor precisa ser maior ou igual a zero");
        }else {
            f = fat(nro); // chamada da funcao recursiva
            System.out.println("O fatorial de "+ nro + " é " + f);
        }
        System.exit(0);
    }
}
