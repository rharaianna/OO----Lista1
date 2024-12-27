package ex4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VooInternacionalTest {

    @Test
    void calcularPreco() {
        Voo voo = new VooInternacional();
        voo.setOrigem("Nova York");
        voo.setDestino("Londres");
        voo.setData("10/10/2025");
        double precoEsperado = voo.getDistancia() * 3; // Preço internacional = distância * 3
        assertEquals(precoEsperado, voo.calcularPreco(), 0.1);
    }

    @Test
    void dataInvalida() {
        try {
            Voo voo = new VooInternacional();
            voo.setOrigem("Nova York");
            voo.setDestino("Londres");
            voo.setData("10/10/2015");
        } catch (Exception e) {
            assertEquals("So temos voo de 2025 em diante", e.getMessage());
        }
    }

    @Test
    void dataInvalidaFormato() {
        try {
            Voo voo = new VooInternacional();
            voo.setOrigem("Nova York");
            voo.setDestino("Londres");
            voo.setData("10102025");
        } catch (Exception e) {
            assertEquals("formato invalido", e.getMessage());
        }
    }

    @Test
    void origemInvalida() {
        try {
            Voo voo = new VooInternacional();
            voo.setOrigem("aaaaaaaaaaaa");
            voo.setDestino("Londres");
            voo.setData("10/10/2025");
        } catch (Exception e) {
            assertEquals("Origem invalido", e.getMessage());
        }
    }

    @Test
    void destinoInvalido() {
        try {
            Voo voo = new VooInternacional();
            voo.setOrigem("Nova York");
            voo.setDestino("aaaaaaaa");
            voo.setData("10/10/2025");
        } catch (Exception e) {
            assertEquals("Destino invalido", e.getMessage());
        }
    }

    @Test
    void distanciaZero() {
        try {
            Voo voo = new VooInternacional();
            voo.setOrigem("Londres");
            voo.setDestino("Londres");
            voo.setData("10/10/2025");
        } catch (Exception e) {
            assertEquals("distancia 0", e.getMessage());
        }
    }

    @Test
    void tipoViagemInternacional() {
        Voo voo = new VooInternacional();
        voo.setOrigem("Nova York");
        voo.setDestino("Londres");
        voo.setData("10/10/2025");
        assertFalse(voo.getTipoViagem());
    }
}
