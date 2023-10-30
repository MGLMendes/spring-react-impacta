package br.com.impacta.produtos.controller;

import br.com.impacta.produtos.model.Produto;
import br.com.impacta.produtos.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutoService produtoService;

    @GetMapping("/listar")
    public ResponseEntity<Iterable<Produto>> listarProdutos() {
        return ResponseEntity.ok(produtoService.listar());
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<Produto> cadastrarProduto(@RequestBody Produto produto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoService.cadastrar(produto));
    }
}
