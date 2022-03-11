public class Cliente {
    private String nome;
    private String cpf;
    private String profissao;

    public Cliente(String nome, String cpf, String profissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getProfissao() {
        return this.profissao;
    }
}
