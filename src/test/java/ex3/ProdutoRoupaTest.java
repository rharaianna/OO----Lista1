package ex3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoRoupaTest {

    @Test
    void nomeia() {
        ProdutoRoupa produto = new ProdutoRoupa();
        produto.setNome("Produto Roupa");
        assertEquals("Produto Roupa", produto.getNome());
    }

    @Test
    void precoBaseValido() {
        ProdutoRoupa produto = new ProdutoRoupa();
        produto.setPrecoBase(5.0);
        assertEquals(5.0, produto.getPrecoBase());
    }

    @Test
    void precoBaseInvalido() {
        try {
            ProdutoRoupa produto = new ProdutoRoupa();
            produto.setPrecoBase(-5.0);
        }
        catch (Exception e) {
            assertEquals("preco base invalido", e.getMessage());
        }
    }

    @Test
    void calculaPreco() {
        ProdutoRoupa produto = new ProdutoRoupa();
        produto.setPrecoBase(10.0);
        assertEquals(8,produto.calcularPreco());
    }

}