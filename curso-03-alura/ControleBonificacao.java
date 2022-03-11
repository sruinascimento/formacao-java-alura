public class ControleBonificacao {
    
    private double bonificacao = 0;

    public void registra(Funcionario g1) {
        this.bonificacao += g1.getBonificacao();
    }

    public double getBonificacao() {
        return this.bonificacao;
    }
}
