package ex8;

public class Carro extends Veiculo {

    @Override
    public double calcularCusto() {
        return getPreco()*3;
    }
}
