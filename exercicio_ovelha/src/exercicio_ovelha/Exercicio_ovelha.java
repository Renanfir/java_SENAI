
package exercicio_ovelha;

import java.util.Scanner;


public class Exercicio_ovelha {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        //Declarando variáveis
        int[][] ovelhas = new int[3][3];
        int escolha;
        int quantidade;

        //Tabela escolhas
        System.out.println("------------");
        System.out.println("|  Ovelhas |");
        System.out.println("|1 - BRANCA|");
        System.out.println("|2 - PARDA |");
        System.out.println("|3 - NEGRA |");
        System.out.println("------------");

        boolean bol = true;

        //Loop até usuário escolher saida
        while (bol){
            //Entrada dos dados
            System.out.print("Diga o numero da sua ovelha: ");
            escolha = sc.nextInt();

            System.out.print("Diga a quantidade: ");
            quantidade = sc.nextInt();

            //Filtro de ovelhas
            switch (escolha) {
                case 1 -> {
                    ovelhas[0][0] += quantidade;
                    ovelhas[0][1] += 2000 * ovelhas[0][0];
                    ovelhas[0][2] += 120 * ovelhas[0][0];
                }
                case 2 -> {
                    ovelhas[1][0] += quantidade;
                    ovelhas[1][1] += 2600 * ovelhas[1][0];
                    ovelhas[1][2] += 180 * ovelhas[1][0];
                }
                case 3 -> {
                    ovelhas[2][0] += quantidade;
                    ovelhas[2][1] += 2400 * ovelhas[2][0];
                    ovelhas[2][2] += 150 * ovelhas[2][0];
                }
                case 4 -> bol = false;
            }

        }
        //Saída
        System.out.println();
        System.out.println("Total ovelhas brancas: "+ovelhas[0][0]);
        System.out.println("Preço rebanho branco: "+ovelhas[0][1]);
        System.out.println("Peso rebalho branco: "+ovelhas[0][2]);
        System.out.println();
        System.out.println("Total ovelhas pardas: "+ovelhas[1][0]);
        System.out.println("Preço rebanho pardo: "+ovelhas[1][1]);
        System.out.println("Peso rebalho pardo: "+ovelhas[1][2]);
        System.out.println();
        System.out.println("Total ovelhas negras: "+ovelhas[2][0]);
        System.out.println("Preço rebanho negro: "+ovelhas[2][1]);
        System.out.println("Peso rebalho negro: "+ovelhas[2][2]);





    }
}
