import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();
        double opcao;

        String operacao;
        double result_soma = 0;
        double result_sub = 0;
        double result_divid = 0;
        double result_multip = 0;


        while (true) {
            System.out.print("Digite um numero ou 0 para sair: ");
            opcao = sc.nextDouble();

            if (opcao != 0){
                numeros.add(opcao);
            }

            else{

                System.out.println("Digite a sua operação(mais, menos, divide, multiplica)");
                operacao = sc.nextLine();

                switch (operacao) {

                    case "mais":
                        for (double numero : numeros) {
                            result_soma += numero;
                            System.out.println("O resultado da soma do seus numero é de "+result_soma);
                            break;
                        }


                    case "menos":
                        for (double numero : numeros) {
                            result_sub += numero;
                            System.out.println("O resultado da subtração do seus numero é de "+result_sub);
                            break;
                        }


                    case "divide":
                        for (double numero : numeros) {
                            result_divid += numero;
                            System.out.println("O resultado da divisão do seus numero é de "+result_divid);
                            break;
                        }


                    case "multiplica":
                        for (double numero : numeros) {
                            result_multip += numero;
                            System.out.println("O resultado da multiplica do seus numero é de "+result_multip);
                            break;
                        }
                }
            }
        }
    }
}

    }
}