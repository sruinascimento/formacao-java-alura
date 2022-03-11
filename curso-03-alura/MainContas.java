public class MainContas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(123124, 876345);
        cc.depositar(50);
        System.out.println(cc.getSaldo());
        ContaPoupanca cp = new ContaPoupanca(345, 1231);
        cp.depositar(123);
        System.out.println(cp.getSaldo());

        cc.transferir(10, cp);
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());

        
    }
}