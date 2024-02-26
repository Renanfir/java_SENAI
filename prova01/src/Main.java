import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Instanciando Scanner
        Scanner sc = new Scanner(System.in);

        //Declaração das variaveis
        float preco;
        double desconto;
        char verifica;
        boolean boleano = true;


        //loop com enquanto o preço for maior que 0, se for 0 sai do programa
        while (boleano) {

            //Entrada
            System.out.print("Digite o valor do produto ou 0 para sair: ");
            preco = sc.nextFloat();

            if (preco >= 0) {

                //Faz os calculos de descontos e saídas
                if (preco >= 100) {
                    desconto = preco - (preco * 0.15);
                    System.out.println("O valor final do seu produto é de: " + desconto);

                } else if (preco < 100 && preco >= 50) {
                    desconto = preco - (preco * 0.10);
                    System.out.println("O valor final do seu produto é de: " + desconto);

                } else if (preco < 50 && preco > 0) {
                    System.out.println("O valor final do seu produto é de: " + preco);

                } else {
                    boleano = false;
                    System.out.println("Saiu do programa!");
                }

            }
            else {
                System.out.println("Número inválido");
            }
        }
    }
}