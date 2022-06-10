/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.desafio2.imovelserver.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import lombok.Data;

/**
 *
 * @author Paola Zanella
 */
@Entity
@Data
public class Imovel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  
    @Transient
    TipoImovel tipoImovel;

    @Column(nullable = false, name = "id_tipo_imovel")
    private Long idTipoImovel;
    
    @Column(nullable = false, length = 100)
    private String titulo;

    @Column(nullable = false, length = 500)
    private String descricao;

    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data_criacao;

    @Column(nullable = false, length = 2)
    private Float valor;

    @Column(nullable = false)
    private Integer status;

}
