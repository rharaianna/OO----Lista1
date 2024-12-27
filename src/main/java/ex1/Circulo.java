package ex1;

public class Circulo extends FormaGeometrica{
    public double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (raio <= 0){
            throw new IllegalArgumentException("raio negativo");
        }
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

}

