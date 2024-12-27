package ex4;

public class VooInternacional extends Voo{

    private double taxaConversao;

    public double getTaxaConversao() {
        return taxaConversao;
    }

    public void setTaxaConversao(double taxaConversao) {
        if (taxaConversao < 0){
            throw new IllegalArgumentException("Taxa invalido");
        }
        this.taxaConversao = taxaConversao;
    }


    @Override
    public double calcularPreco() {
        return getDistancia()*getPrecoEspecifico() + getTaxaConversao();
    }
}
