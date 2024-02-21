package exercicio_imc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio_IMC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nome_pessoa;
        double peso;
        double altura;
        double calculo;
        boolean continuar = true;
        
        Map<String, String> Dados = new HashMap<>();

        while (continuar) {

            System.out.print("Digite seu nome: ");
            nome_pessoa = sc.next();

            System.out.print("Digite seu peso: ");
            peso = sc.nextFloat();

            System.out.print("Digite sua altura: ");
            altura = sc.nextFloat();
            altura = altura * 0.01;

            calculo = peso / (altura * altura);
            calculo = Math.round(calculo);

            if (calculo <= 18.5) {
                Dados.put(nome_pessoa, "Abaixo do normal");

            } else if (calculo >= 18.5 && calculo <= 24.9) {
                Dados.put(nome_pessoa, "Normal");

            } else if (calculo >= 25 && calculo <= 29.9) {
                Dados.put(nome_pessoa, "Sobrepeso");

            } else if (calculo >= 30 && calculo <= 34.9) {
                Dados.put(nome_pessoa, "Obesidade grau 1");

            } else if (calculo >= 35 && calculo <= 39.9) {
                Dados.put(nome_pessoa, "Obesidade grau 2");

            } else {
                Dados.put(nome_pessoa, "Obesidade grau 3");
            }

            System.out.print("Você quer continuar? (Digite 's' para sim, 'n' para não): ");
            String resposta = sc.next();

            if (resposta.equalsIgnoreCase("n")) {
                for (String key : Dados.keySet()) {
                    String value = Dados.get(key);
                    System.out.println(key + ": " + value);
                }
                continuar = false;
            }

        }
    }
}
