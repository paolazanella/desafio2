/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.saks.emprestimoserver.controller;

import br.com.saks.emprestimoserver.model.Emprestimo;
import br.com.saks.emprestimoserver.repository.EmprestimoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author Paola Zanella
 */
public class EmprestimoController {
     
    @Autowired
    private EmprestimoRepository livroRepository;
    
    @GetMapping
    public List<Emprestimo> listarTodos() {
        return livroRepository.findAll();
    }
    
    @GetMapping(value="/{id}")
    public Optional<Emprestimo> listarPeloId(@PathVariable Long id) {
        return livroRepository.findById(id);
    }
    
    @PostMapping
    public Emprestimo adicionar(@RequestBody Emprestimo livro) {
        return livroRepository.save(livro);
    }
    
 
   
    
}