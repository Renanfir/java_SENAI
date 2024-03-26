public class Automovel extends Veiculo {
    private int potenciaHP;
    private int qtdPassageiros;

    public void imprimirDadosVeiculo(){
        System.out.println("Codigo..........: " + this.getCodVeiculo());
        System.out.println("Marca...........: " + this.getMarcaVeiculo());
        System.out.println("Modelo..........: " + this.getModeloVeiculo());
        var locado = 'N';

        if (this.isLocado()){
            locado = 'S';
        }
        System.out.println("Locado?(S/N)....: " + locado);
        System.out.println("Potencia .......: " + this.getPotenciaHP() + "HP");
        System.out.println("Qtd.Passageiros.: " + this.getQtdPassageiros());

    }


    public int getPotenciaHP() {
        return potenciaHP;
    }

    public void setPotenciaHP(int potenciaHP) {
        this.potenciaHP = potenciaHP;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    @Override
    public boolean abastecerVeiculo (int qtdLitros,
                                     String tipoCombust,
                                     Float precoComb){

        float vlrAbastecimento = 0;
        vlrAbastecimento = precoComb * qtdLitros;

        if (vlrAbastecimento > 0) {
            return true;
        }
        else
            return false;
    }
}

