package ex5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoRoupaTest {

    @Test
    void testNome() {
        ProdutoRoupa roupa = new ProdutoRoupa();
        roupa.setNome("Roupa");
        assertEquals("Roupa", roupa.getNome());
    }

    @Test
    void testPrecoUnitarioValido(){
        ProdutoRoupa roupa = new ProdutoRoupa();
        roupa.setPrecoUnitario(5.0);
        assertEquals(5.0, roupa.getPrecoUnitario());
    }

    @Test
    void testPrecoUnitarioInvalido(){
        try {
            ProdutoRoupa roupa = new ProdutoRoupa();
            roupa.setPrecoUnitario(-5.0);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Preco invalido", e.getMessage());
        }
    }

    @Test
    void testQuantidadeEstoqueValido(){
        ProdutoRoupa roupa = new ProdutoRoupa();
        roupa.setQuantidadeEstoque(5);
        assertEquals(5, roupa.getQuantidadeEstoque());
    }

    @Test
    void testQuantidadeEstoqueInvalido(){
        try {
            ProdutoRoupa roupa = new ProdutoRoupa();
            roupa.setQuantidadeEstoque(-1);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Quantidade invalido", e.getMessage());
        }
    }

    @Test
    void vendaValido(){
        ProdutoRoupa roupa = new ProdutoRoupa();
        roupa.setQuantidadeEstoque(5);
        roupa.vender(3);
        assertEquals(2, roupa.getQuantidadeEstoque());
    }

    @Test
    void vendaInvalido(){
        try {
            ProdutoRoupa roupa = new ProdutoRoupa();
            roupa.setQuantidadeEstoque(5);
            roupa.vender(6);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Quantidade invalido", e.getMessage());
        }
    }

    @Test
    void calcularPreco(){
        ProdutoRoupa roupa = new ProdutoRoupa();
        roupa.setPrecoUnitario(10);
        roupa.setQuantidadeEstoque(100);
        roupa.setPossivelDesconto(0.1);
        assertEquals(90,roupa.calcularPreco(10));
    }

    @Test
    void calcularPrecoInvalidoMenor0(){
        try {
            ProdutoRoupa roupa = new ProdutoRoupa();
            roupa.setPrecoUnitario(10);
            roupa.setQuantidadeEstoque(100);
            roupa.setPossivelDesconto(0.1);
            roupa.calcularPreco(-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Quantidade Comprada invalida", e.getMessage());
        }
    }

    @Test
    void calcularPrecoInvalidoNaoInteiro(){
        try {
            ProdutoRoupa roupa = new ProdutoRoupa();
            roupa.setPrecoUnitario(10);
            roupa.setQuantidadeEstoque(100);
            roupa.setPossivelDesconto(0.1);
            roupa.calcularPreco(0.5);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Quantidade Comprada invalida", e.getMessage());
        }
    }

    @Test
    void testDescontoValido(){
        ProdutoRoupa roupa = new ProdutoRoupa();
        roupa.setPossivelDesconto(0.9);
        assertEquals(0.9,roupa.getPossivelDesconto());
    }

    @Test
    void testDescontoInvalido(){
        try {
            ProdutoRoupa roupa = new ProdutoRoupa();
            roupa.setPossivelDesconto(-0.9);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Desconto invalido", e.getMessage());
        }
    }


}