package ex8;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private double preco;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= 0){
            throw new IllegalArgumentException("Preco invalido");
        }
        this.preco = preco;
    }

    public abstract double calcularCusto();

}
