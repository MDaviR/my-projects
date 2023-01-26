package MateusDavi.faculdadeengexercicios.ordenaçãodedados;

import javax.swing.JOptionPane;

public class RecursãoEmJavaFatorialSemCauda {

    static void fatP(int n, int x, int f) {
        if (x == 0 || x == 1) {
            System.out.println("O fatorial de " + n + " é " + f); // regra 1
        } else {

            // chamada de funcao recursiva
            fatP(n, x - 1, f * x); // regra 2 e 3
        }
    }

    public static void main(String[] args) {
        int nro;

        nro = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor que você deseja saber o fatorial"));
        if (nro < 0) {
            System.out.println("Valor invalido para calculo de fatorial, o valor precisa ser maior ou igual a zero");
            System.exit(0);
        } else {
            fatP(nro, nro, 1); // chamada de funcao recursiva
        }
        System.exit(0);

    }

}
