package com.arfudy.backend.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "ingrediente_prato", joinColumns = @JoinColumn(name = "id_prato"), inverseJoinColumns = @JoinColumn(name = "id_ingrediente"))
    private List<Ingrediente> ingredienteList;
}
