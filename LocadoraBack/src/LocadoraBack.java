import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class LocadoraBack {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        Automovel a2 = new Automovel();
        a2.setCodVeiculo(1);
        a2.setMarcaVeiculo("Ford");
        a2.setModeloVeiculo("Escort");
        a2.setPlacaVeiculo("MDD - 7158");
        a2.setLocado(true);
        a2.setPotenciaHP(900);
        a2.setQtdPassageiros(5);
        a2.imprimirDadosVeiculo();

        if (a2.abastecerVeiculo(150, "Gasolina aditivada", 6.99f)){
            System.out.println("Abastecimento efetuado");
        }else
            System.out.println("Explodiu tudo");

    }
}

