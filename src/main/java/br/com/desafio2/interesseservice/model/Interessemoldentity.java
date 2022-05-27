/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.desafio2.interesseservice.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Paola Zanella
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Interessemoldentity implements Serializable {
    @Column(name="id_imovel")
    private Long idImovel;
    
    @Column(name="id_cliente")
    private Long idCliente;
}
