/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.desafio2.imovelserver.repository;

import br.com.desafio2.imovelserver.model.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Paola Zanella
 */
@Repository
public interface ImovelRepository extends JpaRepository<Imovel, Long>{
    
}
