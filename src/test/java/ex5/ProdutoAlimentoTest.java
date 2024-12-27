package ex5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoAlimentoTest {

    @Test
    void testNome() {
        ProdutoAlimento comida = new ProdutoAlimento();
        comida.setNome("comida");
        assertEquals("comida", comida.getNome());
    }

    @Test
    void testPrecoUnitarioValido(){
        ProdutoAlimento comida = new ProdutoAlimento();
        comida.setPrecoUnitario(5.0);
        assertEquals(5.0, comida.getPrecoUnitario());
    }

    @Test
    void testPrecoUnitarioInvalido(){
        try {
            ProdutoAlimento comida = new ProdutoAlimento();
            comida.setPrecoUnitario(-5.0);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Preco invalido", e.getMessage());
        }
    }

    @Test
    void testQuantidadeEstoqueValido(){
        ProdutoAlimento comida = new ProdutoAlimento();
        comida.setQuantidadeEstoque(5);
        assertEquals(5, comida.getQuantidadeEstoque());
    }

    @Test
    void testQuantidadeEstoqueInvalido(){
        try {
            ProdutoAlimento comida = new ProdutoAlimento();
            comida.setQuantidadeEstoque(-1);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Quantidade invalido", e.getMessage());
        }
    }

    @Test
    void vendaValido(){
        ProdutoAlimento comida = new ProdutoAlimento();
        comida.setQuantidadeEstoque(5);
        comida.vender(3);
        assertEquals(2, comida.getQuantidadeEstoque());
    }

    @Test
    void vendaInvalido(){
        try {
            ProdutoAlimento comida = new ProdutoAlimento();
            comida.setQuantidadeEstoque(5);
            comida.vender(6);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Quantidade invalido", e.getMessage());
        }
    }

    @Test
    void calcularPreco(){
        ProdutoAlimento comida = new ProdutoAlimento();
        comida.setPrecoUnitario(10);
        comida.setQuantidadeEstoque(100);
        assertEquals(100,comida.calcularPreco(10));
    }

    @Test
    void calcularPrecoInvalidoMenor0(){
        try {
            ProdutoAlimento comida = new ProdutoAlimento();
            comida.setPrecoUnitario(10);
            comida.setQuantidadeEstoque(100);
            comida.calcularPreco(-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Quantidade Comprada invalida", e.getMessage());
        }
    }

}