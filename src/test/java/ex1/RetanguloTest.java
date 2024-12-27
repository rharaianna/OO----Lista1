package ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {

    @Test
    void larguraMenorIgualZero(){
        try {
            Retangulo retangulo = new Retangulo();
            retangulo.setLargura(0);
        }
        catch (Exception e) {
            assertEquals("Largura deve ser maior que zero", e.getMessage());
        }
    }

    @Test
    void larguraMaiorZero(){
        Retangulo retangulo = new Retangulo();
        retangulo.setLargura(1);
        assertEquals(1, retangulo.getLargura());
    }

    @Test
    void alturaMenorIgualZero(){
        try {
            Retangulo retangulo = new Retangulo();
            retangulo.setAltura(0);
        }
        catch (Exception e) {
            assertEquals("Altura deve ser maior que zero", e.getMessage());
        }
    }

    @Test
    void alturaMaiorZero(){
        Retangulo retangulo = new Retangulo();
        retangulo.setAltura(1);
        assertEquals(1, retangulo.getAltura());
    }

    @Test
    void calculaArea(){
        Retangulo retangulo = new Retangulo();
        retangulo.setLargura(5);
        retangulo.setAltura(3);
        assertEquals(15,retangulo.calcularArea());
    }

    @Test
    void calculaPerimetro(){
        Retangulo retangulo = new Retangulo();
        retangulo.setLargura(5);
        retangulo.setAltura(3);
        assertEquals(16,retangulo.calcularPerimetro());
    }

}