package com.batista.services;

import com.batista.dao.IProdutoDAO;
import com.batista.domain.Produto;
import com.batista.services.generic.GenericService;


public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
