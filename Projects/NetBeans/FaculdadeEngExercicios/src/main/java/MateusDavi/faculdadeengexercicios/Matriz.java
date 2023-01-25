package MateusDavi.faculdadeengexercicios;

import javax.swing.JOptionPane;

public class Matriz {

    public static void main(String[] args) {
        int MatSoma[][], i, j, soma = 0;
        MatSoma = new int[10][12];

        for(i=0; i<=9; i++){
            for(j=0; j<=11; j++){
                MatSoma[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
                    soma += MatSoma[i][j];
            
            
            }
        }
       System.out.println("A Soma dos 120 valores digitados é: "+ soma);
       System.exit(0);
                
                
    }

}
