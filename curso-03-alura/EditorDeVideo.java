public class EditorDeVideo extends Funcionario {
    
    @Override
    public double getBonificacao() {
        return super.getSalario() * 0.07;
    }

}
