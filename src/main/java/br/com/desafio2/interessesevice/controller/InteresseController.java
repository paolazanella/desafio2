/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.desafio2.interessesevice.controller;

import br.com.desafio2.interesseservice.model.Interesse;
import br.com.desafio2.interesseservice.model.Interesseldentity;
import br.com.desafio2.interesseservice.repository.InteresseRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
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
@RestController
@RequestMapping("/interesses")
public class InteresseController {
     @Autowired
    private InteresseRepository interesseRepository;
    
    @GetMapping
    public List<Interesse> listarTodos() {
        return interesseRepository.findAll();
    }
     @GetMapping(value = "/{idImovel}/{idCliente}")
    public Optional<Interesse> listarPeloEmprestimoLivro(@PathVariable Long idImovel, @PathVariable Long idCliente) {
        final Interesseldentity identity = new Interesseldentity(idImovel, idCliente);
        return interesseRepository.findById(identity);
    }
    
    @GetMapping(value = "/{idImovel}")
    public Optional<Interesse> listarPeloIdImovel(@PathVariable Long idImovel) {
        return interesseRepository.findByInteresseIdentityIdImovel(idImovel);
    }
    
    @PostMapping
    public Interesse adicionar(@RequestBody Interesse interesse) {
        return interesseRepository.save(interesse);
    }
 @DeleteMapping(value="/{idImovel}/{idCliente}")
    public ResponseEntity deletar(@PathVariable Long idImovel, @PathVariable Long idCliente) {
        final Interesseldentity identity = new Interesseldentity(idImovel, idCliente);
        return interesseRepository.findById(identity)
                .map(record-> {
                    interesseRepository.deleteById(identity);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }
}