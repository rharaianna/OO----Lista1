package ex3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoLivroTest {

    @Test
    void nomeia() {
        ProdutoLivro produto = new ProdutoLivro();
        produto.setNome("Produto Livro");
        assertEquals("Produto Livro", produto.getNome());
    }

    @Test
    void precoBaseValido() {
        ProdutoLivro produto = new ProdutoLivro();
        produto.setPrecoBase(5.0);
        assertEquals(5.0, produto.getPrecoBase());
    }

    @Test
    void precoBaseInvalido() {
        try {
            ProdutoLivro produto = new ProdutoLivro();
            produto.setPrecoBase(-5.0);
        }
        catch (Exception e) {
            assertEquals("preco base invalido", e.getMessage());
        }
    }

    @Test
    void calculaPreco() {
        ProdutoLivro produto = new ProdutoLivro();
        produto.setPrecoBase(10.0);
        assertEquals(9.5,produto.calcularPreco());
    }



}