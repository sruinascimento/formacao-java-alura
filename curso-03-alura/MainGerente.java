

public class MainGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();

        g1.setNome("Rui");
        g1.setSalario(5000);

        Funcionario f1 = new Funcionario();
        f1.setSalario(1000);

        EditorDeVideo ev1 = new EditorDeVideo();
        ev1.setSalario(1000);
        /* System.out.println("Gerente: ");
        System.out.println(g1.getToString());
        System.out.println(g1.getBonificacao());
        System.out.println("Salario com Bonificacao: RS " + g1.getSalarioComBonificacao());

        String autenticado = g1.autentica(0) ? "Sim": "Não";
        System.out.println(autenticado); */

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(f1);
        controle.registra(ev1);

        System.out.println(controle.getBonificacao());

    }
}
