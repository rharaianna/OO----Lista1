package ex5;

public class ProdutoAlimento extends Produto{



    @Override
    public double calcularPreco(double quantidadeComprada) {
        if(quantidadeComprada<0){
            throw new IllegalArgumentException("Quantidade Comprada invalida");
        }
        return getPrecoUnitario() * quantidadeComprada;
    }
}
