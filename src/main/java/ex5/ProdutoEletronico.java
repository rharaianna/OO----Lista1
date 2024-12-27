package ex5;

public class ProdutoEletronico extends Produto {



    @Override
    public double calcularPreco(double quantidadeComprada) {
        if(quantidadeComprada < 0 || quantidadeComprada%1 !=0){
            throw new IllegalArgumentException("Quantidade Comprada invalida");
        }
        return getPrecoUnitario() * quantidadeComprada;
    }
}
