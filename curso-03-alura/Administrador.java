public class Administrador extends Funcionario implements Autenticavel {
    
    private AutenticacaoUtil autenticador;

    public Administrador() {
        this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public double getBonificacao() {
        return 0.1;
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
