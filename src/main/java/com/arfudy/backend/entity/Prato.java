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
@Table(name = "prato")
public class Prato implements Serializable {

    @Id
    @Column(name = "id_prato")
    private Integer idPrato;

    @Column(name = "ds_prato", length = 255)
    private String dsPrato;

    @Column(name = "nome", length = 255)
    private String nome;

    @Column(name = "imagem", length = 255)
    private String imagem;

    @Column(name = "has3d")
    private Boolean has3d;

    @Column(name = "valor")
    private Double valor;

    @Column(name = "valor_nutricional")
    private Double valorNutricional;

}
