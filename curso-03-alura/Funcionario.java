public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario() {

    }

    public abstract double getBonificacao();

    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getToString() {
        return  "Nome = " + this.nome + "\n" +
                "CPF = " + this.cpf + "\n" +
                "Salario = " + this.salario + "\n";
               // "Bonificação = " + this.getBonificacao() + "\n";
    }

}