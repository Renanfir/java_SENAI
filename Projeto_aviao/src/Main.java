/*
Enunciado:  Um avião tem 12 lugares com duas filas de poltronas à esquerda e duas à direita.
Fazer a reserva de poltronas;
Listar os lugares ocupados;
Listar os lugares livres e
Mostrar o percentual de ocupação da aeronave.
 */

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declaração de variáveis
        Scanner sc = new Scanner(System.in);
        String[][] lugares = new String[3][4];
        String[][] situacao = new String[3][4];
        boolean lugar_ocup = true;


        String escolha_reserva;

        int escolha;

        //Preenchimento da matriz de lugare com seus respectivos numeros
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                lugares[i][j] = "L" + i + j;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                situacao[i][j] = "000";
            }
        }


        //Loop para utilizar as opções em seguida uma da outra
        while (true) {

            //Amostra das opções disponíveis para a seleção
            System.out.println("--------------------------------------");
            System.out.println("|1 - Fazer reserva de lugares        |");
            System.out.println("|2 - Listar lugares livres e ocupados|");
            System.out.println("|3 - Mostrar percentual de ocupação  |");
            System.out.println("--------------------------------------");
            System.out.println();
            //Caixa de escolja 1,2 ou 3
            System.out.print("Escolha: ");
            escolha = sc.nextInt();


            //Filtro de escolha
            switch (escolha) {
                case 1 -> {
                    while (lugar_ocup) {
                        System.out.print("Digite um lugar para ser reservado: ");
                        escolha_reserva = sc.next().toUpperCase();

                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 4; j++) {
                                if (escolha_reserva.equals(lugares[i][j]) && situacao[i][j].equals("XXX")) {
                                    lugar_ocup = true;
                                } else if (escolha_reserva.equals(lugares[i][j])) {
                                    situacao[i][j] = "XXX";
                                    System.out.println("Reservado com sucesso!");
                                    lugar_ocup = false;

                                }
                            }
                        }

                    }
                }


                case 2 -> {
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 4; j++) {
                            System.out.print(lugares[i][j] + " ");

                        }
                        System.out.println();

                    }
                }

                case 3 -> System.out.println("3");
            }

        }

    }
}
