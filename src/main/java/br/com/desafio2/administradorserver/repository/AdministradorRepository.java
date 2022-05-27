/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.desafio2.administradorserver.repository;

import br.com.desafio2.administradorserver.model.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Paola Zanella
 */
@Repository
public interface AdministradorRepository extends JpaRepository<Administrador, Long> {
    
}
