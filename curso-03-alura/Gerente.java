public class Gerente extends Funcionario {
    private int senha;

    public Gerente() {

    }

    public boolean autentica(int senha) {
        return this.senha == senha;
    }

    @Override 
    public double getBonificacao() {
        return super.getSalario() + super.getBonificacao(); 
    }

    public double getSalarioComBonificacao() {
        return super.getSalario() + this.getBonificacao();
    }
}
