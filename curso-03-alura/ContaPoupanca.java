public class ContaPoupanca extends Conta {
    
    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }
    @Override
    public boolean depositar(double valorDepositado) {
        if (valorDepositado <= 0)   return false;
            super.saldo += valorDepositado;
            return true;
    }
}
