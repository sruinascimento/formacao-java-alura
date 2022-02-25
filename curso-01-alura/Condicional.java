
public class Condicional {
    public static void main(String[] args) {
        int idade = 126;

        if (idade >= 18 && idade <= 125) {
            System.out.println("Maior de idade");
        } else if (idade > 0 && idade < 18) {
            System.out.println("Menor de idade");
        } else if (idade > 125) {
            System.out.println("Parabéns ser humano mais velho do mundo");
        } else {
            System.out.println("idade inválida");
        }
        
        //if ternário
        float salario = 1800;
        boolean ehDiretor = false;
        float bonus = ehDiretor ? salario * 2 : salario + 100;
        System.out.println("Salario RS  " + bonus);       
        
        
        //comando switch

        String opcao = "";

        switch (opcao) {
            case "sair":
                System.out.println("SAINDO....");
                break;
            default:
                System.out.println("PADRÃO");
        } 
    }
}
