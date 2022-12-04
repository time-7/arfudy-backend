package com.arfudy.backend.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ingrediente")
public class Ingrediente implements Serializable {

    @Id
    @Column(name = "id_ingrediente")
    private Integer idIngrediente;

    @Column(name = "nome", length = 255)
    private String nome;

}
