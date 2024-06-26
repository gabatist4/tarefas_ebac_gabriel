package com.batista.service;

import com.batista.dao.IContratoDao;

public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "Sucesso";
    }

    @Override
    public String excluir() {
        contratoDao.buscar();
        return "Sucesso";
    }

    @Override
    public String atualizar() {
        contratoDao.buscar();
        return "Sucesso";
    }
}
