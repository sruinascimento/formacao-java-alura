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

        System.out.println("Conta criada!");
    }

    public String getToString() {
        return  "Agencia: " + this.agencia + "\n" +
                "Numero: " + this.numero + "\n" + 
                "Titular: " + this.titular + "\n" +
                "Saldo RS: " + this.saldo + "\n";
    }


}