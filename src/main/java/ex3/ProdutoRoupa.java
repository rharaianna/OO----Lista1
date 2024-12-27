package ex3;

public class ProdutoRoupa extends Produto {
    @Override
    public double calcularPreco() {
        return getPrecoBase() - (0.2 * getPrecoBase());
    }
}
