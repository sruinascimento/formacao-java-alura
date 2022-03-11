public class Gerente extends Funcionario implements Autenticavel{

    private int senha;

    @Override 
    public double getBonificacao() {
        return super.getSalario() + super.getSalario() * 0.1; 
    }

    public double getSalarioComBonificacao() {
        return super.getSalario() + this.getBonificacao();
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autenticar(int senha) {
        return this.senha == senha;
    }
}
