package com.Attornatus.APIRestH2db.http.controller;

import com.Attornatus.APIRestH2db.entity.Endereco;
import com.Attornatus.APIRestH2db.entity.Pessoa;
import com.Attornatus.APIRestH2db.service.PessoaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping ("/pessoas")
public class PessoaController {
    @Autowired
    PessoaService pessoaService;
    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    public Pessoa cadastrarPessoa(@RequestBody Pessoa pessoa, Endereco endereco){
        return pessoaService.salvar(pessoa, endereco);
    }

    @GetMapping
    public List<Pessoa> listarPessoas(){
        return pessoaService.listarPessoas();
    }
    @GetMapping("/{id}")
    public Pessoa listarPessoaPorId(@PathVariable("id") Long id){
        return pessoaService.procurarPessoaPorId(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Pessoa não encontrada"));

    }

    @DeleteMapping("/{id}")
    public void removerPessoaPorId(@PathVariable("id") Long id){
        pessoaService.procurarPessoaPorId(id).map(pessoa -> {
            pessoaService.removerPessoaPorId(pessoa.getId()); return Void.TYPE;
        })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Pessoa não encontrada"));

    }
}
