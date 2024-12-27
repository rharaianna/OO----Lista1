package ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    @Test
    void raioMenorIgualZero(){
        try {
            Circulo circulo = new Circulo();
            circulo.setRaio(0);
        }
        catch (Exception e) {
            assertEquals("raio negativo", e.getMessage());
        }
    }

    @Test
    void raioMaiorZero(){
        Circulo circulo = new Circulo();
        circulo.setRaio(1);
        assertEquals(1, circulo.getRaio());
    }

    @Test
    void testAreaCirculo() {
        Circulo circulo = new Circulo();
        circulo.setRaio(5);
        assertEquals(Math.PI * Math.pow(circulo.getRaio(),2),circulo.calcularArea());
    }

}