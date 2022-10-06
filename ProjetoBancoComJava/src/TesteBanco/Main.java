package TesteBanco;

public class Main {
    public static void main(String[] args) {
        Cliente Djeymison = new Cliente();
        Djeymison.setNome("Djeymison");

        Conta cc = new ContaCorrente(Djeymison);
        cc.depositar(100);
        Conta cp = new ContaPoupanca(Djeymison);
        cc.transferir(50, cp);


        cc.ImprimirExtrato();
        cp.ImprimirExtrato();
    }
}
