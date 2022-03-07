package com.spring.mongodb.controller;

import com.spring.mongodb.entities.Funcionario;
import com.spring.mongodb.service.IFuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private IFuncionarioService service;

    @GetMapping
    public List<Funcionario> obterTodos(){
        return service.obterTodos();
    }

    @GetMapping("/{codigo}")
    public Funcionario obterPorCodigo(@PathVariable String codigo){

        return service.obterPorCodigo(codigo);
    }

    @PostMapping
    public Funcionario criar(@RequestBody Funcionario funcionario){

        return service.criar(funcionario);
    }

    @GetMapping("/range")
    public List<Funcionario> criar(@RequestParam ("de") Integer de,
                                   @RequestParam ("ate") Integer ate){

        return service.obterPorRangeDeIdade(de,ate);
    }

}
