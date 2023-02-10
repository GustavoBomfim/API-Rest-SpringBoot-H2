package com.Attornatus.APIRestH2db.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Pessoa {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "dataDeNascimento", nullable = false)
    private String dataDeNascimento;

    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @Column(nullable = false)
    private List<Endereco> enderecos;

    public void adicionarEndereco(Endereco endereco){
        this.enderecos.add(endereco);
    }
}
