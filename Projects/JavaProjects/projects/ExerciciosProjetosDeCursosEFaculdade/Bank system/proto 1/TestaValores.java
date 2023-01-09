package PrototypeBankSystem;
public class TestaValores {
	public static void main(String[] args) {
		//int total = 0; função local
		Conta conta = new Conta(1337, 24226);
		//total++ função local
		conta.setAgencia(-50);
		conta.setNumero(-330);
		
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(1234567);

		Conta conta2 = new Conta(1337, 24225);
		
		System.out.println(Conta.getTotal());

	}
}
