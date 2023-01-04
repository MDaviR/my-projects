package ArrayJoptionPane;
import javax.swing.JOptionPane;
public class java {

	public static void main(String[] args) {
		int array[] = new int [10];
		int larger;
		for(int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(JOptionPane.showInputDialog(
					"Enter a value for the position "+ (i)+":"));
		}
		String saida = "The array have 10 position: \n";
		larger = array[0];
		for(int i =0; i < array.length; i ++) {
			saida+=array[i] + " ";
			if (array[i] > larger) {
				larger = array [i];
			}
		}

		saida+="\nThe large number is: "+ larger;
		JOptionPane.showMessageDialog(null, saida);
        
	}
    
}
