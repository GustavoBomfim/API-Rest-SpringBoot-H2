package com.Attornatus.APIRestH2db.service;

import com.Attornatus.APIRestH2db.entity.Endereco;
import com.Attornatus.APIRestH2db.entity.Pessoa;
import com.Attornatus.APIRestH2db.repository.EnderecoRepository;
import com.Attornatus.APIRestH2db.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {
    @Autowired
    PessoaRepository pessoaRepository;

    @Autowired
    EnderecoRepository enderecoRepository;

    public Endereco salvarEndereco(Endereco endereco){
        return enderecoRepository.save(endereco);
    }
}
