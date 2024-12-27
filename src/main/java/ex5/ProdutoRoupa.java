package ex5;

public class ProdutoRoupa extends Produto {

    private double possivelDesconto;


    public double getPossivelDesconto() {
        return possivelDesconto;
    }

    public void setPossivelDesconto(double possivelDesconto) {
        if (possivelDesconto >= 1 || possivelDesconto < 0) {
            throw new IllegalArgumentException("Desconto invalido");
        };
        this.possivelDesconto = possivelDesconto;
    }

    @Override
    public double calcularPreco(double quantidadeComprada) {
        if (quantidadeComprada < 0 || quantidadeComprada%1 != 0) {
            throw new IllegalArgumentException("Quantidade Comprada invalida");
        }
        return (quantidadeComprada*getPrecoUnitario())-(quantidadeComprada*getPrecoUnitario()*possivelDesconto);
    }
}
