package com.Attornatus.APIRestH2db.service;

import com.Attornatus.APIRestH2db.entity.Endereco;
import com.Attornatus.APIRestH2db.entity.Pessoa;
import com.Attornatus.APIRestH2db.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {
    @Autowired
    PessoaRepository pessoaRepository;

    public Pessoa salvar(Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }

    public List<Pessoa> listarPessoas() {
        return pessoaRepository.findAll();
    }

    public Optional <Pessoa> procurarPessoaPorId(Long id) {
        return pessoaRepository.findById(id);
    }

    public void removerPessoaPorId(Long id) {
        pessoaRepository.deleteById(id);
    }
}
