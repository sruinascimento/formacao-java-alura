public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int totalDeContas;

    public Conta(int agencia, int numero, Cliente titular) {
        this.saldo = 0;
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
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

    public static int getTotalDeContas() {
        return Conta.totalDeContas;
    }

    public boolean depositar(double valorDepositado) {
        if (valorDepositado <= 0)   return false;
        this.saldo += valorDepositado;
        return true;
    }

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