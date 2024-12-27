package ex4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VooDomesticoTest {

    @Test
    void calcularPreco() {
        VooDomestico voo = new VooDomestico();
        voo.setOrigem("São Paulo");
        voo.setDestino("Rio de Janeiro");
        double precoEsperado = voo.getDistancia() * 2;
        assertEquals(precoEsperado, voo.calcularPreco(), 0.1);
    }

    @Test
    void dataValida() {
        VooDomestico voo = new VooDomestico();
        voo.setOrigem("São Paulo");
        voo.setDestino("Rio de Janeiro");
        voo.setData("10/10/2025");
        assertEquals(voo.getData(), "10/10/2025");

    }

    @Test
    void dataInvalida() {
        try {
            Voo voo = new VooDomestico();
            voo.setOrigem("São Paulo");
            voo.setDestino("Rio de Janeiro");
            voo.setData("10/10/1010");
        } catch (Exception e) {
            assertEquals("So temos voo de 2025 em diante", e.getMessage());
        }
    }

    @Test
    void dataInvalidaFormato() {
        try {
            Voo voo = new VooDomestico();
            voo.setOrigem("São Paulo");
            voo.setDestino("Rio de Janeiro");
            voo.setData("10101010");
        } catch (Exception e) {
            assertEquals("formato invalido", e.getMessage());
        }
    }

    @Test
    void origemInvalida() {
        try {
            Voo voo = new VooDomestico();
            voo.setOrigem("aaaaaaaa");
            voo.setDestino("Rio de Janeiro");
            voo.setData("10/10/2030");
        } catch (Exception e) {
            assertEquals("Origem invalido", e.getMessage());
        }
    }

    @Test
    void destinoInvalido() {
        try {
            Voo voo = new VooDomestico();
            voo.setOrigem("São Paulo");
            voo.setDestino("aaaaaaaaa");
            voo.setData("10/10/2030");
        } catch (Exception e) {
            assertEquals("Destino invalido", e.getMessage());
        }
    }

    @Test
    void distanciaZero() {
        try {
            Voo voo = new VooDomestico();
            voo.setOrigem("São Paulo");
            voo.setDestino("São Paulo");
            voo.setData("10/10/2030");
        } catch (Exception e) {
            assertEquals("distancia 0", e.getMessage());
        }
    }

    @Test
    void tipoViagemDomestica() {
        Voo voo = new VooDomestico();
        voo.setOrigem("São Paulo");
        voo.setDestino("Rio de Janeiro");
        assertTrue(voo.getTipoViagem());
    }
}
