public abstract class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int totalDeContas;

    public Conta(int agencia, int numero) {
        this.saldo = 0;
        this.agencia = agencia;
        this.numero = numero;
        Conta.totalDeContas++;
    }

    public String getToString() {
        return  "Agencia: " + this.agencia + "\n" +
                "Numero: " + this.numero + "\n" + 
                "Titular: " + this.titular.getNome() + "\n" +
                "Saldo RS: " + this.saldo + "\n";
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public static int getTotalDeContas() {
        return Conta.totalDeContas;
    }

    public abstract boolean depositar(double valorDepositado);
    
    public boolean sacar(double valorASerSacado) {
        if (!this.temSaldo(valorASerSacado)) return false;
        this.saldo -= valorASerSacado;
        return true;
    }

    private boolean temSaldo(double valor) {
        return valor <=  this.saldo;
    }

    public boolean transferir(double valorASerTransferido, Conta contaDestino) {
        if(!this.sacar(valorASerTransferido)) return false;     
        contaDestino.depositar(valorASerTransferido);
        return true;
    }

}