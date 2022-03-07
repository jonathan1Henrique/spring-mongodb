package com.spring.mongodb.service;

import com.spring.mongodb.entities.Funcionario;

import java.util.List;

public interface IFuncionarioService {

    List<Funcionario> obterTodos();

    Funcionario obterPorCodigo(String codigo);

    Funcionario criar(Funcionario funcionario);

    List<Funcionario> obterPorRangeDeIdade(Integer de, Integer ate);
}
