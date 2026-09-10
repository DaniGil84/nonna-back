package br.com.nonna_back.services;

import br.com.nonna_back.models.Produto;
import br.com.nonna_back.repositores.ProdutoRepository;
import org.apache.coyote.BadRequestException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    private final ProdutoRepository repository;

    ProdutoService(ProdutoRepository repository) {
        this.repository = repository;

    }

    public List<Produto> getTodosProdutos() {
        return this.repository.getTodosProdutos();
    }

    public void criarProduto(Produto produto) {
        produto.setId("");

        if (produto.getDescricao() == null || produto.getNome().trim().isEmpty()){
            throw new IllegalArgumentException("Descrição não pode ficar vazio!");
        }
        produto.setNome(produto.getNome().trim());

        if (produto.getPreco() == null || produto.getPreco().intValue() <=0){
            throw new IllegalArgumentException("Preço deve ser maior que ZERO!");
        }

        if (produto.getCategoria() == null || (produto.getCategoria().trim()).isEmpty()){
            throw new IllegalArgumentException("Categoria não pode ser vazia!");
        }
        produto.setCategoria(produto.getCategoria().trim());

        this.repository.criarProduto(produto);
    }
}
