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

        int [][] matriz = {{10, 60}, {30, 12}};
        System.out.println(matriz.length);
    
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                System.out.println(matriz[i][j]);   
            }
            System.out.println();
        }


        System.out.println("**** Triangulo de números ****");
        for (int linha = 0; linha < 10; linha++) {
            for (int coluna = 0; coluna < 10; coluna++) {
                if (coluna > linha) break;
                System.out.print(coluna+1);
            }
            System.out.println();
        }

        System.out.println("Múltiplos de 3");
        for (int linha = 1; linha < 101; linha++) {
            if (linha % 3 == 0) System.out.println(linha);
        }

    }
    
}
