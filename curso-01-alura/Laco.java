public class Laco {
    public static void main(String[] args) {
        // laço for
        System.out.println(">>>>> Contador FOR >>>>>");
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }

        //while
        System.out.println(">>>>> Contador WHILE >>>>>");
        int contador = 0;
        while (contador < 10) {
            System.out.println(contador);
            contador++;
        }

        //while
        System.out.println(">>>>> Contador DOWHILE >>>>>");
        int contador2 = 10;
        do {
            System.out.println(contador2);
        } while (contador2 < 10);


        //somatorio

        int soma = 0;
        int c = 1;
        while (c < 101) {
            soma += c;
            c++;
        }

        System.err.println("Somatorio: " + soma);

    }
    
}
