public class MainFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Rui");
        funcionario1.setCpf("04598765412");
        funcionario1.setSalario(1500);
        System.out.println(funcionario1.getToString());
    }
}
