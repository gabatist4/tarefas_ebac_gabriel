package com.batista.dao;

public class ClienteDao implements IClienteDao {

    public String salvar() {
        throw new UnsupportedOperationException("Não funciona sem config de banco");
        //return "Sucesso";
    }

    @Override
    public String buscar() {
        return "";
    }

    @Override
    public String excluir() {
        return "";
    }

    @Override
    public String atualizar() {
        return "";
    }
}
