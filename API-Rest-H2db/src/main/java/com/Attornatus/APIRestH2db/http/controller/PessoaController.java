package com.Attornatus.APIRestH2db.http.controller;

import com.Attornatus.APIRestH2db.entity.Endereco;
import com.Attornatus.APIRestH2db.entity.Pessoa;
import com.Attornatus.APIRestH2db.service.PessoaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/pessoas")
public class PessoaController {
    @Autowired
    PessoaService pessoaService;
    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    public Pessoa cadastrar(@RequestBody Pessoa pessoa, Endereco endereco){
        return pessoaService.salvar(pessoa, endereco);
    }
}
