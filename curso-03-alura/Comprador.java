public class Comprador implements Autenticavel {
    
    private AutenticacaoUtil autenticador;


    public Comprador() {
        this.autenticador = new AutenticacaoUtil();
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
