/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.desafio2.tipoimovelservice.service;

import br.com.desafio2.tipoimovelservice.model.Imovel;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author Paola Zanella
 */
@FeignClient(name = "tipo-imovel-service")
public interface ImovelService {
   @GetMapping(value = "/imoveis/tipo-imovel-service/{idTipoImovel}")
   List<Imovel> listarPeloTipoImovel(@PathVariable("idTipoImovel") Long idTipoImovel);
}
 

