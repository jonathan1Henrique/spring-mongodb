package com.spring.mongodb.repository;

import com.spring.mongodb.entities.Funcionario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface FuncionarioRepository extends MongoRepository<Funcionario, String> {

    @Query("{ $and: [ { 'idade': {$gte: ?0} }, { 'idade': {$lte: ?1 } } ] }")
    List<Funcionario> obterPorrangeDeIdade(Integer de, Integer ate);
}
