public class Comprador implements Autenticavel {
    
    private int senha;

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autenticar(int senha) {
        return this.senha == senha;
    }
    
}
