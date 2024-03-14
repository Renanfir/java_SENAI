/*
Enunciado:  Um avião tem 12 lugares com duas filas de poltronas à esquerda e duas à direita.
Fazer a reserva de poltronas;
Listar os lugares ocupados;
Listar os lugares livres e
Mostrar o percentual de ocupação da aeronave.
 */


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declaração de variáveis
        Scanner sc = new Scanner(System.in);
        String[][] lugares = new String[3][4];
        String[][] situacao = new String[3][4];

        boolean loop = true;

        String escolhaReserva;
        ArrayList<String> lugaresReservados = new ArrayList<>();

        int escolha;
        double numOcupados = 0;

        //Preenchimento da matriz de lugare com seus respectivos numeros
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                lugares[i][j] = "L" + i + j;
            }
        }

        //Preenchimento das situações (000 para livre e XXX para ocupado)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                situacao[i][j] = "000";
            }
        }

        //Loop para utilizar as opções em seguida uma da outra
        while (loop) {

            //Amostra das opções disponíveis para a seleção
            System.out.println("--------------------------------------");
            System.out.println("|1 - Fazer reserva de lugares        |");
            System.out.println("|2 - Listar lugares livres e ocupados|");
            System.out.println("|3 - Mostrar percentual de ocupação  |");
            System.out.println("|4 - Sair do programa                |");
            System.out.println("--------------------------------------");
            System.out.println();

            //Caixa de escolja 1,2 ou 3
            System.out.print("Escolha: ");
            escolha = sc.nextInt();

            //Filtro de escolha
            switch (escolha) {

                //Caso a escolha seja 1 será apresentado a caixa de seleção de
                // lugares, com verificação de ocupação
                case 1 -> {
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 4; j++) {
                            System.out.print(lugares[i][j] + " ");

                        }
                        System.out.println();

                    }

                    //loop infinito para verificar se o lugar que o usuário digitou
                    //já está ocupado
                    while (true) {
                        System.out.println();
                        System.out.print("Digite o lugar para reservar: ");
                        escolhaReserva = sc.next().toUpperCase();

                        //Se o lugar ja estiver ocupado o loop faz com que ele volte na cixa de seleção
                        if (lugaresReservados.contains(escolhaReserva)) {
                            System.out.println("Este lugar já está ocupado. Escolha outro lugar.");

                        //Senão o lugar é reservado e asituação do lugar se torna XXX
                        } else {
                            for (int i = 0; i < 3; i++) {
                                for (int j = 0; j < 4; j++) {
                                    if (escolhaReserva.contains(lugares[i][j])) {
                                        situacao[i][j] = "XXX";
                                    }
                                }
                            }
                            lugaresReservados.add(escolhaReserva);
                            System.out.println("Lugar reservado com sucesso.");
                            break;

                        }
                    }
                }

                //Usando a matriz de situação faz-se a verificação e printa os lugares livres e ocupados
                case 2 -> {
                    System.out.println("LIVRES");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 4; j++) {
                            if (situacao[i][j].equals("000")) {
                                System.out.println(lugares[i][j]);
                            }
                        }
                    }
                    System.out.println("OCUPADOS");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 4; j++) {
                            if (situacao[i][j].equals("XXX")) {
                                System.out.println(lugares[i][j]);
                            }
                        }
                    }
                }

                //Verifica quantos lugares ocupados e divide por 12 encontrando a porcentagem de lugares livres
                case 3 -> {
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 4; j++) {
                            if(situacao[i][j].equals("XXX")) {
                                numOcupados += 1;
                            }
                        }
                    }
                    System.out.println("A porcentagem de lugares ocupados é de: " +(numOcupados/12)*100);
                }
                case 4 -> {
                    System.out.println("Você saiu do programa");
                    loop = false;
                }
            }
        }
    }
}
