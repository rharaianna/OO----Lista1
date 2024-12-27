package ex8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BicicletaTest {
    @Test
    void testMarca() {
        Bicicleta bike = new Bicicleta();
        bike.setMarca("BMW");
        assertEquals("BMW", bike.getMarca());
    }

    @Test
    void testModelo() {
        Bicicleta bike = new Bicicleta();
        bike.setModelo("Drive 30");
        assertEquals("Drive 30", bike.getModelo());
    }

    @Test
    void testPrecoValido(){
        Bicicleta bike = new Bicicleta();
        bike.setPreco(1);
        assertEquals(1, bike.getPreco());
    }

    @Test
    void testPrecoInvalido(){
        try {
            Bicicleta bike = new Bicicleta();
            bike.setPreco(0);
            fail();
        }
        catch (Exception e) {
            assertEquals("Preco invalido", e.getMessage());
        }
    }

    @Test
    void testCalcularCusto(){
        Bicicleta bike = new Bicicleta();
        bike.setPreco(10);
        assertEquals(20, bike.calcularCusto());
    }

}