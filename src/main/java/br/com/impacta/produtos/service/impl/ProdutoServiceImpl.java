package br.com.impacta.produtos.service.impl;

import br.com.impacta.produtos.model.Produto;
import br.com.impacta.produtos.repository.ProdutoRepository;
import br.com.impacta.produtos.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepository produtoRepository;

    @Override
    public Iterable<Produto> listar() {
        return produtoRepository.findAll();
    }

    @Override
    public Produto cadastrar(Produto produto) {
        return produtoRepository.save(produto);
    }
}
