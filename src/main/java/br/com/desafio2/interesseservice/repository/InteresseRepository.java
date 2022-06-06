/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.desafio2.interesseservice.repository;

import br.com.desafio2.interesseservice.model.Interesse;
import br.com.desafio2.interesseservice.model.InteresseIdentity;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Paola Zanella
 */
@Repository
public interface InteresseRepository extends JpaRepository<Interesse, InteresseIdentity >{
    //O Spring JPA irá analisar automaticamente o nome do método e criar uma consulta a partir dele.
    Optional<Interesse> findByInteresseldentityIdImovel(Long idImovel);
}