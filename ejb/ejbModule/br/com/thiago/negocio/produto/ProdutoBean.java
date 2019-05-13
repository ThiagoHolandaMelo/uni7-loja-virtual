package br.com.thiago.negocio.produto;

import java.util.List;

import javax.ejb.Local;

import br.com.thiago.negocio.models.Produto;

@Local
public interface ProdutoBean {

	List<Produto> listar();

}
