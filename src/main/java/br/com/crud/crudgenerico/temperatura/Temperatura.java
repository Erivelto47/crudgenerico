package br.com.crud.crudgenerico.temperatura;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "temperatura")
public class Temperatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", length = 100)
    private String nome;

    @Column(name = "descricao", length = 200)
    private String descricao;
}