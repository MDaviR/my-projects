package PrototypeBankSystem;
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	// Por default o java já lhe entrega um construtor ex:Conta conta = new Conta();
	//Inves de criar "Conta conta = new conta();" agora você fará Conta conta = new Conta(agencia e numero).
	// Com um construtor você pode isolar e definir restrições. 
	public Conta (int agencia, int numero) {
		total ++;
		System.out.println("O total de contas é "+ total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Conta criada " + this.numero);
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;

			System.out.println("Saque permitido");
			return true;
		} else {
			System.out.println("Saque não permitido");
			return false;
		}
	}

	// Este metodo foi feito para tira o acesso das pessoas com relação ao saldo.
	// Por motivos de segurança e até mesmo caso um dia o saldo for para em um banco de dados, facilita o transporte.
    // Jeito melhor e seguro é invocar metodos e dentro dele averá funções. 
    // No futuro se quiser fazer manutenção é só mexer nas áreas dos Get e Set. Não vai precisar corre atras de função local.
	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int novoNumero) {
		if (agencia <= 0) {
			System.out.println("Não pode valor menor ou igual a 0");
			return;
		}
		this.numero = novoNumero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int novoAgencia) {
		if (agencia <= 0) {
			System.out.println("Não pode valor menor ou igual a 0");
			return;
		}
		this.agencia = novoAgencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}
	public static int getTotal() {
		return Conta.total;
	}
}

