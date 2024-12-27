package ex8;

public class Bicicleta extends Veiculo{

    @Override
    public double calcularCusto() {
        return getPreco()*2;
    }
}
