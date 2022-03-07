package com.spring.mongodb.service.impl;

import com.spring.mongodb.entities.Funcionario;
import com.spring.mongodb.repository.FuncionarioRepository;
import com.spring.mongodb.service.IFuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioServiceImpl implements IFuncionarioService {

    @Autowired
    private FuncionarioRepository repository;

    @Override
    public List<Funcionario> obterPorRangeDeIdade(Integer de, Integer ate) {
        return repository.obterPorrangeDeIdade(de, ate);
    }

    @Override
    public List<Funcionario> obterTodos() {
        return repository.findAll();
    }

    @Override
    public Funcionario obterPorCodigo(String codigo) {

        return repository.findById(codigo).orElseThrow();
    }

    @Override
    public Funcionario criar(Funcionario funcionario) {

        return repository.save(funcionario);
    }
}
