public class Gerente extends Funcionario implements Autenticavel{

    private AutenticacaoUtil autenticador;

    public Gerente() {
        this.autenticador = new AutenticacaoUtil();
    }

    @Override 
    public double getBonificacao() {
        return super.getSalario() + super.getSalario() * 0.1; 
    }

    public double getSalarioComBonificacao() {
        return super.getSalario() + this.getBonificacao();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autenticar(int senha) {
        return this.autenticador.getSenha() == senha;
    }
}
