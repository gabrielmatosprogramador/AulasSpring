package io.github.gabrielmatosprogramador.produtoapi.ProdutosApiApplication.repository;

import io.github.gabrielmatosprogramador.produtoapi.ProdutosApiApplication.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository  extends JpaRepository<Produto, String> {
    List<Produto> findByNome (String nome);
}
