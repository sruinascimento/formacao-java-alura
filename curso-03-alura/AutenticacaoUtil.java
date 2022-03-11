public class AutenticacaoUtil {
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getSenha() {
        return this.senha;
    }

    public boolean autenticar(int senha) {
        return this.senha == senha;

    }
}