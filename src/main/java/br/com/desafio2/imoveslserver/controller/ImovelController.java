/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.desafio2.imoveslserver.controller;

import br.com.dasafio2.imovelserver.repository.ImovelRepository;
import br.com.desafio2.imovelserver.model.Imovel;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Paola Zanella
 */
public class ImovelController {
    @Autowired
    private ImovelRepository imovelRepository;
    
       @GetMapping
    public List<Imovel> listarTodos() {
        return imovelRepository.findAll();
    }
    
    @GetMapping(value="/{id}")
    public Optional<Imovel> listarPeloId(@PathVariable Long id) {
        return imovelRepository.findById(id);
    }
    
    @PostMapping
    public Imovel adicionar(@RequestBody Imovel imovel) {
        return imovelRepository.save(imovel);
    }
    
    
}
