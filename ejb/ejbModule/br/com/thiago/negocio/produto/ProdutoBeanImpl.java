package br.com.thiago.negocio.produto;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.thiago.negocio.models.Produto;
import br.com.thiago.negocio.utils.InfoBean;

@Stateless
public class ProdutoBeanImpl implements ProdutoBean{
	
	@EJB
	private InfoBean infoBean;
	
	public List<Produto> listar() {
		return infoBean.getProdutos();
	}

}
