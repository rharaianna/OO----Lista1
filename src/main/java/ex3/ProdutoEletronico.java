package ex3;

public class ProdutoEletronico extends Produto {


    @Override
    public double calcularPreco() {
        return getPrecoBase() - (0.1 * getPrecoBase());
    }
}
