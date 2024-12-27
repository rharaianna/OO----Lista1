package ex3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoEletronicoTest {

    @Test
    void nomeia() {
        ProdutoEletronico produto = new ProdutoEletronico();
        produto.setNome("Produto Eletronico");
        assertEquals("Produto Eletronico", produto.getNome());
    }

    @Test
    void precoBaseValido() {
        ProdutoEletronico produto = new ProdutoEletronico();
        produto.setPrecoBase(5.0);
        assertEquals(5.0, produto.getPrecoBase());
    }

    @Test
    void precoBaseInvalido() {
        try {
            ProdutoEletronico produto = new ProdutoEletronico();
            produto.setPrecoBase(-5.0);
        }
        catch (Exception e) {
            assertEquals("preco base invalido", e.getMessage());
        }
    }

    @Test
    void calculaPreco() {
        ProdutoEletronico produto = new ProdutoEletronico();
        produto.setPrecoBase(10.0);
        assertEquals(9,produto.calcularPreco());
    }


}