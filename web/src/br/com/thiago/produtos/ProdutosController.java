package br.com.thiago.produtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import br.com.thiago.negocio.produto.ProdutoBean;
import br.com.thiago.negocio.models.Produto;

@Stateless
@LocalBean
public class ProdutosController  implements Serializable  {
	
	private static final long serialVersionUID = -2119056742065360058L;
	
	@EJB
	private ProdutoBean bean;
	
	public List<Produto> listar(){		
		return bean.listar();
	}

}
