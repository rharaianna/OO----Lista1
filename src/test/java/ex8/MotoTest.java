package ex8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotoTest {

    @Test
    void testMarca() {
        Moto moto = new Moto();
        moto.setMarca("BMW");
        assertEquals("BMW", moto.getMarca());
    }

    @Test
    void testModelo() {
        Moto moto = new Moto();
        moto.setModelo("Drive 30");
        assertEquals("Drive 30", moto.getModelo());
    }

    @Test
    void testPrecoValido(){
        Moto moto = new Moto();
        moto.setPreco(1);
        assertEquals(1, moto.getPreco());
    }

    @Test
    void testPrecoInvalido(){
        try {
            Moto moto = new Moto();
            moto.setPreco(0);
            fail();
        }
        catch (Exception e) {
            assertEquals("Preco invalido", e.getMessage());
        }
    }

    @Test
    void testCalcularCusto(){
        Moto moto = new Moto();
        moto.setPreco(10);
        assertEquals(30, moto.calcularCusto());
    }

}