public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException() {
        super("Saldo Insuficente");
    }

    public SaldoInsuficienteException(String msg) {
        super(msg);
    }
    
}