public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    String titular;

    public Conta(int agencia, int numero, String titular) {
        this.saldo = 0;
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
    }

    public String getToString() {
        return  "Agencia: " + this.agencia + "\n" +
                "Numero: " + this.numero + "\n" + 
                "Titular: " + this.titular + "\n" +
                "Saldo RS: " + this.saldo + "\n";
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
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