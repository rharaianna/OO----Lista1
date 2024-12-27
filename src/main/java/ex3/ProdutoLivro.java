package ex3;

public class ProdutoLivro extends Produto {

    @Override
    public double calcularPreco() {
        return getPrecoBase() - (0.05 * getPrecoBase());
    }
}
