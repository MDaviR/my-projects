public class ContaCorrente extends Conta { //Herança pega os atributos da classe, não os construtores. Faça um novo construtor.

    public ContaCorrente(int agencia, int numero){      //Invocando construtor de uma outra classe. super();
        super(agencia, numero);
                //Agora vai executar o construtor da super classe.
    }
        

        @Override       //Override é anotação na configuração java.
        public boolean saca(double valor) {     //Sobre escrevendo um metodo.
            double valorASacar = valor + 0.20;
            return super.saca(valorASacar); 
        }

    }
