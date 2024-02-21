package calculadora_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculadora_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();

        double opcao;

        String operacao;
        double result_soma = 0;
        double result_sub = 0;
        double result_divid = 0;
        double result_multip = 1;

        while (true) {
            System.out.print("Digite um numero ou 0 para sair: ");
            opcao = sc.nextDouble();

            if (opcao != 0) {
                numeros.add(opcao);
            } else {
                System.out.println("Digite a sua operação(+, -, /, *)");
                operacao = sc.next();

                switch (operacao) {

                    case "+":
                        for (double numero : numeros) {
                            result_soma += numero;
                        }
                        System.out.println("O resultado da soma do seus numero é de " + result_soma);
                        break;

                    case "-":
                        for (double numero : numeros) {
                            result_sub -= numero;
                        }
                        System.out.println("O resultado da subtração do seus numeros é de " + result_sub);
                        break;

                    case "/":
                        for (double numero : numeros) {
                            result_divid /= numero;
                        }
                        System.out.println("O resultado da divisão dos seus numeros é de " + result_divid);
                        break;

                    case "*":
                        for (double numero : numeros) {
                            result_multip *= numero;
                        }
                        System.out.println("O resultado da multiplicação dos seus numeros é de " + result_multip);
                        break;

                }

            }
        }
    }
}
