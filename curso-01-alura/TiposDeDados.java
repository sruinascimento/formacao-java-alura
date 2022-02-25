import java.lang.ProcessBuilder.Redirect.Type;

public class TiposDeDados {
    public static void main(String[] args) {

        //Tipo inteiro
        int idade = 25;
        System.out.println("Sua idade é: " + idade);


        //Tipo double
        double salario = 1800;
        System.out.println("Seu salário é: " + salario);

        //Tipo String

        String nome = "Rui";
        System.out.println("Seu nome é: " + nome);

        //verificando o tipo de dado
        System.out.println("var nome é do tipo: " + nome.getClass().getSimpleName());

        //tipo boolean
        boolean isOn = false;

        System.out.println("isOn? " + isOn);

        //tipo long
        long numeroLongo = 1231241241242412412L;
        System.out.println(numeroLongo);

        //tipo short 
        short numeroPequeno = 12345;
        System.out.println(numeroPequeno);

        //tipo byte 
        byte numeroByte = 127;
        System.out.println(numeroByte);

    }
}
