package ex8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void testMarca() {
        Carro carro = new Carro();
        carro.setMarca("BMW");
        assertEquals("BMW", carro.getMarca());
    }

    @Test
    void testModelo() {
        Carro carro = new Carro();
        carro.setModelo("Drive 30");
        assertEquals("Drive 30", carro.getModelo());
    }

    @Test
    void testPrecoValido(){
        Carro carro = new Carro();
        carro.setPreco(1);
        assertEquals(1, carro.getPreco());
    }

    @Test
    void testPrecoInvalido(){
        try {
            Carro carro = new Carro();
            carro.setPreco(0);
            fail();
        }
        catch (Exception e) {
            assertEquals("Preco invalido", e.getMessage());
        }
    }

    @Test
    void testCalcularCusto(){
        Carro carro = new Carro();
        carro.setPreco(10);
        assertEquals(40, carro.calcularCusto());
    }


}