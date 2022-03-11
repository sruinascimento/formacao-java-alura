
public class ContaCorrente extends Conta {


    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public boolean sacar(double valorASerSacado) {
        double valorASerSacadoComTaxa = valorASerSacado + 0.10;
        return super.sacar(valorASerSacadoComTaxa);
    }

    @Override
    public boolean depositar(double valorDepositado) {
            if (valorDepositado <= 0)   return false;
            super.saldo += valorDepositado;
            return true;
    }
    
}
