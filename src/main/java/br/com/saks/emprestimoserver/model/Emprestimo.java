/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.saks.emprestimoserver.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import lombok.Data;

/**2
 *
 * @author Paola Zanella
 */
@Entity
@Data 
    
public class Emprestimo {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
       private Long id;
@Column(nullable = false, name="id_usuario")
       private Long idUsuario;
@Column(name="data_retirada") 
@Temporal(javax.persistence.TemporalType.DATE)
        private Date dataRetirada;
@Column(nullable = false)
       private Integer status;
    
}
