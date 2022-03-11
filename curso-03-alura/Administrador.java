public class Administrador extends Funcionario implements Autenticavel {
    
   private int senha;

    @Override
    public double getBonificacao() {
        return 0.1;
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
