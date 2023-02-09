package com.Attornatus.APIRestH2db.service;

import com.Attornatus.APIRestH2db.entity.Endereco;
import com.Attornatus.APIRestH2db.entity.Pessoa;
import com.Attornatus.APIRestH2db.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {
    @Autowired
    PessoaRepository repository;

    public Pessoa salvar(Pessoa pessoa, Endereco endereco){
        return repository.save(pessoa);
    }

}
