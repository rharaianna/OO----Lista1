package ex8;

public class Moto extends Veiculo{

    @Override
    public double calcularCusto() {
        return getPreco()*3;
    }

}
