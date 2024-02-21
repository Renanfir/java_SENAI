import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] ovelhas = new int[3][3];

        int escolha;

        System.out.println("------------");
        System.out.println("|  Ovelhas |");
        System.out.println("|1 - BRANCA|");
        System.out.println("|2 - PARDA |");
        System.out.println("|3 - NEGRA |");
        System.out.println("------------");

        boolean bol = true;

        while (bol){
            System.out.print("Diga o numero da sua ovelha: ");
            escolha = sc.nextInt();

            switch (escolha) {
                case 1 -> {
                    ovelhas[0][0] += 1;
                    ovelhas[0][1] += 2000;
                    ovelhas[0][2] += 120;
                }
                case 2 -> {
                    ovelhas[1][0] += 1;
                    ovelhas[1][1] += 2600;
                    ovelhas[1][2] += 180;
                }
                case 3 -> {
                    ovelhas[2][0] += 1;
                    ovelhas[2][1] += 2400;
                    ovelhas[2][2] += 150;
                }
                case 4 -> bol = false;
            }

        }
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
