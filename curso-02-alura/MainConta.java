public class MainConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta(123, 5551, "Rui");
        //Conta conta2 = conta1;
        conta1.setSaldo(1500);
        //System.out.println(conta1.getToString());
        //System.out.println(conta2.getToString());

        Conta conta2 = new Conta(124, 5552, "Nara");
        //conta1.depositar(124);
        //String resultadoDoDeposito =  conta2.depositar(124)? "Deposito realizado com sucesso": "Falha ao realizar deposito" ;
        //System.out.println(resultadoDoDeposito);
        //System.out.println(conta2.getToString());

        System.out.println(conta1.sacar(100));

        conta1.transferir(1000, conta2);
        //conta1.transferir(1500, conta2);
        

        System.out.println(conta1.getToString());
        System.out.println(conta2.getToString());
    }
}