/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.desafio2.interesseservice.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import lombok.Data;

/**
 *
 * @author Paola Zanella
 */
@Data
@Entity
public class Interesse {
     @EmbeddedId
     private InteresseIdentity interesseldentity;
}
