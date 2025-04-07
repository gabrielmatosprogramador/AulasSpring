package io.github.gabrielmatosprogramador.produtoapi.ProdutosApiApplication.controller;

import io.github.gabrielmatosprogramador.produtoapi.ProdutosApiApplication.model.Produto;
import io.github.gabrielmatosprogramador.produtoapi.ProdutosApiApplication.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    public ProdutoController (ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public void salvar(@RequestBody Produto produto) {
        System.out.println("Produto salvo: " + produto.getNome());

        var id = UUID.randomUUID().toString();
        produto.setId(id);

        produtoRepository.save(produto);
    }

    @GetMapping("/{id}")
    public Produto obterPorId(@PathVariable("id") String id){
        return produtoRepository.findById(id).orElse(null);
    }

}
