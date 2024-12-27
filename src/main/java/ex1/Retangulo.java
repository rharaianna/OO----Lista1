package ex1;

public class Retangulo extends FormaGeometrica{
    private double largura;
    private double altura;

    public double getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        if (largura <= 0){
            throw new IllegalArgumentException("Largura deve ser maior que zero");
        }
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        if (altura <= 0){
            throw new IllegalArgumentException("Altura deve ser maior que zero");
        }
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2*(largura + altura);
    }
}
