package br.com.ruicompany.class_string;

public class TestaString {
    public static void main(String[] args) {
        //String nome = new String("Alura");
        String nome = "Alura"; //object literal
       /*  String outroNome = nome.toLowerCase().replace("a", "@");
        System.out.println(outroNome);  */

        //replace passando char para o construtor
        //System.out.println(nome.replace('A', 'a'));

        //Lower e Upper
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());

        //indexOf retorna o número da posição, caso não encontre a posição irá retornar -1
        System.out.println(nome.indexOf('P'));

        //charAt retornar o char na posição passada  no argumento da função
        System.out.println(nome.charAt(4));

        //substring cria uma string a partir da posição passada
        System.out.println(nome.substring(1));

        //length
        System.out.println(nome.length());
        for (int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }

        //isEmpty, verisifica se a string é vazia ""

        String none = " ";
        System.out.println(none.isEmpty());

        // trim serve para remover espações após e depois a palavra
        String nomeRui = "  Rui   ";
        System.out.println(nomeRui.trim());

        //contains serve para verificar se a sequencia de char está na String

        System.out.println(nome.contains("alura"));


    }
}
