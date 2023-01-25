public class TesteContas {
    public static void main(String[] args) {//Reutilização de código.
        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100);
        //Todas funções são utilizadas: agencia, numero, transfere, deposita, consulta e etc.

        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(200);

        //Função polimorfismo. transfere 
        cc.transfere(10, cp);

        System.out.println("CC: "+ cc.getSaldo());
        System.out.println("CP: "+ cp.getSaldo());
    }
}
