package br.edu.famper.projetos.model;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "tbl_projeto")
@Data
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "projeto_id")
    private Long codigo;

    @Column(name = "nome", length = 75)
    private String nome;

    @Column(name = "descricao", length = 150)
    private String descricao;

    @Column(name = "data inicio")
    private LocalDate dataInicio;

    @Column(name = "data fim")
    private LocalDate dataFim;
}