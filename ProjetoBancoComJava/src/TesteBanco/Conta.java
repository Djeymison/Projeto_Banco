package TesteBanco;

public abstract class Conta implements IConta{
   // Referente ao metodo de sequencia de criação de conta
    private static final int Agencia_Padrao = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    //Metodo para a sequencia de criação de conta. 
    public Conta(Cliente cliente){
        this.agencia = Conta.Agencia_Padrao;
        this.numero= SEQUENCIAL++;
        this.cliente= cliente;
    }
    
    //Gerando os Getters
    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    //Ações
    @Override
    public void sacar(double valor) {
        // TODO Auto-generated method stub
        saldo -= valor;
    }
    @Override
    public void depositar(double valor) {
        // TODO Auto-generated method stub
        saldo += valor;
    }
    @Override
    public void transferir(double valor, Conta ContaDestino) {
        // TODO Auto-generated method stub
        this.sacar(valor);
        ContaDestino.depositar(valor);
    }

    //Metodos
    protected void ImprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numenro: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }  
    
}
