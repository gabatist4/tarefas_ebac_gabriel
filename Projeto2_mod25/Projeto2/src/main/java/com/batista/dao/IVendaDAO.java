package com.batista.dao;

import com.batista.dao.generic.IGenericDAO;
import com.batista.domain.Venda;
import com.batista.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
