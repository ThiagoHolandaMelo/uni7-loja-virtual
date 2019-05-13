package br.com.thiago.negocio.utils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import br.com.thiago.negocio.models.Produto;

@Startup
@Singleton
public class InfoBean {

	private List<Produto> produtos;

	@PostConstruct
	public void inicializar() {
		inicializarProdutos();
	}

	private void inicializarProdutos() {
		produtos = new ArrayList<>();
		
		produtos.add(new Produto(1L, "Arroz", BigDecimal.ONE));
		produtos.add(new Produto(2L, "Feijao", BigDecimal.ONE));
		produtos.add(new Produto(3L, "Macarrao", BigDecimal.ONE));
		produtos.add(new Produto(4L, "Batata", BigDecimal.ONE));
		
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

}
