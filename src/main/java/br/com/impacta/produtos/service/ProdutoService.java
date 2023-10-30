package br.com.impacta.produtos.service;

import br.com.impacta.produtos.model.Produto;

public interface ProdutoService {

    Iterable<Produto> listar();

    Produto cadastrar(Produto produto);

    Produto atualizar(Produto produto, Long id);
}
